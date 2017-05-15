/*
 * Programmed by: Michael Ian A. Santiago
 * Course/yr: BCS22
 */

package fightingGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class GamePanel extends javax.swing.JPanel implements ActionListener{
    
    private final int GAMESPEED = 20;
    
    private final CharSelect2 chars;
    private final ControlEvent c;
    private final AudioManager am;
    public GameMain gm;
    private RoundManager rm;
    
    private Timer gameSpeedTimer; 
    private Timer timeLimitTimer; 
    private Timer delay;
    
    private ImageIcon i;
    private Image bg, player1, player2; //characters + bg
    private Image pic1, pic2; //character face 
    private Image round, winround, circ1,circ2,circ3,circ4; //rounds circle
    private Image healthbar, health1, health2; //health
    private Image victory1, victory2; //victory gif
    private Image fight; //fight gif
    
    private int TIMELIMIT, seconds ,dSeconds; 
    private int width1, height1;
    private int width2, height2; 
    private int roundNo;
    
    private String str;
    private String p1Name;
    private String p2Name;
    
    private Stack<Integer> life; 
    private Stack<Integer> life2; 
    private int totallife1, totallife2, pos2;
   
    public GamePanel(GameMain gm) {
        
        initComponents();
        
        //CLASSES
        this.gm = gm;
        chars = gm.getCharSelectionClass();        
        am = gm.getAudioManager();
        rm = gm.getRoundManager();
        
        //GAME SPEED
        gameSpeedTimer = new Timer(GAMESPEED,this);
        gameSpeedTimer.start();
        seconds = 0;
        
        //GAME TIMER
        TIMELIMIT = 99; //time limit
        timeLimitTimer = new Timer(1000,this); //1000ms = 1 second
        str = "" + TIMELIMIT;
        timeLimitTimer.start();
        
        //DELAY TIMER
        delay = new Timer(1000,this);
        dSeconds = 0;
        
        //CHARACTER NAMES
        p1Name = chars.getP1Name();
        p2Name = chars.getP2Name();
        
        //CHARACTER IMAGES
        player1 = chars.getPlayer1();
        player2 = chars.getPlayer2();
        width1 = chars.width;
        width2 = chars.width;
        height1 = chars.height;
        height2 = chars.height;
        
        //CONTROLS
        c = new ControlEvent(this); 
         
        //images
        storingImages();
        
        //life
        pos2 = 325;
        totallife1 = 0;
        totallife2 = 0;
        stackLife();
        
        //roundNo
        roundNo = gm.getRoundNo();
        
        setVisible(true);
        setSize(600,340);
        setFocusable(true);
    
    }

    public void storingImages(){
        //background
        i = new ImageIcon(getClass().getResource(chars.getBackgroundFile()));
        bg = i.getImage();
        
        //health container
        i = new ImageIcon(getClass().getResource("/fightingGame/res/bars.png"));
        healthbar = i.getImage();
        
        //healthbar of player1
        i = new ImageIcon(getClass().getResource("/fightingGame/res/HEALTH1.png"));
        health1 = i.getImage();
       
        //victory gif
        i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/" + getP1Name() + "/player1/victory.gif"));
        victory1 = i.getImage();
        i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/" + getP2Name() + "/player2/victory.gif"));
        victory2 = i.getImage();
        
        //healthbar of player2
        i = new ImageIcon(getClass().getResource("/fightingGame/res/HEALTH1.png"));
        health2 = i.getImage();
        
        //player 1 character picture
        i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/" + getP1Name() + "/char.png"));
        pic1 = i.getImage();
        
        //player 2 character picture
        i = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/" + getP2Name() + "/char.png"));
        pic2 = i.getImage();
        
        //win circle icon
        i = new ImageIcon(getClass().getResource("/fightingGame/res/round.png"));
        round = i.getImage();
        i = new ImageIcon(getClass().getResource("/fightingGame/res/winround.png"));
        winround = i.getImage();
        
    }
    
    public void stackLife(){
        life = new Stack<Integer>();
        life2 = new Stack<Integer>();
        for(int counter = 0; counter<=24; counter++) {
            life.push(9);
            life2.push(9);
        }   
    }
    
    public void actionPerformed(ActionEvent evt){
        //GAMESPEED TIMER
        if(evt.getSource() == gameSpeedTimer){
            c.movePlayer1();
            c.movePlayer2();
            repaint();
        }
        
        //SECONDS TIMER
        else if(evt.getSource() == timeLimitTimer){
            seconds++;
            
            if(seconds == 1){
                switch(roundNo){
                    case 1: am.playRound1(); break;
                    case 2: am.playRound2(); break;
                    case 3: am.playFinalRound(); break;
                }
            }
            
            else if(seconds == 3){
                
                switch(roundNo){
                    case 1: 
                        i = new ImageIcon(getClass().getResource("/fightingGame/res/fight1.gif"));
                        fight = i.getImage();
                        break;
                    case 2: 
                        i = new ImageIcon(getClass().getResource("/fightingGame/res/fight2.gif"));
                        fight = i.getImage();
                        break;
                    case 3: 
                        i = new ImageIcon(getClass().getResource("/fightingGame/res/fight3.gif"));
                        fight = i.getImage();
                        break;
                }
                repaint();
            }
            
            else if(seconds == 4){
                am.playFight();
                addKeyListener(new AL());
            }
            
            else if(seconds >= 6){
                //START COUNTING THE TIME LIMIT TIMER
                TIMELIMIT--;
                str = TIMELIMIT + "";
                repaint(); 
                
                //IF ONE PLAYER IS DEFEATED
                if(life.empty() || life2.empty()){
                    timeLimitTimer.stop();
                }
                
                if(TIMELIMIT<=0){
                    timeLimitTimer.stop();
                }
            }
        }
        
        else if(evt.getSource() == delay){
            dSeconds++;
            if(dSeconds == 2){
                gameSpeedTimer.stop();
            }
            
            if(dSeconds == 3){
                am.playVictory();
                
                if(isPlayer1Dead()==true){
                    setWidth2(100);
                    setPlayer2(victory2);
                    repaint();
                }
                
                if(isPlayer2Dead()==true){
                    setWidth1(100);
                    setPlayer1(victory1);
                    repaint();
                }
            }
            
            if(dSeconds == 7){
                setVisible(false);
                
                if(isPlayer1Dead() == true){
                    rm.incrementP2Wins();
                }else if(isPlayer2Dead()==true){
                    rm.incrementP1Wins();
                }
                
                rm.incrementRound();
                if(rm.getRoundNo()==4 || rm.getP1Wins() == 2 || rm.getP2Wins() == 2){
                    setVisible(false);
                    gm.remove(this);
                    Countdown c1 = new Countdown(gm);
                    gm.dispose();
                    c1.setFocusable(true);
                }else{
                    //NEXT ROUND
                    new GameMain(chars, rm);
                    gm.dispose();
                }
            }
        }
    }
    
    public int getDelay(){
        return dSeconds;
    }
    
    private class AL extends KeyAdapter{ 
        public void keyPressed(KeyEvent e){
            c.keyPressed(e);
            System.out.println(e.getKeyChar());
        }
        
        public void keyReleased(KeyEvent e){
            c.keyReleased(e);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        //drawing background
        g.drawImage(bg, 0, 0, 600, 340, this); 
        
        //drawing health bar containers
        g.drawImage(healthbar, 0, 0, 600, 100,null);
        
        //drawing player1 health bar
        g.drawImage(health1, 50,21 ,getTotalLife1(),20, null);
        
        //drawing player2 health bar
        g.drawImage(health2, pos2, 21 ,getTotalLife2(),20, null);

        //drawing timer
        g.setFont(new Font("Tahoma" , Font.PLAIN, 40));  
        g.setColor(Color.WHITE);
        g.drawString(str, 279, 50);
        
        //drawing names
        g.setFont(new Font("Tahoma" , Font.BOLD, 14));
        g.drawString(p1Name ,60, 57);
        g.drawString(p2Name,500, 57);
        
        //drawing round bullets
        switch(rm.getP1Wins()){
            case 1: 
                circ1 = winround; 
                circ2 = round; 
                break;
            case 2: 
                circ1 = winround; 
                circ2 = winround;
                break;
            default:
                circ1 = round;
                circ2 = round;
        }
        
        switch(rm.getP2Wins()){
            case 1: 
                circ3 = round;
                circ4 = winround; 
                break;
            case 2: 
                circ3 = winround; 
                circ4 = winround;
                break;
            default:
                circ3 = round;
                circ4 = round;
        }
        g.drawImage(circ1, 165, 43, 23, 23, null);
        g.drawImage(circ2, 190, 43, 23, 23, null);
        g.drawImage(circ3, 385, 43, 23, 23, null);
        g.drawImage(circ4, 410, 43, 23, 23, null);
        
        //drawing character pictures
        g.drawImage(pic1, 1, 18, 46, 54, null);
        g.drawImage(pic2, 552, 18, 46, 54, null);
        
        //drawing the characters
        g.drawImage(player1, c.getX(), c.getY(), width1, height1, null); //player1
        g.drawImage(player2, c.getX2(), c.getY2(), width2, height2, null); //player2
        
        //ROUND gif
        g.drawImage(fight, 215, 135, 180, 80, null);
    }

    public ControlEvent getControlEvent(){
        return c;
    }    
    
    private int getTotalLife1(){
        totallife1 = 0;
        for(int counter = 0; counter<=life.size()-1; counter ++) {
            totallife1 += life.get(counter);
        }

        return totallife1;
    }
    
    private int getTotalLife2(){
       totallife2 = 0;
       for(int counter = 0; counter<=life2.size()-1; counter ++) {
           totallife2 += life2.get(counter);
       }

       return totallife2;
    }
    
    public void player1Hit(){
        try{
            life.pop();
        }catch(java.util.EmptyStackException e){ System.err.println("PLAYER 1 DEAD!"); }
        
        if(!life.isEmpty()){
            am.playOuch2();
        }
            
        else if(life.isEmpty()){
            am.stopFight();
            am.playCry();
            delay.start();
        }
            //am.playLaugh();
            //am.playVictory();
    }
    
    public void player2Hit(){
        try{
            life2.pop();
        }catch(java.util.EmptyStackException e){ System.err.println("PLAYER 2 DEAD!"); }
        pos2 += 9;
        repaint();
        
        if(!life2.isEmpty()){
            am.playOuch2();
        }
        
        else if(life2.isEmpty()){
            am.stopFight();
            am.playCry();
            delay.start();
        }
    }  

    public boolean isPlayer1Dead(){
        return life.isEmpty();
    }
    
    public boolean isPlayer2Dead(){
        return life2.isEmpty();
    }
    
    public int getWidth1(){
        return width1;
    }
    
    public int getWidth2(){
        return width2;
    }
    
    public void setWidth1(int width){
        width1 = width;
    }
    
    public void setWidth2(int width){
        width2 = width;
    }
    
    public void setHeight1(int height) {
        height1 = height;
    }
    
    public void setHeight2(int height){
        height2 = height;
    }
    
    public String getP1Name(){
        return p1Name;
    }
    
    public String getP2Name(){
        return p2Name;
    }
    
    public void setPlayer1(Image i){
        player1 = i;
        repaint();
    }
    
    public void setPlayer2(Image i){
        player2 = i;
        repaint();
    }
    
    public Image getPlayer1(){
        return player1;
    }
    
    public Image getPlayer2(){
        return player2;
    }
    
    public AudioManager getAudioManager(){
        return am;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
