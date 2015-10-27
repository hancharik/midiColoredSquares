/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miditest2;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

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
                addComponents();
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
           
        iLabel = new JLabel("<html><h2><font color='white'>X Velocity = </font><font color='red'>" + "</font><h2></html>");
        jLabel = new JLabel("<html><h2><font color='white'>X Velocity = </font><font color='red'>"  + "</font><h2></html>");
        kLabel = new JLabel("<html><h2><font color='white'>X Velocity = </font><font color='red'>"  + "</font><h2></html>");
        iLabel.setBounds(20, 60, 300, 60);
        jLabel.setBounds(20, 140, 300, 60);
        kLabel.setBounds(20, 240, 300, 68);
         notecards = new ArrayList();
         p = new JPanel();
        setSize (1200, 1000);
         p.setLayout(null);
         p.setBackground(Color.blue);
        JButton b = new JButton();
        notecards.add(b);
       // b.setBounds(60, 60, 20, 20);
       // b.setBackground(Color.green);
       // p.add(b);
        p.add(iLabel);
        p.add(jLabel);
        p.add(kLabel);
        
      
      
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
       
 public void playRandomStuff(){
     
                int instrument;
        int bank;
        int note;
        int note1;
        int volume;
        int pause;
        int yAxis;
            try {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();

        MidiChannel[] channels = synthesizer.getChannels();

        
        /*
        //http://stackoverflow.com/questions/30718831/midi-midimessage-program-change-with-instrument-from-different-bank
      
        MidiChannel channel = synthesizer.getChannels()[0];
if (channel != null) {
    channel.programChange(bank, instrument);
    channel.noteOn(70, 100);
}
        
        
        */
        
        for(int j = 0; j < 10; j++){
        for(int i = 0; i < 10; i++){
        for(int k = 110; k < 128; k++){    
         note = (int) (Math.random() * 100) + 1; 
         note1 = (int) (Math.random() * 100) + 1; 
         pause = (int) (Math.random() * 1200) + 1; 
         volume = (int) (Math.random() * 10) + 70;
         instrument = (int) (Math.random() * 125) + 1;
        bank = (int) (Math.random() * 10) + 1;   
         
         
         // bank zero, instrument 25 is the 808
        channels[0].programChange(1024 ,instrument );
        channels[0].noteOn( note, volume);
       
        JButton b = new JButton();
        b.setBorderPainted(false);
        b.setOpaque(true);
        this.notecards.add(b);
         this.notecards.get(i).setBounds( volume*11, 900-(note*9), 20, 20);
         this.setColor(this.notecards.get(i), note);
         this.p.add(b);
         channels[1].programChange(0 ,instrument);
        channels[1].noteOn( note1, volume);
         this.iLabel.setText("<html><h2><font color='white'>instrument = </font><font color='yellow'>" + (114 + i) + "</font><h2></html>");
      // http://www.java2s.com/Tutorial/Java/0240__Swing/SetFontandforegroundcolorforaJLabel.htm
         this.iLabel.setFont(new Font("Courier New", Font.BOLD, 22));
         this.jLabel.setText("<html><h2><font 'times new roman'color='white'>bank = </font><font color='blue'>"  + 0 + "</font><h2></html>");
         this.jLabel.setFont(new Font("Courier New", Font.BOLD, 22));
        this.kLabel.setText("<html><h2><font color='white'>note = </font><font color='green'>"  +  note + "</font><h2></html>");
        this.kLabel.setFont(new Font("Courier New", Font.BOLD, 22));
          JButton bz = new JButton();
        bz.setBorderPainted(false);
        bz.setOpaque(true);
        this.notecards.add(bz);
         this.notecards.get(i+1).setBounds( volume*10, 900-(note1*8), 20, 20);
         this.setColor(this.notecards.get(i+1), note1);
         this.p.add(bz);
          this.p.repaint();
          //this.pack();
        Thread.sleep(pause);
        channels[0].noteOff(note);
        channels[1].noteOff(note1);
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
        this.notecards.add(b);
         this.notecards.get(i).setBounds( volume*11, 900-(note*9), 20, 20);
         this.setColor(this.notecards.get(i), note);
         
          this.p.add(b);
          this.p.repaint();
          //this.pack();
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
  
     
     
       public void showAvailableInstruments() throws MidiUnavailableException {
           try{
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        Instrument[] orchestra = synthesizer.getAvailableInstruments();

        final StringBuilder sb = new StringBuilder();
        String eol = System.getProperty("line.separator");
        sb.append("The orchestra has ");
        sb.append(orchestra.length);
        sb.append(" instruments.");
        sb.append(eol);
        for (Instrument instrument : orchestra) {
            sb.append(instrument.toString());
            sb.append(eol);
        }
        synthesizer.close();

        Runnable r = new Runnable() {

            @Override
            public void run() {
                JOptionPane.showMessageDialog(null,
                        new JScrollPane(new JTextArea(sb.toString(), 20, 30)));
            }
        };
        SwingUtilities.invokeLater(r);
        } catch (Exception e)
    {
        e.printStackTrace();
    }
    }  
     
       
       
       
} // end
