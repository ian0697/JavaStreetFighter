/*
 * Programmed by: Michael Ian A. Santiago
 * Course/yr: BCS22
 * 
 */
package fightingGame;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class StageConfirm extends javax.swing.JFrame {
    
    private StageSelection ss;  
    private CharSelect1 player1; 
    private Panel panel;
    private StageConfirm() { }
   
    
    public StageConfirm(StageSelection ss, Panel p ) {
        panel = p;
        this.ss  = ss; 
        initComponents();
        setVisible(true);
        setSize(480,300);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g){
        super.paint(g);
        ImageIcon i = new ImageIcon(getClass().getResource(ss.getBackgroundFile()));
        Image image = i.getImage();
        g.drawImage(image, 120,70, 260,140, null); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        NO = new javax.swing.JLabel();
        YES = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        proceed = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        label.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Your Map:");
        getContentPane().add(label);
        label.setBounds(0, 20, 480, 60);

        NO.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        NO.setForeground(new java.awt.Color(255, 255, 255));
        NO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NO.setText("NO");
        NO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NOMouseClicked(evt);
            }
        });
        getContentPane().add(NO);
        NO.setBounds(240, 240, 180, 60);

        YES.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        YES.setForeground(new java.awt.Color(255, 255, 255));
        YES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YES.setText("YES");
        YES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YESMouseClicked(evt);
            }
        });
        getContentPane().add(YES);
        YES.setBounds(60, 240, 180, 60);

        exit.setText("jLabel1");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(464, 10, 20, 20);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 70, 260, 140);

        proceed.setFont(new java.awt.Font("Mangal", 0, 14)); // NOI18N
        proceed.setForeground(new java.awt.Color(255, 255, 255));
        proceed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceed.setText("PROCEED?");
        getContentPane().add(proceed);
        proceed.setBounds(0, 220, 480, 25);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/optionbg.jpg"))); // NOI18N
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(background);
        background.setBounds(0, 0, 480, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NOMouseClicked
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_NOMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void YESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YESMouseClicked
        setVisible(false);
//        this.dispose();
        player1 = new CharSelect1(ss);
        panel.add(player1);
        
        ss.setVisible(false);
        panel.remove(ss);
        
        
        player1.setFocusable(true);
        player1.setBounds(0,0, 600, 340);
        player1.setSize(600,340);
        player1.setVisible(true);
        
        
    }//GEN-LAST:event_YESMouseClicked
    
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
            java.util.logging.Logger.getLogger(StageConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StageConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StageConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StageConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StageConfirm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NO;
    private javax.swing.JLabel YES;
    private javax.swing.JLabel background;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel proceed;
    // End of variables declaration//GEN-END:variables
}
