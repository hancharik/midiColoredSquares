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
        
        
        
        int note;
        int volume;
        int pause;
        int yAxis;
            try {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();

        MidiChannel[] channels = synthesizer.getChannels();

        for(int i = 0; i < 4000; i++){
         note = (int) (Math.random() * 80) + 1; 
         pause = (int) (Math.random() * 1900) + 100; 
         volume = (int) (Math.random() * 80) + 1;
             
        
        channels[i%15].noteOn(note, volume);
        JButton b = new JButton();
        b.setBorderPainted(false);
        b.setOpaque(true);
        f.notecards.add(b);
         f.notecards.get(i).setBounds( volume*13 + 40, 800-(note*9), 20, 20);
         f.setColor(f.notecards.get(i), note);
         
          f.p.add(b);
          f.p.repaint();
          //f.pack();
        Thread.sleep(pause);
        channels[i%15].noteOff(60);
        
        }
        synthesizer.close();
    } catch (Exception e)
    {
        e.printStackTrace();
    }
    }
  
    

}// end
