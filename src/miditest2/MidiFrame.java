/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miditest2;





import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.Instrument;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mark
 */
public class MidiFrame extends JFrame{
    
    
     ArrayList <JButton> notecards = new ArrayList();
        
    //JPanel p = new JPanel();
    MyDrawPanel p;// = new MyDrawPanel();
    JLabel iLabel;
    JLabel jLabel;
    JLabel kLabel;
    JButton showInstruments;
    JButton playRandom;
    JButton playSong;
    JButton stopSong;
    JButton chooseSong;
    String songName = "MachineGun(Live)";
     Sequencer sequencer = null;
            
                 
    
       public MidiFrame (){
            
           
           
           
            
		super ("MIDI sound dojo");
               
                
                //sequencer = null;
                
                  p = new MyDrawPanel();
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
           
        iLabel = new JLabel();
        jLabel = new JLabel();
        kLabel = new JLabel();
        iLabel.setBounds(20, 60, 300, 60);
        jLabel.setBounds(20, 140, 300, 60);
        kLabel.setBounds(20, 240, 300, 68);
        showInstruments = new JButton("show instruments");
        showInstruments.setBounds(20, 20, 160, 40);
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
        showInstruments.addActionListener(new ActionListener() {
 //http://www.javaprogrammingforums.com/java-swing-tutorials/278-how-add-actionlistener-jbutton-swing.html
            public void actionPerformed(ActionEvent e)
            {
              showAvailableInstruments();
                //playRandomStuff();
               // playMidiSong();
            }

            
        });
    /////////////////////////////////////////////////////////////////////////////////////////    
        
                 playRandom = new JButton("play random");
         playRandom.setBounds(200, 20, 160, 40);
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
         playRandom.addActionListener(new ActionListener() {
 //http://www.javaprogrammingforums.com/java-swing-tutorials/278-how-add-actionlistener-jbutton-swing.html
            public void actionPerformed(ActionEvent e)
            {
             // showAvailableInstruments();
                playRandomStuff();
                //playMidiSong();
            }

            
        });
    ///////////////////////////////////////////////////////////////////////////////////////// 
        
                playSong = new JButton("play song");
        playSong.setBounds(400, 20, 160, 40);
        playSong.setVisible(false);
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
        playSong.addActionListener(new ActionListener() {
 //http://www.javaprogrammingforums.com/java-swing-tutorials/278-how-add-actionlistener-jbutton-swing.html
            public void actionPerformed(ActionEvent e)
            {
                try {
                    // showAvailableInstruments();
                    //playRandomStuff();
                    playSong.setVisible(false);
                    stopSong.setVisible(true);
                    playMidiSong();
                } catch (MidiUnavailableException ex) {
                    Logger.getLogger(MidiFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MidiFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidMidiDataException ex) {
                    Logger.getLogger(MidiFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            
        });
    ///////////////////////////////////////////////////////////////////////////////////////// 
        
        
                
                stopSong = new JButton("stop song");
        stopSong.setBounds(600, 20, 160, 40);
        stopSong.setVisible(false);
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
        stopSong.addActionListener(new ActionListener() {
 //http://www.javaprogrammingforums.com/java-swing-tutorials/278-how-add-actionlistener-jbutton-swing.html
            public void actionPerformed(ActionEvent e)
            {
               
                  
                    stopSong.setVisible(false);
                    chooseSong.setVisible(true);
                     sequencer.close();
                            
              
            }

            
        });
    ///////////////////////////////////////////////////////////////////////////////////////// 
   
        
        
                   ///////////////////////////////////////////////////////////////////////////////////////// 
        
                chooseSong = new JButton("choose song");
        chooseSong.setBounds(600, 20, 160, 40);
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
        chooseSong.addActionListener(new ActionListener() {
 //http://www.javaprogrammingforums.com/java-swing-tutorials/278-how-add-actionlistener-jbutton-swing.html
            public void actionPerformed(ActionEvent e)
            {
             // showAvailableInstruments();
                //playRandomStuff();
                showChooser();
            }

            
        });
    ///////////////////////////////////////////////////////////////////////////////////////// 
        
         notecards = new ArrayList();
         p = new MyDrawPanel();
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
        p.add(showInstruments);
        p.add(playRandom);
        p.add(playSong);
        p.add(stopSong);
        p.add(chooseSong);
      
      
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
    
}   // end set color    
       
 public void playRandomStuff(){
     
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
        notecards.add(b);
         notecards.get(i).setBounds( volume*13 + 40, 800-(note*9), 20, 20);
         setColor(notecards.get(i), note);
         
          p.add(b);
          p.repaint();
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
  
  
     
     
       public void showAvailableInstruments() {
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
    } // end show available instruments 
     
       
       
       
       
       
       
       
       
       
  public void playMidiSong() throws MidiUnavailableException, FileNotFoundException, IOException, InvalidMidiDataException{
      
      
      InputStream is = null; 
      
      // sequencer = MidiSystem.getSequencer();
       //  if( sequencer.isRunning()){
         
      //     sequencer.close();
      //  }
          
       
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            is = new BufferedInputStream(new FileInputStream(new File("midi/" + songName)));// + ".mid")));
            sequencer.setSequence(is);
            sequencer.start();
            is.close();
           // this.dispose();
      
   } // end play midi song
  
  
  
 
       
   
  
  
      
   public void showChooser(){  // this is from the example marc linked to in the google drive
      
                      JFileChooser  chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("./midi/"));
       FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "MIDI files", "mid");
    chooser.setFileFilter(filter);
    chooser.setDialogTitle("pick a song");
    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    //
    // disable the "All files" option.
    //
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      chooseSong.setVisible(false);
      playSong.setVisible(true);
      songName = chooser.getSelectedFile().getName();
      }
    else {
      System.out.println("No Selection ");
      }
  }
 
  
  
  class MyDrawPanel extends JPanel implements ControllerEventListener {
      
      // only if we got an event do we want to paint
      boolean msg = false;

      public void controlChange(ShortMessage event) {
         msg = true;       
         repaint();         
      }

      public void paintComponent(Graphics g) {
       if (msg) {
            
         Graphics2D g2 = (Graphics2D) g;

         int r = (int) (Math.random() * 250);
         int gr = (int) (Math.random() * 250);
         int b = (int) (Math.random() * 250);

         g.setColor(new Color(r,gr,b));

         int ht = (int) ((Math.random() * 120) + 10);
         int width = (int) ((Math.random() * 120) + 10);

         int x = (int) ((Math.random() * 400) + 1);
         int y = (int) ((Math.random() * 400) + 1);
         
         g.fillRect(x,y,ht, width);
         msg = false;

       } // close if
     } // close method
   }  // close inner class 
  
  
  
  
  
  
  
  
  
  
  
} // end
