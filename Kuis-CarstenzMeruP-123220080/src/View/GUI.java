/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import javax.swing.*;

/**
 *
 * @author ACER
 */
public class GUI extends JFrame{
    //name input
    JLabel lname = new JLabel("Name : ");
    public JTextField fname = new JTextField();
    
    //name input
    JLabel lnim = new JLabel("NIM : ");
    public JTextField fnim = new JTextField();
    
    //division input (radio)
    JLabel ldivision = new JLabel("division : ");
    public JRadioButton rmobile = new JRadioButton("mobile");
    public JRadioButton rweb = new JRadioButton("web");
    
    //scores input
    JLabel lscores = new JLabel("TEST SCRORES");
    JLabel lwriting = new JLabel("writing exam");
    public JTextField fwriting = new JTextField();
    JLabel lcoding = new JLabel("coding test");
    public JTextField fcoding = new JTextField();
    JLabel linterview = new JLabel("interview test");
    public JTextField finterview = new JTextField();
    
    public JButton bsubmit = new JButton("submit");
    
    JLabel result = new JLabel("RESULT : ");
    public JLabel accepted = new JLabel(" ");
    public JLabel avg = new JLabel(" ");
    
    
    public GUI(){
        setTitle("internship program");
        setSize(500,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rmobile);
        group.add(rweb);
        
        add(lname);
        add(fname);
        add(lnim);
        add(fnim);
        
        add(ldivision);
        add(rmobile);
        add(rweb);
        
        add(lscores);
        add(lwriting);
        add(fwriting);
        add(lcoding);
        add(fcoding);
        add(linterview);
        add(finterview);
        
        add(bsubmit);
        
        add(result);
        add(accepted);
        add(avg);
        
        
        lname.setBounds(10, 10, 50, 20);
        fname.setBounds(55, 12, 150, 20);
        lnim.setBounds(260, 10, 50, 20);
        fnim.setBounds(300, 12, 150, 20);
        
        ldivision.setBounds(10, 50, 100, 20);
        rmobile.setBounds(80, 50, 70, 20);
        rweb.setBounds(160, 50, 50, 20);
        
        lscores.setBounds(10, 100, 100, 20);
        lwriting.setBounds(50, 130, 100, 20);
        fwriting.setBounds(60, 160, 50, 20);
        lcoding.setBounds(150, 130, 100, 20);
        fcoding.setBounds(160, 160, 50, 20);
        linterview.setBounds(250, 130, 100, 20);
        finterview.setBounds(260, 160, 50, 20);
        
        bsubmit.setBounds(10, 220, 100, 20);
        
        result.setBounds(10, 270, 100, 20);
        accepted.setBounds(30, 300, 150, 20);
        avg.setBounds(30, 320, 200, 20);
    }
    
    
    
}
