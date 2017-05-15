package fightingGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CharSelect1 extends javax.swing.JPanel {
    
    private StageSelection ss;
    private Panel panel;
    private AudioManager am;
    private ImageIcon i;
    private Image image, bg;
    private int width;
    private int height;
    private String name;
    
    public CharSelect1(StageSelection ss) {
        initComponents();
        
        this.ss = ss;
        panel = ss.getPanel();
        am = panel.getAudioManager();
        
        i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Chunfo/player1/normal.gif"));
        image = i.getImage();
        width = 80;
        height = 150;
        
        mouseEntered(); 
        mouseExited();
        
        
        setSize(600,340);
        background.setIcon(new ImageIcon(getClass().getResource(ss.getBackgroundFile())));
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        hover1 = new javax.swing.JLabel();
        hover2 = new javax.swing.JLabel();
        hover3 = new javax.swing.JLabel();
        hover4 = new javax.swing.JLabel();
        hover5 = new javax.swing.JLabel();
        char1 = new javax.swing.JLabel();
        char2 = new javax.swing.JLabel();
        char3 = new javax.swing.JLabel();
        char4 = new javax.swing.JLabel();
        char5 = new javax.swing.JLabel();
        bar = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        bright = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(null);

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        add(exit);
        exit.setBounds(570, 10, 20, 20);

        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("<< Back to Map Selection");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        add(back);
        back.setBounds(20, 310, 170, 14);

        hover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/hover.png"))); // NOI18N
        hover1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover1MouseClicked(evt);
            }
        });
        add(hover1);
        hover1.setBounds(220, 100, 46, 54);

        hover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/hover.png"))); // NOI18N
        hover2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hover2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover2MouseClicked(evt);
            }
        });
        add(hover2);
        hover2.setBounds(280, 100, 46, 54);

        hover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/hover.png"))); // NOI18N
        hover3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hover3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hover3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover3MouseClicked(evt);
            }
        });
        add(hover3);
        hover3.setBounds(340, 100, 46, 54);

        hover4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/hover.png"))); // NOI18N
        hover4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hover4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover4MouseClicked(evt);
            }
        });
        add(hover4);
        hover4.setBounds(250, 170, 46, 54);

        hover5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/hover.png"))); // NOI18N
        hover5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hover5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover5MouseClicked(evt);
            }
        });
        add(hover5);
        hover5.setBounds(310, 170, 46, 54);

        char1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Chunfo/char.png"))); // NOI18N
        char1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(char1);
        char1.setBounds(220, 100, 46, 54);

        char2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Cliff/char.png"))); // NOI18N
        char2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(char2);
        char2.setBounds(280, 100, 46, 54);

        char3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Musashi/char.png"))); // NOI18N
        char3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        char3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(char3);
        char3.setBounds(340, 100, 46, 54);

        char4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Pasta/char.png"))); // NOI18N
        char4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(char4);
        char4.setBounds(250, 170, 46, 54);

        char5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Stalong/char.png"))); // NOI18N
        char5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(char5);
        char5.setBounds(310, 170, 46, 54);

        bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/bar2.png"))); // NOI18N
        add(bar);
        bar.setBounds(0, 0, 600, 340);

        label.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("PLAYER 1");
        add(label);
        label.setBounds(0, 250, 600, 40);

        label1.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("CHARACTER SELECTION");
        add(label1);
        label1.setBounds(0, 40, 600, 40);

        bright.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightingGame/res/bright.png"))); // NOI18N
        add(bright);
        bright.setBounds(0, 0, 600, 340);
        add(background);
        background.setBounds(0, 0, 600, 340);
    }// </editor-fold>//GEN-END:initComponents

    
    private void mouseEntered(){
        
        hover1.setVisible(false);
        hover2.setVisible(false);
        hover3.setVisible(false);
        hover4.setVisible(false);
        hover5.setVisible(false);
        
        char1.addMouseListener(new MouseAdapter(){
           public void mouseEntered(MouseEvent evt){
                hover1.setVisible(true);
                i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Chunfo/player1/normal.gif"));
                image = i.getImage();
                width = 80;
                name = "Chunfo";
                am.playClick2();
                repaint();
                
           } 
        });
        
        char2.addMouseListener(new MouseAdapter(){
           public void mouseEntered(MouseEvent evt){
                hover2.setVisible(true);
                i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Cliff/player1/normal.gif"));
                image = i.getImage();
                width = 60;
                name = "Cliff";
                am.playClick2();
                repaint();
           } 
        });
        
        char3.addMouseListener(new MouseAdapter(){
           public void mouseEntered(MouseEvent evt){
                hover3.setVisible(true);
                i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Musashi/player1/normal.gif"));
                image = i.getImage();
                width = 80;
                name = "Musashi";
                am.playClick2();
                repaint();
           } 
        });
        
        char4.addMouseListener(new MouseAdapter(){
           public void mouseEntered(MouseEvent evt){
                hover4.setVisible(true);
                i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Pasta/player1/normal.gif"));
                image = i.getImage();
                width = 60;
                name = "Pasta";
                am.playClick2();
                repaint();
           } 
        });
        
        char5.addMouseListener(new MouseAdapter(){
           public void mouseEntered(MouseEvent evt){
                hover5.setVisible(true);
                i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/Stalong/player1/normal.gif"));
                image = i.getImage();
                width = 80;
                name = "Stalong";
                am.playClick2();
                repaint();
           } 
        });
    }
    
    private void mouseExited(){
        hover1.addMouseListener(new MouseAdapter(){ 
            public void mouseExited(MouseEvent evt){
               hover1.setVisible(false);
           }
        });
        
        hover2.addMouseListener(new MouseAdapter(){ 
            public void mouseExited(MouseEvent evt){
                hover2.setVisible(false);
           }
        });
        
        hover3.addMouseListener(new MouseAdapter(){ 
            public void mouseExited(MouseEvent evt){
               hover3.setVisible(false);
           }
        });
        
        hover4.addMouseListener(new MouseAdapter(){ 
            public void mouseExited(MouseEvent evt){
               hover4.setVisible(false);
           }
        });
        
        hover5.addMouseListener(new MouseAdapter(){ 
            public void mouseExited(MouseEvent evt){
               hover5.setVisible(false);
           }
        });
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(image, 70, 100, width, height, null); 
    }
     
    public String getName(){
        return name;
    }
    
    public Image getImage(){
        return image; 
    }
    
    public StageSelection getStage(){
        return ss;
    }
    
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        new CustomPane("Exit Game?");
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        setVisible(false);
        panel.remove(this);
        panel.add(new StageSelection(panel));
        am.playClick();
    }//GEN-LAST:event_backMouseClicked

    private void hover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover1MouseClicked
        setVisible(false);
        panel.remove(this);
        
        CharSelect2 player2 = new CharSelect2(this);
        panel.add(player2);
        
        player2.setFocusable(true);
        am.playClick();

    }//GEN-LAST:event_hover1MouseClicked

    private void hover2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover2MouseClicked
        setVisible(false);
        panel.remove(this);
        
        CharSelect2 player2 = new CharSelect2(this);
        panel.add(player2);
        player2.setFocusable(true);
        am.playClick();
    }//GEN-LAST:event_hover2MouseClicked

    private void hover3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover3MouseClicked
        setVisible(false);
        panel.remove(this);
        
        CharSelect2 player2 = new CharSelect2(this);
        panel.add(player2);
        player2.setFocusable(true);
        
        am.playClick();
    }//GEN-LAST:event_hover3MouseClicked

    private void hover4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover4MouseClicked
        setVisible(false);
        panel.remove(this);
        
        CharSelect2 player2 = new CharSelect2(this);
        panel.add(player2);
        player2.setFocusable(true);
        
        am.playClick();
    }//GEN-LAST:event_hover4MouseClicked

    private void hover5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover5MouseClicked
        setVisible(false);
        panel.remove(this);
        
        CharSelect2 player2 = new CharSelect2(this);
        panel.add(player2);
        player2.setFocusable(true);
        
        am.playClick();
    }//GEN-LAST:event_hover5MouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bar;
    private javax.swing.JLabel bright;
    private javax.swing.JLabel char1;
    private javax.swing.JLabel char2;
    private javax.swing.JLabel char3;
    private javax.swing.JLabel char4;
    private javax.swing.JLabel char5;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel hover1;
    private javax.swing.JLabel hover2;
    private javax.swing.JLabel hover3;
    private javax.swing.JLabel hover4;
    private javax.swing.JLabel hover5;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
