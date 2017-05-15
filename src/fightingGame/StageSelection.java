/*
 * Programmed by: Michael Ian A. Santiago
 * Course/yr: BCS22
 * 
 */
package fightingGame;

import java.util.LinkedList;
import javax.swing.ImageIcon;

public class StageSelection extends javax.swing.JPanel {

    private final Panel panel;
    private final LinkedList<String> file;
    private AudioManager am;
    private Menu m;
    private int counter;
    
    public StageSelection(Panel panel, Menu m){
        am = panel.getAudioManager();
        am.stopMenu();
        am.playStage();
        
        file = new LinkedList<>();
        file.add("/fightingGame/res/maps/bg1.gif");
        file.add("/fightingGame/res/maps/bg2.gif");
        file.add("/fightingGame/res/maps/bg3.gif");
        file.add("/fightingGame/res/maps/bg4.gif");
        file.add("/fightingGame/res/maps/bg5.gif");
        file.add("/fightingGame/res/maps/bg6.gif");
        file.add("/fightingGame/res/maps/bg7.gif");
        file.add("/fightingGame/res/maps/bg8.gif"); 
        file.add("/fightingGame/res/maps/bg9.gif"); 
        file.add("/fightingGame/res/maps/bg10.gif"); 
        file.add("/fightingGame/res/maps/bg11.gif"); 
        file.add("/fightingGame/res/maps/bg12.gif"); 
        file.add("/fightingGame/res/maps/bg13.gif");
        
        counter = 0;
        
        this.panel = panel;
        this.m = m;
        initComponents();
        setSize(600,340);
    }
    
    public StageSelection(Panel panel){
        file = new LinkedList<String>();
        file.add("/fightingGame/res/maps/bg1.gif");
        file.add("/fightingGame/res/maps/bg2.gif");
        file.add("/fightingGame/res/maps/bg3.gif");
        file.add("/fightingGame/res/maps/bg4.gif");
        file.add("/fightingGame/res/maps/bg5.gif");
        file.add("/fightingGame/res/maps/bg6.gif");
        file.add("/fightingGame/res/maps/bg7.gif");
        file.add("/fightingGame/res/maps/bg8.gif"); 
        file.add("/fightingGame/res/maps/bg9.gif"); 
        file.add("/fightingGame/res/maps/bg10.gif"); 
        file.add("/fightingGame/res/maps/bg11.gif"); 
        file.add("/fightingGame/res/maps/bg12.gif"); 
        file.add("/fightingGame/res/maps/bg13.gif");
        counter = 0 ;
        this.panel = panel;
        initComponents();
        setSize(600,340);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProceed = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblMap = new javax.swing.JLabel();
        left = new javax.swing.JLabel();
        right = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bar = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setLayout(null);

        lblProceed.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblProceed.setForeground(new java.awt.Color(255, 255, 255));
        lblProceed.setText("Proceed>>");
        lblProceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProceedMouseClicked(evt);
            }
        });
        add(lblProceed);
        lblProceed.setBounds(520, 300, 140, 30);

        lblBack.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setText("<< Back to Main Menu");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        add(lblBack);
        lblBack.setBounds(10, 300, 140, 30);

        lblMap.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblMap.setForeground(java.awt.SystemColor.controlHighlight);
        lblMap.setText("MAP SELECTION");
        add(lblMap);
        lblMap.setBounds(160, 10, 370, 90);

        left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/left.png"))); // NOI18N
        left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMouseClicked(evt);
            }
        });
        add(left);
        left.setBounds(40, 120, 140, 130);

        right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/right.png"))); // NOI18N
        right.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightMouseClicked(evt);
            }
        });
        add(right);
        right.setBounds(430, 110, 140, 140);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2);
        jLabel2.setBounds(570, 10, 20, 20);

        bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/bar2.png"))); // NOI18N
        bar.setText("jLabel1");
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barMouseClicked(evt);
            }
        });
        add(bar);
        bar.setBounds(0, 0, 600, 340);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/maps/bg1.gif"))); // NOI18N
        add(lblBg);
        lblBg.setBounds(0, 0, 600, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        setVisible(false);
        panel.remove(this);
        panel.add(new Menu(panel));
    }//GEN-LAST:event_lblBackMouseClicked

    private void rightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMouseClicked
        if(counter == file.size() - 1)
            counter = 0;
        
        else
            counter++;
        
        lblBg.setIcon(new ImageIcon(getClass().getResource(file.get(counter))));
        am.playClick2();
        
    }//GEN-LAST:event_rightMouseClicked
    
    public String getBackgroundFile(){
        return file.get(counter);
    }
    
    
    private void leftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMouseClicked
        if(counter==0)
            counter = file.size() - 1;
        else
            counter--;
        
        lblBg.setIcon(new ImageIcon(getClass().getResource(file.get(counter))));
        am.playClick2();
    }//GEN-LAST:event_leftMouseClicked
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        am.playClick();
        new CustomPane("Exit Game?");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lblProceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProceedMouseClicked
        am.playClick();
        StageConfirm sc = new StageConfirm(this,panel);
        sc.setFocusable(true);
    }//GEN-LAST:event_lblProceedMouseClicked
    
    public Panel getPanel(){
        return panel;
    }
        
    private void barMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseClicked
        am.playClick();
        StageConfirm sc = new StageConfirm(this,panel);
        sc.setFocusable(true);
        
    }//GEN-LAST:event_barMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblMap;
    private javax.swing.JLabel lblProceed;
    private javax.swing.JLabel left;
    private javax.swing.JLabel right;
    // End of variables declaration//GEN-END:variables
}
