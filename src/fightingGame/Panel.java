
package fightingGame;

public class Panel extends javax.swing.JPanel {

    private final AudioManager am;
    public Maine m;
    private Menu menu;
    private int width;
    private int height;
    private ControlEvent c;
    
    public Panel(Maine m){
        am = new AudioManager();
        this.m = m;
        initComponents2();
        initComponents();
    }
    
    private void initComponents2() {
        this.m = m;
        
        width = 600; //480
        height = 340; //320
        
        menu = new Menu(this);
        add(menu);
        
        menu.setBounds(0,0,width,height);
        setVisible(true);
    } 
    
    public AudioManager getAudioManager(){
        return am;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void minimizeFrame(){
        m.minimize(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setFocusable(false);
        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
