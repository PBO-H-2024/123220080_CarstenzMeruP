/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Recruit;
/**
 *
 * @author ACER
 */
public class Controller {
    Recruit recruit = new Recruit();

    public void insertData(String name, String path, double writing, double coding, double interview) {
        recruit.insertData(name, path, writing, coding, interview);
    }
    
     public String[][] readData() {
        return recruit.readData();
    }

    public void updateData(String name, String path, double writing, double coding, double interview, String selectedName) {
        recruit.updateData(name, path, writing, coding, interview, selectedName);
    }
    
    public void deleteData(String selectedName) {
        recruit.deleteData(selectedName);
    }
}