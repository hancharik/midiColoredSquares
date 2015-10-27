/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miditest2;



import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mark
 */
public class MidiTest2 {

    public static MidiFrame f;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        f = new MidiFrame();
        
        int instrument;
        int bank;
        int note;
        int volume;
        int pause;
        int yAxis;
            try {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();

        MidiChannel[] channels = synthesizer.getChannels();

        
        /*
        
        MidiChannel channel = synthesizer.getChannels()[0];
if (channel != null) {
    channel.programChange(bank, instrument);
    channel.noteOn(70, 100);
}
        
        
        */
        
        for(int j = 0; j < 100; j++){
        for(int i = 0; i < 100; i++){
        for(int k = 10; k < 100; k=k+6){    
         note = (int) (Math.random() * 110) + 1; 
         pause = (int) (Math.random() * 1800) + 200; 
         volume = (int) (Math.random() * 80) + 30;
         instrument = (int) (Math.random() * 25) + 1;
        bank = (int) (Math.random() * 10) + 1;   
         
         
         // bank zero, instrument 25 is the 808
        channels[0].programChange((int) (Math.random() * 25) + 1 , (int) (Math.random() * 25) + 1 );
        channels[0].noteOn( note, volume);
       
        JButton b = new JButton();
        b.setBorderPainted(false);
        b.setOpaque(true);
        f.notecards.add(b);
         f.notecards.get(i).setBounds( volume*11, 900-(note*9), 20, 20);
         f.setColor(f.notecards.get(i), note);
         
          f.p.add(b);
          f.p.repaint();
          //f.pack();
        Thread.sleep(pause);
        channels[0].noteOff(note);
        }
        }
            }
        
        /*
           for(int i = 0; i < 100; i++){
            
         note = (int) (Math.random() * 110) + 1; 
         pause = (int) (Math.random() * 300) + 100; 
         volume = (int) (Math.random() * 110) + 1;
         instrument = (int) (Math.random() * 25) + 1;
        bank = (int) (Math.random() * 10) + 1;   
         
         
         // bank zero, instrument 25 is the 808
        channels[0].programChange(bank , instrument );
        channels[0].noteOn(note, volume);
       
        JButton b = new JButton();
        b.setBorderPainted(false);
        b.setOpaque(true);
        f.notecards.add(b);
         f.notecards.get(i).setBounds( volume*11, 900-(note*9), 20, 20);
         f.setColor(f.notecards.get(i), note);
         
          f.p.add(b);
          f.p.repaint();
          //f.pack();
        Thread.sleep(pause);
        channels[0].noteOff(note);
        
        }
         */  
           
           
        synthesizer.close();
    } catch (Exception e)
    {
        e.printStackTrace();
    }
    }
  
    

}// end
