/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miditest2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Mark
 */
public class Aframe extends JFrame{
    
    
    //int height;// = Space.height;
    //int width;// = Space.width;
     int height = (int)Space.height;
    int width = (int)Space.width;   
    
   
    JPanel gamePanel;// = new JPanel();
    
    
   
    StartPanel startPanel;// = new StartPanel();
    
   
    
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    TeamPanel1 teamPanel1;
    TeamPanel2 teamPanel2;
    TeamPanel3 teamPanel3;
    TeamPanel4 teamPanel4;
    TeamPanel5 teamPanel5;
    TeamPanel6 teamPanel6;
    TeamPanel7 teamPanel7;
    */
    
    ////////////////////////////////////////////////////////////////////////////////////////////
    
    public Aframe(){
        
		super ("BES Particle Simulator");
                getContentPane().setLayout(new BorderLayout());
                getRootPane().setDoubleBuffered(true);  // omg please work
                setExtendedState(JFrame.MAXIMIZED_BOTH);//setSize (width, height);
                width = this.getWidth();
                height = this.getHeight();
                startPanel = new StartPanel();
		getContentPane().add(startPanel,"Center");
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
                
        }
    
    
    public void startPanel(){
        
        getContentPane().removeAll();
        
                startPanel = new StartPanel();
                
		getContentPane().add(startPanel,"Center");
                
		setVisible(true);
     
        
    }
    

    
    
    
     public void start(){
         
                getContentPane().remove(startPanel);
                gamePanel = new JPanel();
                getContentPane().add(gamePanel,"Center");
                setVisible(true);
                //gamePanel.helio.requestFocus();
        
    }   
     


     
     public void restart(){
         
                getContentPane().remove(gamePanel);
                Space.playMidiMusicNumber = 0;
                gamePanel = new JPanel();
                getContentPane().add(gamePanel, "Center");
                setVisible(true);
             //   gamePanel.helio.requestFocus();
        
    }
 
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////    
  // team methods   
       /*
     public void start1(){
         
                getContentPane().remove(startPanel);
            //    teamPanel1 = new TeamPanel1();
            //    getContentPane().add(teamPanel1,"Center");
                setVisible(true);
            //    teamPanel1.helio.requestFocus();
        
    }     
    public void start2(){
         
                getContentPane().remove(startPanel);
                teamPanel2 = new TeamPanel2();
                getContentPane().add(teamPanel2,"Center");
                setVisible(true);
               teamPanel2.helio.requestFocus();
        
    }     
    public void start3(){
         
                getContentPane().remove(startPanel);
                teamPanel3 = new TeamPanel3();
                getContentPane().add(teamPanel3,"Center");
                setVisible(true);
               teamPanel3.helio.requestFocus();
        
    }     
    public void start4(){
         
                getContentPane().remove(startPanel);
                teamPanel4 = new TeamPanel4();
                getContentPane().add(teamPanel4,"Center");
                setVisible(true);
               teamPanel4.helio.requestFocus();
        
    }     
    public void start5(){
         
                getContentPane().remove(startPanel);
                teamPanel5 = new TeamPanel5();
                getContentPane().add(teamPanel5,"Center");
                setVisible(true);
                teamPanel5.helio.requestFocus();
        
    }     
    public void start6(){
         
                getContentPane().remove(startPanel);
                teamPanel6 = new TeamPanel6();
                getContentPane().add(teamPanel6,"Center");
                setVisible(true);
                teamPanel6.helio.requestFocus();
        
    }     
    public void start7(){
         
                getContentPane().remove(startPanel);
                teamPanel7 = new TeamPanel7();
                getContentPane().add(teamPanel7,"Center");
                setVisible(true);
                teamPanel7.helio.requestFocus();
        
    }     
     */
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

    
    
    
    
    
    
    public void display() {
        GraphicsEnvironment env =
            GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice dev = env.getDefaultScreenDevice();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        setResizable(false);
        setUndecorated(true);
        add(this);
        pack();
        dev.setFullScreenWindow(this);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}  // end
