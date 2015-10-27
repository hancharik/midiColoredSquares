/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miditest2;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Mark
 */
public class MidiFrame extends JFrame{
    
    
     ArrayList <JButton> notecards = new ArrayList();
        
        JPanel p = new JPanel();
    JLabel iLabel;
    JLabel jLabel;
    JLabel kLabel;
    
    
    
    
       public MidiFrame (){
            
           
           
           
            
		super ("MIDI sound dojo");
                
                 notecards = new ArrayList();
                
                 p.setBackground(Color.black);
		
           // p = new JPanel();
            this.getContentPane().add(p,"Center");
            setSize (1200, 1000);
            setVisible(true);
            //town.me.requestFocusInWindow();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setSize (townWidth, townHeight);
		//setVisible(true);
                //this.requestFocus();  // had to take this out for the main button to get focus, for the KeyListener to work
                
	}  // end constructor
       
       
  public void addComponents(){
           
     // iLabel = new JLabel("i"):
    
       //     jLabel;
    
   // kLabel;

         notecards = new ArrayList();
         p = new JPanel();
        setSize (1200, 1000);
         p.setLayout(null);
         p.setBackground(Color.blue);
        JButton b = new JButton();
        notecards.add(b);
        b.setBounds(60, 60, 20, 20);
        b.setBackground(Color.green);
        p.add(b);
        
      
      
  }     
       
       
       
public void setColor(JButton buttonToColor, int level){
    
    if(level < 20){
            buttonToColor.setBackground(Color.red);
                 
         }
        if(level >= 20 && level < 30){
            buttonToColor.setBackground(Color.magenta);
                 
         }
         if(level >= 30 && level< 40){
            buttonToColor.setBackground(Color.blue);
                 
         }
          if(level >= 40 && level < 50){
            buttonToColor.setBackground(Color.green);
                 
         }
           if(level >= 50 && level < 60){
            buttonToColor.setBackground(Color.yellow);
                 
         }
           
           if(level >= 60 && level <= 70){
            buttonToColor.setBackground(Color.orange);
                 
         }
     if(level > 70){
            buttonToColor.setBackground(Color.white);
                 
         }
    
}       
       
       
       
       
} // end
