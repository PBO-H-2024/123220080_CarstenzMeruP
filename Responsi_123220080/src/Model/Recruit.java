/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import Main.Connector;
/**
 *
 * @author ACER
 */
public class Recruit extends Connector{
    public void insertData(String name, String path, double writing, double coding, double interview){
        try{
            double score = path == "android development"? writing * 0.2 + coding * 0.5 + interview * 0.3 : writing * 0.4 + coding * 0.35 + interview * 0.25;
            String status = score >= 85? "accepted" : "not accepted";
            String query = "INSERT INTO recruitment VALUES ('" + name + "','" + path + "','" + writing + "','" + coding + "','" + interview + "','" + score + "','" + status + "')";
            
            statement = conn.createStatement();
            statement.executeUpdate(query);
            
            System.out.println("Input Success");
        }catch(Exception ex){
            System.out.println("Input Failed " + ex.getMessage());
        }
    }
    
    public String[][] readData(){
        String data[][] = new String[25][7]; 
        try{
            int totalData = 0;
            String query = "SELECT * FROM recruitment";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                data[totalData][0] = resultSet.getString("name");
                data[totalData][1] = resultSet.getString("path");
                data[totalData][2] = resultSet.getString("writing");
                data[totalData][3] = resultSet.getString("coding");
                data[totalData][4] = resultSet.getString("interview");
                data[totalData][5] = resultSet.getString("score");
                data[totalData][6] = resultSet.getString("status");
                totalData++;
            }
            statement.close();
        }catch(SQLException e){
            System.out.println("SQL Error" + e.getMessage());
        }finally{
            return data;
        }
    }
    
    public void updateData(String name, String path, double writing, double coding, double interview, String selectedName){
        try{
            double score = path == "android development"? writing * 0.2 + coding * 0.5 + interview * 0.3 : writing * 0.4 + coding * 0.35 + interview * 0.25;
            String status = score >= 85? "accepted" : "not accepted";
            String query = "UPDATE `recruitment` SET name= '" + name+ "',"
                    + " path= '" + path+ "',"
                    + " writing= '" + writing+ "',"
                    + " coding= '" + coding+ "',"
                    + " interview= '" + interview+ "',"
                    + " score= '" + score+ "',"
                    + " status= '" + status+ "' WHERE name = '" + selectedName + "'";
            
            statement = conn.createStatement();
            statement.executeUpdate(query);
            
            System.out.println("Update Success");
        }catch(Exception ex){
            System.out.println("Update Failed : " + ex.getMessage());
        }
    }
    
    public void deleteData(String selectedName){
        try{
            String query = "DELETE FROM recruitment WHERE name='" + selectedName + "'";
//            String query = "DELETE FROM recruitment WHERE name='yes'";
            
            statement = conn.createStatement();
            statement.executeUpdate(query);
            
            System.out.println("Delete Success");
        }catch(Exception ex){
            System.out.println("Delete Failed : " + ex.getMessage());
        }
    }
    
}