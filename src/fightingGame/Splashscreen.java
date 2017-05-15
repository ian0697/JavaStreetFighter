/*
 * Programmed by: Michael Ian A. Santiago
 * Course/yr: BCS22
 */
package fightingGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.Timer;

public class Splashscreen extends JWindow implements ActionListener {
    private final JLabel imageLabel;
    private final Timer timer = new Timer(1000,this); 
    private final Maine m;
    private int sec;
    
    public Splashscreen() {
        m = new Maine();
        m.setVisible(false);
        
        imageLabel = new JLabel(new ImageIcon(getClass().getResource("/fightingGame/res/splashscreen2.gif")));  
        add(imageLabel);
        
        timer.start();
        sec = 0;
        
        setBounds(0,0,600,340);
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        sec++;
        if(sec == 7)
            m.getPanel().getAudioManager().playMenu(); 
        
        else if(sec == 10) {
            setVisible(false);
            this.dispose();
            m.setVisible(true);
            timer.stop();
        }
    }
    
    public static void main(String args[])  {
        new Splashscreen(); 
    }
    
}
