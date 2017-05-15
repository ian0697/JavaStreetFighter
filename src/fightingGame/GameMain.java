package fightingGame;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameMain extends javax.swing.JFrame {

    private Container c;
    private CharSelect2 cs;
    private GamePanel gPanel;
    private AudioManager am;
    private RoundManager rm;
    
    private int roundNo;
    private int p1Wins, p2Wins;
    
    public GameMain(){ }
    
    public GameMain(CharSelect2 cs, RoundManager rm) {
        initComponents();
        this.cs = cs;
        this.rm = rm;
        am = cs.getPanel().getAudioManager();
        am.stopStage();
        
        c = getContentPane();
        c.setLayout(null);
        
        roundNo = rm.getRoundNo();
        p1Wins = rm.getP1Wins();
        p2Wins = rm.getP2Wins();
        System.out.println(roundNo + " " + p1Wins + " " + p2Wins);
        
        gPanel = new GamePanel(this);
        gPanel.setLayout(null);
        gPanel.setBounds(0,0,600,340);
        c.add(gPanel);
        gPanel.setFocusable(true);
        cs.setVisible(false); 
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(600,340);
        setLocationRelativeTo(null);
         
    }
    
    public GamePanel getPanel(){
        return gPanel;
    }
    
    public AudioManager getAudioManager(){
        return am;
    }
    
    public RoundManager getRoundManager(){
        return rm;
    }
    
    public int getRoundNo(){
        return roundNo;
    }
    
    public int getP1Wins(){
        return p1Wins;
    }
    
    public int getP2Wins(){
        return p2Wins;
    }
    
    public CharSelect2 getCharSelectionClass(){
        return cs;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

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
            java.util.logging.Logger.getLogger(GameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
