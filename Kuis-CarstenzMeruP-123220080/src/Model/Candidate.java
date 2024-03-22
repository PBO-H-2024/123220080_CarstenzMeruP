/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ACER
 */
public class Candidate {
    String name;
    String nim;
    boolean web;
    boolean mobile;
    public boolean choose;
    int writing;
    int coding;
    int interview;
    public double avg;
    public boolean accepted;
    
    public Candidate(String name, String nim, boolean web, boolean mobile, int writing, int coding, int interview){
        this.name = name;
        this.nim = nim;
        this.web = web;
        this.mobile = mobile;
        this.writing = writing;
        this.coding = coding;
        this.interview = interview;
        
        //calculate avg score
        if(this.mobile){
            this.choose = true;
            this.avg = writing * 0.2 + coding * 0.5 + interview * 0.3;
        } else if(this.web){
            this.choose = true;
            this.avg = writing * 0.4 + coding * 0.35 + interview * 0.25;
        } else {
            System.out.println("pls input your division");
        }
        
        //accepted is true if avg is more then 85
        accepted = (avg > 85);
    }
    
}
