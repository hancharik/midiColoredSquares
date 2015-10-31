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


import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Mark
 */
public class StartPanel extends JPanel implements ActionListener, ChangeListener{
    
    
    /*
    //@see http://stackoverflow.com/questions/7456227 
        private static final String abstractActionString = "close";
    ///////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    private Action nameOfActionVariable = new AbstractAction(abstractActionString) {

            @Override
            public void actionPerformed(ActionEvent e) {
                Space.f.dispatchEvent(new WindowEvent(
                    Space.f, WindowEvent.WINDOW_CLOSING));
            }
        };
    private JButton b = new JButton(nameOfActionVariable);

        */
        
       
    
    
    
    
    
    
    

    JButton startPlanetButton;
    JButton startAtomButton;
    JButton startChainedParticleButton;
    
    
    JButton stallmanHaloButton;
    
    
    JButton rainbowCannonButton;
    JButton midiPlayerButton;
    JButton showrms;
    JButton startButton;
    JButton quitButton;
    JButton shipButton;
    JButton shipSelectorButton;
    
    JButton teamMemberButton1;
    JButton teamMemberButton2;
    JButton teamMemberButton3;
    JButton teamMemberButton4;
    JButton teamMemberButton5;
    JButton teamMemberButton6;
    JButton teamMemberButton7;
    
    JButton bigScreenButton;
    JButton littleScreenButton;
    JButton fullScreenButton;
    JButton linearMovementButton;
    JButton trigonometricMovementButton;
    JButton centeredGravityButton;
    JButton fixedParticleButton;
    JButton relativeGravityButton;
    
    
    JSlider numberOfParticles;
    JSlider sizeOfParticles;
    JSlider speedOfParticles;
    JSlider speedLimitMaxOfParticles;
    JSlider speedLimitMinOfParticles;
    JSlider massOfCenter;
    
    JSlider massOfParticles;
    JSlider massOfShip;
    JSlider gravitationalConstant;
    JSlider powerOfTen;
    JLabel massOfShipLabel;
    JLabel gravitationalConstantLabel;
    JLabel powerOfTenLabel;
    JLabel massOfParticlesLabel;
    JLabel massOfCenterLabel;
    JLabel numOfParticles;
    JLabel speedLimitMaxOfParticlesLabel;
    JLabel sizeOfParticlesLabel;
    JLabel speedOfParticlesMaxLabel;
    JLabel speedLimitMinOfParticlesLabel;
    
    int sliderWidth = (int)(Space.width*.18);
    
    
    
