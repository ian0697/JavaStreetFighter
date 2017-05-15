package fightingGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Countdown extends javax.swing.JFrame implements ActionListener{

    private GameMain gm;
    private AudioManager am;
    private ControlEvent c;
    private Timer Countdown;
    private int time;
    private String str;
    private ImageIcon i;
    private Image pic1, pic2;
    
    public Countdown(){ }
    
    public Countdown(GameMain gm) {
        initComponents();

        this.gm = gm;
        c = gm.getPanel().getControlEvent();
        am = gm.getAudioManager();

        time = 9;
        str = "" + time;

        i = new ImageIcon(getClass().getResource("/fightingGame/res/bar2.png"));
        pic1 = i.getImage();

        i = new ImageIcon(getClass().getResource("/fightingGame/res/countdownbg.png"));
        pic2 = i.getImage();

        addKeyListener(new AL());
        setFocusable(true);
        requestFocus(true);

        am.playCountdown();
        Countdown = new Timer(1400,this);
        Countdown.start();

        setVisible(true);
        setSize(600,340);
        setFocusable(true);
        setLocationRelativeTo(null);
    }
    
    
    private class AL extends KeyAdapter{ 
        public void keyPressed(KeyEvent e){
            if(e.getKeyCode() == KeyEvent.VK_SPACE){
                am.stopCountdown();
                dispose();
                Maine m = new Maine();
                m.setVisible(true);
                Countdown.stop();
            }
        }
    }
    
    public void paint(Graphics g){
        String str2 = "CONTINUE?";
        
        g.drawImage(pic2, 0, 0, 600, 340, null);
        
        g.drawImage(pic1, 0, 0, 600, 340, null);
       
        g.setFont(new Font("Impact" , Font.BOLD, 100));  
        g.setColor(Color.WHITE);
        g.drawString(str, 257, 240);
        
        g.setFont(new Font("Impact" , Font.BOLD, 72));  
        g.drawString(str2, 115, 120);
        
        g.setFont(new Font("Tahoma" , Font.PLAIN, 12));
        g.drawString("Press SPACE to play Again", 215, 300);
    }
    
    public void actionPerformed(ActionEvent evt){
    
        time--;
        str = time   + "";
        
        if(time >= 0 ) {
            repaint();
        }
        
        if(time < -3){
            System.exit(0);
        }
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bright = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        bright.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/bright.png"))); // NOI18N
        getContentPane().add(bright);
        bright.setBounds(0, 0, 600, 340);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/countdownbg.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 600, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Countdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Countdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Countdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Countdown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Countdown().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bright;
    // End of variables declaration//GEN-END:variables
}
