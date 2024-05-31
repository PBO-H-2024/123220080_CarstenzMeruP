/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class View {
//    public double writing, coding, interview, score;
    public String selectedName = "";
    int totalData;
    String data[][] = new String[25][7];
    
    Controller controller = new Controller();
    
    JFrame window = new JFrame("Read Data Student");
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object columnName[] = {
        "Name", "Path", "Writing", "Coding", "Interview", "Score", "Status"
    };
    
    JLabel lName = new JLabel("NAME");
    JTextField fName = new JTextField();
    
    JLabel lpath = new JLabel("PATH");
    String pathChoice[] = { "android developer", "web developer"};
    JComboBox fpath = new JComboBox(pathChoice);
    
    JLabel lwriting = new JLabel("Writing");
    JTextField fwriting = new JTextField();
    
    JLabel lcoding = new JLabel("CODING");
    JTextField fcoding = new JTextField();
    
    JLabel linterview = new JLabel("INTERVIEW");
    JTextField finterview = new JTextField();

    JButton btnAdd = new JButton("ADD");
    JButton btnUpdate = new JButton("UPDATE");
    JButton btnDelete = new JButton("DELETE");
    JButton btnClear = new JButton("CLEAR");
        
    public View(){
        tableModel = new DefaultTableModel(columnName, 0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
      
        window.setLayout(null);
        window.setSize(900, 600);
//        window.setDefaultCloseOperation(3);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        window.add(scrollPane);
        window.add(btnAdd);
        window.add(btnUpdate);
        window.add(btnDelete);
        window.add(btnClear);
        scrollPane.setBounds(20, 35, 600, 450);
        btnAdd.setBounds(650, 330, 120, 20);
        btnUpdate.setBounds(650, 360, 120, 20);
        btnDelete.setBounds(650, 390, 120, 20);
        btnClear.setBounds(650, 420, 120, 20);
        
         window.add(lName);
        window.add(lpath);
        window.add(lwriting);
        window.add(lcoding);
        window.add(linterview);
        window.add(fName);
        window.add(fpath);
        window.add(fwriting);
        window.add(fcoding);
        window.add(finterview);


        lName.setBounds(650, 35, 120, 20);
        lpath.setBounds(650, 85, 120, 20);
        lwriting.setBounds(650, 135, 120, 20);
        lcoding.setBounds(650, 185, 120, 20);
        linterview.setBounds(650, 235, 120, 20);

        
        fName.setBounds(650, 60, 160, 20);
        fpath.setBounds(650, 110, 160, 20);
        fwriting.setBounds(650, 160, 160, 20);
        fcoding.setBounds(650, 210, 160, 20);
        finterview.setBounds(650, 260, 160, 20);

        
        
        
        data = controller.readData();
        
        tabel.setModel((new JTable(data, columnName)).getModel());
        
        tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try{
                    super.mouseClicked(e);
                    int row = tabel.getSelectedRow();
                    int column = tabel.getSelectedColumn();

                    selectedName = tabel.getValueAt(row,0).toString();

                    System.out.println(selectedName);
                }catch(Exception ex){
                    System.out.println("selected row have no data");
                }

            }
        });
        
        btnAdd.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.insertData(fName.getText(), fpath.getSelectedItem().toString(), Double.parseDouble(fwriting.getText()), Double.parseDouble(fcoding.getText()), Double.parseDouble(finterview.getText()));
            data = controller.readData();
            tabel.setModel((new JTable(data, columnName)).getModel());
        }
        });
        
        btnUpdate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(selectedName == ""){
                JOptionPane.showMessageDialog(null, "Please select something");
            }else{
                controller.updateData(fName.getText(), fpath.getSelectedItem().toString(), Double.parseDouble(fwriting.getText()), Double.parseDouble(fcoding.getText()), Double.parseDouble(finterview.getText()), selectedName);   
            }
            data = controller.readData();
            tabel.setModel((new JTable(data, columnName)).getModel());
          }
        });
        
        btnDelete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(selectedName == ""){
                JOptionPane.showMessageDialog(null, "Please select something");
            }else{
                controller.deleteData(selectedName); 
            }  
            data = controller.readData();
            tabel.setModel((new JTable(data, columnName)).getModel());
         }
        });
        
        btnClear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            fName.setText("");
            fwriting.setText("");
            fcoding.setText("");
            finterview.setText("");
         }
        });
        
    }
}