    public StartPanel(){
        
       super();
       setLayout(new GridLayout(15,3));
       setBackground(Color.black);
       
       /*
       
        this.add(b);
        
        
        Space.f.getRootPane().setDefaultButton(b);
        
  
    
        this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0), abstractActionString);
        
     
        
        
        this.getActionMap().put(abstractActionString, nameOfActionVariable);
    
       */
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       startPlanetButton = new JButton("Solar System");
       startPlanetButton.setBounds(column(6), row(6), 180, 40);
       startPlanetButton.addActionListener(this);
       add(startPlanetButton); 
       startAtomButton = new JButton("Electron Cloud");
       startAtomButton.setBounds(column(6), row(7), 180, 40);
       startAtomButton.addActionListener(this);
       add(startAtomButton); 
       startChainedParticleButton = new JButton("Chained Particles");
       startChainedParticleButton.setBounds(column(6), row(8), 180, 40);
       startChainedParticleButton.addActionListener(this);
       add(startChainedParticleButton); 
       
       stallmanHaloButton = new JButton("Stallman Halo");
       stallmanHaloButton.setBounds(column(6), row(9), 180, 40);
       stallmanHaloButton.addActionListener(this);
       add(stallmanHaloButton); 
       
       rainbowCannonButton = new JButton("Rainbow Cannon");
       rainbowCannonButton.setBounds(column(6), row(10), 180, 40);
       rainbowCannonButton.addActionListener(this);
       add(rainbowCannonButton);
       
       
       bigScreenButton = new JButton("Big Screen");
       bigScreenButton.setBounds(column(5), row(1), 120, 40);
       bigScreenButton.addActionListener(this);
       //add(bigScreenButton);
       littleScreenButton = new JButton("Little Screen");
       littleScreenButton.setBounds(column(5), row(2), 120, 40);
       littleScreenButton.addActionListener(this);
       //add(littleScreenButton);
       fullScreenButton = new JButton("Full Screen");
       fullScreenButton.setBounds(column(5), row(3), 120, 40);
       fullScreenButton.addActionListener(this);
       //add(fullScreenButton);
       
        
        massOfCenter = new JSlider(JSlider.HORIZONTAL, 0, 100, (int)Space.massOfCenter);
        massOfCenter.addChangeListener(this);
        massOfCenter.setMajorTickSpacing(100);
        massOfCenter.setPaintTicks(true);
        massOfCenter.setBounds(column(1), row(4), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(column(1), 160, 40, 200);// vertical
        add(massOfCenter);
        
        massOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 100, (int)Space.globalParticleMass);
        massOfParticles.addChangeListener(this);
        massOfParticles.setMajorTickSpacing(100);
        massOfParticles.setPaintTicks(true);
        massOfParticles.setBounds(column(1), row(5), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(massOfParticles);
        
        massOfShip = new JSlider(JSlider.HORIZONTAL, 1, 100, (int)Space.globalParticleMass);
        massOfShip.addChangeListener(this);
        //massOfShip.setMajorTickSpacing(100);
        massOfShip.setPaintTicks(true);
        massOfShip.setBounds(column(1), row(3), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(massOfShip);
        
        
        gravitationalConstant = new JSlider(JSlider.HORIZONTAL, 1, 10000, Space.universalGravitationalConstant);
        gravitationalConstant.addChangeListener(this);
        gravitationalConstant.setMajorTickSpacing(100);
        gravitationalConstant.setPaintTicks(true);
        gravitationalConstant.setBounds(column(1), row(11), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(gravitationalConstant);
        
        powerOfTen = new JSlider(JSlider.HORIZONTAL, -10, 10, Space.ugcPowerOfTen);
        powerOfTen.addChangeListener(this);
        powerOfTen.setMajorTickSpacing(100);
        powerOfTen.setPaintTicks(true);
        powerOfTen.setBounds(column(1), row(12), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(powerOfTen);
        
        numberOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 10000, Space.globalAmountOfParticles);
        numberOfParticles.addChangeListener(this);
        numberOfParticles.setMajorTickSpacing(100);
        numberOfParticles.setPaintTicks(true);
        numberOfParticles.setBounds(column(1), row(6), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(column(1), 160, 40, 200);// vertical
        add(numberOfParticles);
        
        sizeOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 80, Space.globalParticleSize);
        sizeOfParticles.addChangeListener(this);
        sizeOfParticles.setMajorTickSpacing(100);
        sizeOfParticles.setPaintTicks(true);
        sizeOfParticles.setBounds(column(1), row(7), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(sizeOfParticles);
       
        
        speedOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 100, Space.globalTimerSpeed);
        speedOfParticles.addChangeListener(this);
        speedOfParticles.setMajorTickSpacing(100);
        speedOfParticles.setPaintTicks(true);
        speedOfParticles.setBounds(column(1), row(10), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(speedOfParticles);
        
        speedLimitMaxOfParticles = new JSlider(JSlider.HORIZONTAL, Space.globalMinSpeed, 100, Space.globalSpeedlimit);
        speedLimitMaxOfParticles.addChangeListener(this);
        speedLimitMaxOfParticles.setMajorTickSpacing(100);
        speedLimitMaxOfParticles.setPaintTicks(true);
        speedLimitMaxOfParticles.setBounds(column(1), row(8), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(speedLimitMaxOfParticles);
        
        speedLimitMinOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 40, Space.globalMinSpeed);
        speedLimitMinOfParticles.addChangeListener(this);
        speedLimitMinOfParticles.setMajorTickSpacing(100);
        speedLimitMinOfParticles.setPaintTicks(true);
        speedLimitMinOfParticles.setBounds(column(1), row(9), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(speedLimitMinOfParticles);
        
        massOfCenterLabel = new JLabel("<html><h2><font color='white'>mass of center: </font><font color='red'>" + Space.massOfCenter + "</font><h2></html>");
        massOfCenterLabel.setBounds(column(2), row(4), 220, 40);
        add(massOfCenterLabel);
        
        massOfParticlesLabel = new JLabel("<html><h2><font color='white'>mass of particles: </font><font color='red'>" + Space.globalParticleMass + "</font><h2></html>");
        massOfParticlesLabel.setBounds(column(2), row(5), 220, 40);
        add(massOfParticlesLabel);
        
        massOfShipLabel = new JLabel("<html><h2><font color='white'>mass of ship: </font><font color='red'>" + Space.globalShipMass + "</font><h2></html>");
        massOfShipLabel.setBounds(column(2), row(3), 220, 40);
        add(massOfShipLabel);
        
        gravitationalConstantLabel = new JLabel("<html><h2><font color='white'>Gravitational Constant: </font><font color='red'>" + Space.universalGravitationalConstant + "</font><h2></html>");
        gravitationalConstantLabel.setBounds(column(2), row(11), 260, 40);
        add(gravitationalConstantLabel);
        
        powerOfTenLabel = new JLabel("<html><h2><font color='white'>UGC: " + Space.universalGravitationalConstant + " x 10^</font><font color='red'>" + Space.ugcPowerOfTen + "</font><h2></html>");
        powerOfTenLabel.setBounds(column(2), row(12), 220, 40);
        add(powerOfTenLabel);
        
        
        numOfParticles = new JLabel("<html><h2><font color='white'># of particles: </font><font color='red'>" + Space.globalAmountOfParticles + "</font><h2></html>");
        numOfParticles.setBounds(column(2), row(6), 220, 40);
     
        add(numOfParticles);
        sizeOfParticlesLabel = new JLabel("<html><h2><font color='white'>size: </font><font color='red'>" + Space.globalParticleSize + "</font><h2></html>");
        sizeOfParticlesLabel.setBounds(column(2), row(7), 220, 40);
        add(sizeOfParticlesLabel);
        //speedOfParticlesMaxLabel = new JLabel("speed: " + Space.globalTimerSpeed);
        speedOfParticlesMaxLabel = new JLabel("<html><h2><font color='white'>ms per cycle: </font><font color='red'>" + Space.globalTimerSpeed + "</font><h2></html>");
        speedOfParticlesMaxLabel.setBounds(column(2), row(10), 220, 40);
        add(speedOfParticlesMaxLabel);
        
         speedLimitMaxOfParticlesLabel = new JLabel("<html><h2><font color='white'>max speed limit: </font><font color='red'>" + Space.globalSpeedlimit + "</font><h2></html>");
        speedLimitMaxOfParticlesLabel.setBounds(column(2), row(8), 220, 40);
        add(speedLimitMaxOfParticlesLabel);
        
         speedLimitMinOfParticlesLabel = new JLabel("<html><h2><font color='white'>min speed limit: </font><font color='red'>" + Space.globalMinSpeed + "</font><h2></html>");
        speedLimitMinOfParticlesLabel.setBounds(column(2), row(9), 2200, 40);
        speedLimitMinOfParticlesLabel.setBackground(Color.red);
        add(speedLimitMinOfParticlesLabel);
        
       showrms = new JButton();
       checkrmsPic();
       showrms.setBounds(column(1), row(1), 200, 100);
       showrms.addActionListener(this);
       showrms.setBorderPainted(false);
       add(showrms); 
        
       midiPlayerButton = new JButton("MIDI Player");
       midiPlayerButton.setBounds(column(2), row(1), 200, 100);
       midiPlayerButton.addActionListener(this);
       midiPlayerButton.setIcon(new ImageIcon("images/midi.png"));
       midiPlayerButton.setBorderPainted(false);
       add(midiPlayerButton);       
       
       shipSelectorButton = new JButton("Select Ship");
       shipSelectorButton.setBounds(column(4), row(1), 200, 100);
       shipSelectorButton.addActionListener(this);
       shipSelectorButton.setIcon(new ImageIcon("images/ufo200x100.png"));
       shipSelectorButton.setBorderPainted(false);
       if(!Space.thereIsAShip){
        shipSelectorButton.setVisible(false);
       }
       add(shipSelectorButton);
       
       
       
       shipButton = new JButton("no ship");
       if(Space.thereIsAShip){
        shipButton = new JButton("ship");
       }
       shipButton.setBounds(column(4), row(3), 180, 40);//200, 100);
       shipButton.addActionListener(this);
       //shipButton.setIcon(new ImageIcon("images/ufo200x100.png"));
       add(shipButton);
       
       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       // add team member buttons
       // just add your name to a button for your own panel
       // these still need to be wired, not sure what needs to be done
       teamMemberButton1 = new JButton("Mark");
       teamMemberButton1.setBounds(column(7), row(5), 80, 40);
       teamMemberButton1.addActionListener(this);
       add(teamMemberButton1);
       teamMemberButton2 = new JButton("vacant");
       teamMemberButton2.setBounds(column(7), row(6), 80, 40);
       teamMemberButton2.addActionListener(this);
       add(teamMemberButton2);
       teamMemberButton3 = new JButton("vacant");
       teamMemberButton3.setBounds(column(7), row(7), 80, 40);
       teamMemberButton3.addActionListener(this);
       add(teamMemberButton3);
       teamMemberButton4 = new JButton("vacant");
       teamMemberButton4.setBounds(column(7), row(8), 80, 40);
       teamMemberButton4.addActionListener(this);
       add(teamMemberButton4);
       teamMemberButton5 = new JButton("vacant");
       teamMemberButton5.setBounds(column(7), row(9), 80, 40);
       teamMemberButton5.addActionListener(this);
       add(teamMemberButton5);
       teamMemberButton6 = new JButton("vacant");
       teamMemberButton6.setBounds(column(7), row(10), 80, 40);
       teamMemberButton6.addActionListener(this);
       add(teamMemberButton6);
       teamMemberButton7 = new JButton("vacant");
       teamMemberButton7.setBounds(column(7), row(11), 80, 40);
       teamMemberButton7.addActionListener(this);
       add(teamMemberButton7);
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
       
       
       
       
       startButton = new JButton("start");
       startButton.setBounds(column(2), row(13), 80, 40);
       startButton.addActionListener(this);
       add(startButton);
       
       quitButton = new JButton("quit");
       quitButton.setBounds(column(1), row(13), 80, 40);
       quitButton.addActionListener(this);
       add(quitButton);
       
       
       
       
       
       
       trigonometricMovementButton = new JButton("trig movement = " + Space.trigonometricMovement);
       trigonometricMovementButton.setBounds(column(6), row(13), 180, 40);
       trigonometricMovementButton.addActionListener(this);
       add(trigonometricMovementButton);
       
       linearMovementButton = new JButton("linear movement = " + Space.linearMovement);
       linearMovementButton.setBounds(column(6), row(12), 180, 40);
       linearMovementButton.addActionListener(this);
       add(linearMovementButton);
       
       centeredGravityButton = new JButton("singular gravity = " + Space.globalSingularGravity);
       centeredGravityButton.setBounds(column(6), row(11), 180, 40);
       centeredGravityButton.addActionListener(this);
       add(centeredGravityButton);
       
       fixedParticleButton = new JButton("diffuse particles = " + Space.particles);
       fixedParticleButton.setBounds(column(6), row(3), 180, 40);
       fixedParticleButton.addActionListener(this);
       add(fixedParticleButton);
       
       
    
       
       relativeGravityButton = new JButton();
       if(Space.gravityGetsStronger== false){
           relativeGravityButton.setText("electron motion");
       }else{
           relativeGravityButton.setText("gravitational motion");
       }
       relativeGravityButton.setBounds(column(4), row(4), 180, 40);
       relativeGravityButton.addActionListener(this);
       add(relativeGravityButton);
       
       
       if(!Space.gravityGetsStronger){
            massOfCenter.setVisible(false);
            massOfShip.setVisible(false);
            gravitationalConstant.setVisible(false);
            powerOfTen.setVisible(false);
            massOfShipLabel.setVisible(false);
            gravitationalConstantLabel.setVisible(false);
            powerOfTenLabel.setVisible(false);
            massOfParticles.setVisible(false);
            massOfCenterLabel.setVisible(false);
            massOfParticlesLabel.setVisible(false);
       }
       
                if(!Space.thereIsAShip){
                massOfShip.setVisible(false);
                
                massOfShipLabel.setVisible(false);
                
                }
       
    }  // end constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        
        	Object obj = e.getSource();
       
    
        
        
       	if (obj == startAtomButton){
            
                Space.globalSingularGravity = true;
                Space.showStallman = false;
                Space.trigonometricMovement = false;
                Space.thereIsAShip = false;
                Space.globalParticleSize = 2;
                Space.showStallman = false;
                Space.globalHelioSize = checkForStallman(32);
                Space.globalParticleSizeMultiplier = 8;
                Space.globalAmountOfParticles = 6000;
                Space.globalSingularGravity = true;
                Space.particles = true;
                Space.globalEnemySpeed = 1;
                Space.gravityGetsStronger = false;
                Space.globalhelioSpeed = 10;
                Space.globalTimerSpeed = 1;
                Space.globalSpeedlimit = 42;// + heroSize;// douglas adams is max
                Space.globalMinSpeed = 12;
                Space.globalHelioSize = 1;
                Space.globalSongName = "BeautifulDisaster";
                Space.screen.start();  
           
           
       	}// end start atom button
        
        
        
             	
        
        
        
        
        
        if (obj == startPlanetButton){
            
            
            Space.boxX = 540;
            Space.boxY = 300;
            Space.boxWidth = 200;
            Space.boxHeight = 200;
            Space.boxXvel = 15.0;
            Space.boxYvel = -10.0;
            Space.globalSingularGravity = true;
            Space.gravityGetsStronger = false;
            Space.particles = false;
            Space.showStallman = false;
            Space.globalParticleSize = 12;
            Space.globalHelioSize = checkForStallman(20);
            Space.globalParticleSizeMultiplier = 2;
            Space.globalAmountOfParticles = (int)(Math.random() * 9) + 1;
            Space.globalEnemySpeed = 1;
            Space.globalhelioSpeed = 10;
            Space.globalTimerSpeed = 40;
            Space.globalSpeedlimit = 32;// + heroSize;// douglas adams is max
            Space.globalMinSpeed = 6;
            Space.globalSongName = "AveMaria";  
            Space.screen.start(); 
            
            
       	}// end start planet button
   
        
        
        
        
        
        
        
        
        
        
        
        
        
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
  ////////////////////                  THE STALLMAN HALO                 //////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
        
        
        
        
        if (obj == stallmanHaloButton){
            
            
                Space.thereIsAShip = false;
                Space.globalSingularGravity = true;
                Space.particles = true;
                Space.globalParticleSize = 2;
                Space.showStallman = true;//.globalHelioSize = checkForStallman(18);
                Space.globalAmountOfParticles = 6000;
                //Space.gravityGetsStronger = true;
                Space.globalParticleMass = 3;  // 3 - super important!
                Space.globalEnemySpeed = 1;
                Space.gravityWellDistance = 555;  
                Space.globalhelioSpeed = 10;
                Space.globalTimerSpeed = 1;
                Space.globalSpeedlimit = 42;// douglas adams (42) is max
                Space.globalMinSpeed = 12;
                Space.gravityGetsStronger = false;
                Space.globalSongName = "AintNothingButAGThing";  
                Space.screen.start();   
                 // Space.screen.display();  <-- full screen attempt
            
       	} // end stallman halo
        
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
  ////////////////////                  THE STALLMAN HALO                 //////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////          
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
        
        
        
        
        
        
        
        
        
        
        if (obj == rainbowCannonButton){
            
            
                Space.boxX = 0;
                Space.boxY = 500;
                Space.boxWidth = 200;
                Space.boxHeight = 20;
                Space.boxXvel = 35.0;
                Space.boxYvel = 0.0;
                Space.universalGravitationalConstant = 6674;
                Space.ugcPowerOfTen = -6;
                Space.globalParticleMass = 1.0;
                Space.massOfCenter = 2.0;
                Space.thereIsAShip = false;
                Space.globalSingularGravity = true;
                Space.particles = false;
                Space.globalParticleSize = 2;
                Space.showStallman = false;
                Space.globalAmountOfParticles = 6000;
                Space.globalHelioSize= 4;
                Space.globalParticleMass = 3;  // 3 - super important!
                Space.globalEnemySpeed = 1;
                Space.gravityWellDistance = 555;  
                Space.globalhelioSpeed = 10;
                Space.globalTimerSpeed = 42;
                Space.globalSpeedlimit = 60;// douglas adams (42) is max
                Space.globalMinSpeed = 12;
                Space.gravityGetsStronger = true;
                Space.globalSongName = "MachineGun(Live)";
                Space.screen.start(); 
           
                
                
                
                
                
                
            
       	} // end ship halo
        
        
        
        
        
        
        
        
        if (obj == startChainedParticleButton){
            
            Space.gravityGetsStronger = false;
            Space.thereIsAShip = false;
            Space.globalSingularGravity = false;
            Space.particles = true;
            Space.globalParticleSize = 2;
            Space.showStallman = false;
            Space.globalHelioSize = checkForStallman(18);
            Space.globalAmountOfParticles = 5000;
            Space.globalEnemySpeed = 1;
            Space.globalhelioSpeed = 10;
            Space.globalTimerSpeed = 1;
            Space.globalSpeedlimit = 12;// + heroSize;// douglas adams 42 is max
            Space.globalMinSpeed = 2;
            Space.globalSongName = "Funkytown";
            Space.screen.start(); 
               
       	}
        
        
        
        
        
        if (obj == showrms){
            
            
            if(Space.showStallman){
              //showrms.setText("Hiding rms");
                showrms.setIcon(new ImageIcon("images/be200x100.png")); 
           Space.showStallman = false;   
          // Space.gravityGetsStronger = false;
            }else{
            
           //System.exit();
            //showrms.setText("Showing rms");
           showrms.setIcon(new ImageIcon("images/rms200x100.png"));
           Space.showStallman = true;
                  // Space.gravityGetsStronger = true;

            }
       	}
        
        
        
        
        
        
        
       if (obj == bigScreenButton){
            
            Space.height = 1000;
            Space.width= 1880;
            Space.screen.dispose();
            Space.screen = new Aframe();
       	}
        if (obj == littleScreenButton){
            
            Space.height = 500;
            Space.width= 940;
            Space.screen.dispose();
            Space.screen = new Aframe();
       	}
            if (obj == fullScreenButton){
            
            Space.screen.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            Space.height = Space.screen.getHeight();
            Space.width= Space.screen.getWidth();
            Space.screen.dispose();
            Space.screen = new Aframe();
            Space.screen.setExtendedState(JFrame.MAXIMIZED_BOTH); 
           // Space.height = Space.screen.getHeight();
           // Space.width= Space.screen.getWidth();
            
            Space.screen.setVisible(true);
       	}
        
            
            
        
            
            
            
            
            
            
            
            
       
        if (obj == quitButton){
            
            
         //  Space.midiPlayer.dispose();
           Space.screen.dispose();
            
            
       	}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        if (obj == shipSelectorButton){
            
           
           //maybe a jpanel to select different ships?
            
       	}
        
        
        
         if (obj == shipButton){
            
           if(!Space.thereIsAShip){
           Space.thereIsAShip = true;
           shipSelectorButton.setVisible(true);
           shipButton.setText("ship");
           if(Space.gravityGetsStronger){
           massOfShip.setVisible(true);
           
            massOfShipLabel.setVisible(true);
          
           }
           }else{
           Space.thereIsAShip = false;
           shipSelectorButton.setVisible(false);
           shipButton.setText("no ship");
           massOfShip.setVisible(false);
           
            massOfShipLabel.setVisible(false);
           
           }
            
       	}
        
        
         
         
         
         
         
          if (obj == midiPlayerButton){
            
           // Space.midiPlayer = new MidiFrame();
       	}
        
         
        
        if (obj == startButton){
            
            Space.screen.start(); 
           // Space.fullAframe();  // this is off, because the keylistener disappears somewhere 
       	}
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // team member buttons
        
        if (obj == teamMemberButton1){
            
          //  Space.screen.start1(); 
            Space.fullAframe();  
       	}
        if (obj == teamMemberButton2){
            
          //  Space.screen.start2(); 
           // Space.fullAframe();  
       	}
        if (obj == teamMemberButton3){
            
         //   Space.screen.start3(); 
           // Space.fullAframe();  
       	}
        if (obj == teamMemberButton4){
            
         //   Space.screen.start4(); 
           // Space.fullAframe();  
       	}
        if (obj == teamMemberButton5){
            
         //   Space.screen.start5(); 
           // Space.fullAframe();  
       	}
        if (obj == teamMemberButton6){
            
          //  Space.screen.start6(); 
           // Space.fullAframe();  
       	}
        if (obj == teamMemberButton7){
            
           // Space.screen.start7(); 
           // Space.fullAframe();  
       	}
        
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
        
        
        
        
        
        
        
        
        
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        if (obj == centeredGravityButton){
            
           if(Space.globalSingularGravity){
            Space.globalSingularGravity = false; 
            centeredGravityButton.setText("singular gravity = " + Space.globalSingularGravity);
            }else{
              Space.globalSingularGravity = true; 
              centeredGravityButton.setText("singular gravity = " + Space.globalSingularGravity);
            } 
            
       	}
          
        if (obj == trigonometricMovementButton){
            if(Space.trigonometricMovement){
            Space.trigonometricMovement = false; 
            trigonometricMovementButton.setText("trig movement = " + Space.trigonometricMovement);
            }else{
              Space.trigonometricMovement = true; 
              trigonometricMovementButton.setText("trig movement = " + Space.trigonometricMovement);
            }
            
       	}
        
        if (obj == linearMovementButton){
            if(Space.linearMovement){
            Space.linearMovement = false; 
            linearMovementButton.setText("linear movement = " + Space.linearMovement);
            }else{
              Space.linearMovement = true; 
              linearMovementButton.setText("linear movement = " + Space.linearMovement);
            }
            
       	}
        
        
        if (obj == fixedParticleButton){
            if(Space.particles){
            Space.particles = false; 
            fixedParticleButton.setText("diffuse particles = " + Space.particles);
            }else{
              Space.particles = true; 
              fixedParticleButton.setText("diffuse particles = " + Space.particles);
            }
            
       	}
        
         if (obj == relativeGravityButton){
            if(Space.gravityGetsStronger){
            Space.gravityGetsStronger = false; 
            relativeGravityButton.setText("electron motion");
            massOfCenter.setVisible(false);
            massOfParticles.setVisible(false);
            gravitationalConstant.setVisible(false);
            powerOfTen.setVisible(false);
            massOfCenterLabel.setVisible(false);
            massOfParticlesLabel.setVisible(false);
            gravitationalConstantLabel.setVisible(false);
            powerOfTenLabel.setVisible(false);
            
            
            if(Space.thereIsAShip){
            massOfShip.setVisible(false);
            massOfShipLabel.setVisible(false);
            
            }
            
            
            }else{
              Space.gravityGetsStronger = true; 
              relativeGravityButton.setText("gravitational motion");
                massOfCenter.setVisible(true);
                massOfParticles.setVisible(true);
                massOfCenterLabel.setVisible(true);
                massOfParticlesLabel.setVisible(true);
                gravitationalConstant.setVisible(true);
                powerOfTen.setVisible(true);
                gravitationalConstant.setVisible(true);
                gravitationalConstantLabel.setVisible(true);
                powerOfTenLabel.setVisible(true);
                
                if(Space.thereIsAShip){
                massOfShip.setVisible(true);
                massOfShipLabel.setVisible(true);
                
                }
            }
            
       	}
    } // end action event
    
    
    
    
  public int checkForStallman(int rtn){
      
      int size = 80;
      
      if(Space.showStallman){
       size = 60;   
      }else{
       size = rtn;   
      }
      
      return size;
      
  }  
    
  
  
  
  
public void checkrmsPic(){
    
     if(Space.showStallman){
              //showrms.setText("Hiding rms");
                showrms.setIcon(new ImageIcon("images/rms200x100.png"));
             
            }else{
            
           //System.exit();
            //showrms.setText("Showing rms");
            showrms.setIcon(new ImageIcon("images/be200x100.png"));
          
            }
    
    
}    

    @Override
        public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
       
               if (source == massOfShip) {
            Space.globalShipMass = source.getValue();
            massOfShipLabel.setText("<html><h2><font color='white'>mass of ship: </font><font color='red'>" + Space.globalShipMass + "</font><h2></html>");
        }
                      if (source == gravitationalConstant) {
            Space.universalGravitationalConstant = source.getValue();
            gravitationalConstantLabel.setText("<html><h2><font color='white'>Gravitational Constant: </font><font color='red'>" + Space.universalGravitationalConstant + "</font><h2></html>");
            // do this so that the grav const values update in the power of ten label
            powerOfTenLabel.setText("<html><h2><font color='white'>UGC: " + Space.universalGravitationalConstant + " x 10^</font><font color='red'>" + Space.ugcPowerOfTen + "</font><h2></html>");
        }
                             if (source == powerOfTen) {
            Space.ugcPowerOfTen = source.getValue();
            powerOfTenLabel.setText("<html><h2><font color='white'>UGC: " + Space.universalGravitationalConstant + " x 10^</font><font color='red'>" + Space.ugcPowerOfTen + "</font><h2></html>");
        }
        if (source == massOfCenter) {
            Space.massOfCenter = source.getValue();
            massOfCenterLabel.setText("<html><h2><font color='white'>mass of center: </font><font color='red'>" + Space.massOfCenter + "</font><h2></html>");
        }
         if (source == massOfParticles) {
            Space.globalParticleMass = source.getValue();
            massOfParticlesLabel.setText("<html><h2><font color='white'>mass of particles: </font><font color='red'>" + Space.globalParticleMass + "</font><h2></html>");
        }
        if (source == numberOfParticles) {
            Space.globalAmountOfParticles = (int)source.getValue();
            //numOfParticles.setText(Space.globalAmountOfParticles + " particles");
            numOfParticles.setText("<html><h2><font color='white'># of particles: </font><font color='red'>" + Space.globalAmountOfParticles + "</font><h2></html>");
        }
        if (source == sizeOfParticles) {
            Space.globalParticleSize  = (int)source.getValue();
            
            sizeOfParticlesLabel.setText("<html><h2><font color='white'>size: </font><font color='red'>" + Space.globalParticleSize + "</font><h2></html>");
        }
        if (source == speedOfParticles) {
            Space.globalTimerSpeed = (int)source.getValue();
            speedOfParticlesMaxLabel.setText("<html><h2><font color='white'>ms per cycle: </font><font color='red'>" + Space.globalTimerSpeed + "</font><h2></html>");
        }
        if (source == speedLimitMaxOfParticles) {
            Space.globalSpeedlimit = (int)source.getValue();
            speedLimitMaxOfParticlesLabel.setText("<html><h2><font color='white'>max speed limit: </font><font color='red'>" + Space.globalSpeedlimit + "</font></h2></html>");
        }
         if (source == speedLimitMinOfParticles) {
            Space.globalMinSpeed = (int)source.getValue();
            speedLimitMinOfParticlesLabel.setText("<html><h2><font color='white'>min speed limit: </font><font color='red'>" + Space.globalMinSpeed + "</font></h2></html>");
        }
    } // end state changed

  
        
                //////////////////////////////////////////////////////////////////////////////////////////////////////////
 
private int row(int r){
    int pixelNumber = ((r-1)*(int)(Space.height/16))+20;
    return pixelNumber;
}   

private int column(int c){ 
    int columnPixelNumber = 0;
    
    switch(c){  // these arent in cardinal order, i've been readjusting layouts
        //case 1: columnPixelNumber = (Space.width/8)*1; break;
            
                case 1: columnPixelNumber   = (int)(Space.width*.02); break;
                case 2: columnPixelNumber   = (int)(Space.width*.22); break;
                case 3: columnPixelNumber   = (int)(Space.width*.32); break;
                case 4: columnPixelNumber   = (int)(Space.width*.34); break;
                case 5: columnPixelNumber   = (int)(Space.width*.52); break;
                case 6: columnPixelNumber   = (int)(Space.width*.46); break;
                case 7: columnPixelNumber   = (int)(Space.width*.365); break;
    }
    return columnPixelNumber;
} // end column
    

////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
     
   ////////////////////////////////////////////////////////////////////////////////////////////////////////   
/** @see http://stackoverflow.com/questions/7456227 */
    public void display() {
        GraphicsEnvironment env =
            GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice dev = env.getDefaultScreenDevice();
        Space.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Space.f.setBackground(Color.darkGray);
        Space.f.setResizable(false);
        Space.f.setUndecorated(true);
        Space.f.add(this);
        Space.f.pack();
        dev.setFullScreenWindow(Space.f);
    }  // end display
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
        
   
        
        
        
        
} // end
