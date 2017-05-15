
package fightingGame;

import javax.swing.JFrame;

public class Maine extends JFrame {
    private Menu gamemenu;
    private Panel panel;
    
    
    public Maine(){
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">        
    public void initComponents(){
        panel = new Panel(this);
        panel.setLayout(null);
        panel.setBounds(0,0, 600, 340);       
        getContentPane().add(panel);
            
        getContentPane().setLayout(null); 
        setUndecorated(true);
        setSize(600, 340);
        setVisible(false);
        setLocationRelativeTo(null);
    }// </editor-fold> 
    
    public Panel getPanel(){
        return panel;
    }
    
    public void minimize(){
        this.setState(Maine.ICONIFIED);
    }
    
    public static void main(String[] args) {
        new Maine();
    } 
    
}
