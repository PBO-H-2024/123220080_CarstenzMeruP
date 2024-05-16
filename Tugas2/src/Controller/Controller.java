/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Student;
/**
 *
 * @author ACER
 */
public class Controller {
    Student Student = new Student();

    public void insertData(int nim, String name, int age) {
        Student.insertData(nim, name, age);
    }
    
     public String[][] readData() {
        return Student.readData();
    }

    public void updateData(int id, int nim, String name, int age) {
        Student.updateData(id, nim, name, age);
    }
    
    public void deleteData(int id) {
        Student.deleteData(id);
    }
}
