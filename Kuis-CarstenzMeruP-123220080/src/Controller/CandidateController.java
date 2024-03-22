/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Candidate;
import View.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author ACER
 */
public class CandidateController {
    GUI view;
    
    public CandidateController (GUI view){
        this.view = view;
        
        view.bsubmit.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                //get value from gui
                String name = view.fname.getText();
                String nim = view.fnim.getText();
                boolean web = view.rweb.isSelected();
                boolean mobile = view.rmobile.isSelected();
                
                //change string to int
                int writing = Integer.valueOf(view.fwriting.getText());
                int coding = Integer.valueOf(view.fcoding.getText());
                int interview = Integer.valueOf(view.finterview.getText());
                
                //create candidate object
                Candidate candidate = new Candidate(name, nim, web, mobile, writing, coding, interview);
                
                
                //set result back to gui
                if(candidate.choose){
                    if(candidate.accepted){
                        view.accepted.setText("ACCEPTED");
                        view.avg.setText("with total score of " + candidate.avg);
                    } else{
                        view.accepted.setText("NOT ACCEPTED");
                        view.avg.setText("your total score is " + candidate.avg);
                    }
                } else{
                    view.accepted.setText("Please select division");
                }
                
            }
        });
    }
}
