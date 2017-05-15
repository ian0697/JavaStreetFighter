package fightingGame;

import java.awt.Font;

public class Menu extends javax.swing.JPanel {

    private final Panel panel;
    private final AudioManager am;
    private StageSelection ss;
    

    public Menu(Panel panel) {
        am = panel.getAudioManager();
        this.panel = panel;
        
        initComponents();
        setVisible(true);
        setSize(600, 340);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblExit = new javax.swing.JLabel();
        lblStart = new javax.swing.JLabel();
        lblOption = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        lblBG = new javax.swing.JLabel();

        setLayout(null);

        lblExit.setFont(new java.awt.Font("Maiandra GD", 2, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("Exit Game");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });
        add(lblExit);
        lblExit.setBounds(420, 200, 220, 50);

        lblStart.setFont(new java.awt.Font("Maiandra GD", 2, 24)); // NOI18N
        lblStart.setForeground(new java.awt.Color(255, 255, 255));
        lblStart.setText("Start Game");
        lblStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStartMouseExited(evt);
            }
        });
        add(lblStart);
        lblStart.setBounds(410, 120, 220, 50);

        lblOption.setFont(new java.awt.Font("Maiandra GD", 2, 24)); // NOI18N
        lblOption.setForeground(new java.awt.Color(255, 255, 255));
        lblOption.setText("Controls");
        lblOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOptionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOptionMouseExited(evt);
            }
        });
        add(lblOption);
        lblOption.setBounds(440, 160, 220, 50);

        close.setText("jLabel1");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        add(close);
        close.setBounds(580, 20, 10, 10);

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        add(minimize);
        minimize.setBounds(550, 10, 20, 20);

        lblBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/menubg2.jpg"))); // NOI18N
        lblBG.setText("jLabel1");
        lblBG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBGMouseClicked(evt);
            }
        });
        add(lblBG);
        lblBG.setBounds(0, 0, 600, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBGMouseClicked

    }//GEN-LAST:event_lblBGMouseClicked

    private void lblStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseClicked
        am.playClick(); 
        
        setVisible(false);
        panel.remove(this);

        ss = new StageSelection(panel, this);
        panel.add(ss);
        
        ss.setFocusable(true);
        ss.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        //am.stopClick();
    }//GEN-LAST:event_lblStartMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        am.playClick();
        new CustomPane("Exit Game?");
        
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseEntered
        am.playClick2();
        lblStart.setFont(new Font("Maindra GD", Font.BOLD + Font.ITALIC, 24));
    }//GEN-LAST:event_lblStartMouseEntered

    private void lblStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseExited
        am.playClick2();
        lblStart.setFont(new Font("Maindra GD", Font.ITALIC, 24));
    }//GEN-LAST:event_lblStartMouseExited

    private void lblOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOptionMouseClicked
        am.playClick();
        Control o = new Control(panel, this);
        panel.remove(this);
        o.setVisible(true);
    }//GEN-LAST:event_lblOptionMouseClicked

    private void lblOptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOptionMouseExited
        lblOption.setFont(new Font("Maindra GD", Font.ITALIC, 24));
        
    }//GEN-LAST:event_lblOptionMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        am.playClick2();
        lblExit.setFont(new Font("Maindra GD", Font.BOLD + Font.ITALIC, 24));
        
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setFont(new Font("Maindra GD", Font.ITALIC, 24));
        
    }//GEN-LAST:event_lblExitMouseExited

    private void lblOptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOptionMouseEntered
        am.playClick2();
        lblOption.setFont(new Font("Maindra GD", Font.BOLD + Font.ITALIC, 24));
        new Control();
    }//GEN-LAST:event_lblOptionMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        am.playClick();
        new CustomPane("Exit Game?");
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        panel.minimizeFrame();
    }//GEN-LAST:event_minimizeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblOption;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
