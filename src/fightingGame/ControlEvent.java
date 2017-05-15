/*
 * Programmed by: Michael Ian A. Santiago
 * Course/yr: BCS22
 * 
 */
package fightingGame;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class ControlEvent {
 
    private final GamePanel panel;
    private AudioManager am;
    private ImageIcon pic[];
    private Image p1, p2;
    private Image normal1, normal2;
    private Image punch1, punch2;
    private Image kick1, sKick1;
    private Image kick2, sKick2;
    private Image walk1, walk2;
    private Image lose1, lose2;
    private String movement1[];
    private String movement2[];
    
    private int x,y;
    private int x2,y2;
    private int dX,dX2;
    
    public ControlEvent(GamePanel panel){
        this.panel = panel;
        am = panel.getAudioManager();
        init();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                 
    public void init(){
        p1 = panel.getPlayer1();
        p2 = panel.getPlayer2();
        normal1 = p1;
        normal2 = p2;
        
        movement1 = new String[4];
        movement2 = new String[4];
        pic = new ImageIcon[4];
        
        /*
        NOTE: DEFINITION OF EACH INDEX OF THE 'MOVEMENT' ARRAY (both player1 and player2)
            movement[0] = walking
            movement[1] = punch 
            movement[2] = kick1
            movement[3] = kick2
        */
        
        //PLAYER1 'MOVEMENT1' STRING INITIALIZATION
        movement1[0] = "/fightingGame/res/SPRITES/" + panel.getP1Name() + "/player1/walking.gif"; //WALKING
        movement1[1] = "/fightingGame/res/SPRITES/" + panel.getP1Name() + "/player1/punch.gif"; //PUNCH
        movement1[2] = "/fightingGame/res/SPRITES/" + panel.getP1Name() + "/player1/kick1.gif"; //KICK1
        movement1[3] = "/fightingGame/res/SPRITES/" + panel.getP1Name() + "/player1/kick2.gif"; //KICK2
        
        //PLAYER2 'MOVEMENT2' STRINGS INITIALIZATION
        movement2[0] = "/fightingGame/res/SPRITES/" + panel.getP2Name() + "/player2/walking.gif"; //WALKING
        movement2[1] = "/fightingGame/res/SPRITES/" + panel.getP2Name() + "/player2/punch.gif"; //PUNCH
        movement2[2] = "/fightingGame/res/SPRITES/" + panel.getP2Name() + "/player2/kick1.gif"; //KICK1
        movement2[3] = "/fightingGame/res/SPRITES/" + panel.getP2Name() + "/player2/kick2.gif"; //KICK2
        
        //PLAYER1 IMAGES(.GIF) INITIALIZATION
        pic[0] = new ImageIcon(getClass().getResource(movement1[0])); //WALKING
        walk1 = pic[0].getImage();
        
        pic[1] = new ImageIcon(getClass().getResource(movement1[1])); //PUNCH
        punch1 = pic[1].getImage();
        
        pic[2] = new ImageIcon(getClass().getResource(movement1[2])); //KICK1
        kick1 = pic[2].getImage();
        
        pic[3] = new ImageIcon(getClass().getResource(movement1[3])); //KICK2
        sKick1 = pic[3].getImage();

        
        pic[0] = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/" + panel.getP1Name() + "/player1/lose.gif"));
        lose1 = pic[0].getImage();
        
        pic[0] = new ImageIcon(getClass().getResource("/fightingGame/res/SPRITES/" + panel.getP2Name() + "/player2/lose.gif"));
        lose2 = pic[0].getImage();
        
        //PLAYER2 IMAGES(.GIF) INITIALIZATION
        pic[0] = new ImageIcon(getClass().getResource(movement2[0])); //WALKING
        walk2 = pic[0].getImage();
        
        pic[1] = new ImageIcon(getClass().getResource(movement2[1])); //PUNCH
        punch2 = pic[1].getImage();
        
        pic[2] = new ImageIcon(getClass().getResource(movement2[2])); //KICK1
        kick2 = pic[2].getImage();
        
        pic[3] = new ImageIcon(getClass().getResource(movement2[3])); //KICK2
        sKick2 = pic[3].getImage();
        
        //POSITION INITIALIZATIONS
        x = 70;
        y = 170;
        x2 = 450;
        y2 = 170;
        dX = 0;
        dX2 = 0;
    }
    // </editor-fold>  
    
    public void keyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
        int left,right;
        int left2,right2;
        int punch,  atk1, sAtk1;
        int punch_2, atk2, sAtk2;
        
        
        left = KeyEvent.VK_A;
        right = KeyEvent.VK_D;
        punch = KeyEvent.VK_Q; 
        atk1 = KeyEvent.VK_W; //kick1 
        sAtk1 = KeyEvent.VK_E; //kick2
        
        left2 = KeyEvent.VK_LEFT;
        right2 = KeyEvent.VK_RIGHT;
        punch_2 = KeyEvent.VK_NUMPAD1;
        atk2 = KeyEvent.VK_NUMPAD2; //kick1
        sAtk2 = KeyEvent.VK_NUMPAD3; //kick2
        
        /********PLAYER 1 CONTROLS*********/
        if(key == left || key == right)
            if(panel.getP1Name().equals("Cliff") || panel.getP1Name().equals("Pasta"))
                panel.setWidth1(80);
        
        if(key == left){
            p1 = walk1;
            
            if(x  >= 0)
                dX = -2;
            
            else
                dX = 0;
        }
        
        if(key == right){
            p1 = walk1;
            dX = 2;
            
            if(x >= x2 - panel.getWidth2()){
                dX = 0;
            }else{ dX = 2; }
            
        }
        
        if(key == punch){
            p1 = punch1;
            
            if(panel.getP1Name().equals("Cliff") || panel.getP1Name().equals("Pasta"))
                panel.setWidth1(120);
            else 
                panel.setWidth1(100);
            
            
            //COLLISION
            if(x + panel.getWidth1() >= x2){
                panel.player2Hit();
                am.playHit1();
                if(panel.isPlayer2Dead()){
                    panel.setWidth2(140);
                    x2+=20;
                    p2 = lose2;
                }
            }
            else{
                am.playFail1();
            }
        }
        
        if(key == atk1){
            p1 = kick1;
            
            if(panel.getP1Name().equals("Cliff") || panel.getP1Name().equals("Pasta"))
                panel.setWidth1(120);
            else 
                panel.setWidth1(100);
            
            //COLLISION
            if(x + panel.getWidth1() >= x2){
                panel.player2Hit();
                am.playHit2();
                if(panel.isPlayer2Dead()){
                    panel.setWidth2(140);
                    x2+=20;
                    p2 = lose2;
                }
            }
            else{
                am.playFail2();
            }
        }
        
        if(key == sAtk1){
            p1 = sKick1;
            
            if(panel.getP1Name().equals("Cliff") || panel.getP1Name().equals("Pasta"))
                panel.setWidth1(60);
            else 
                panel.setWidth1(100);
            
            
            //COLLISION
            if(x + panel.getWidth1() >= x2){
                panel.player2Hit();
                am.playHit3();
                if(panel.isPlayer2Dead()){
                    panel.setWidth2(140);
                    x2+=20;
                    p2 = lose2;
                }
            }
            else{
                am.playFail3();
            }
        }
        
        /********PLAYER 2 CONTROLS**********/
        if(key == left2 || key == right2)
            if(panel.getP2Name().equals("Cliff") || panel.getP2Name().equals("Pasta"))
                panel.setWidth2(80);
        
        if(key == left2){
            p2 = walk2;
            
            if(x2 <= x + panel.getWidth1())
                dX2 = 0;
            
            else 
                dX2 = -2;
        }
        
        if(key == right2){
            p2 = walk2;
            
            if(x2  <= 520)
                dX2 = 2;
            
            else
                dX2 = 0;
        }
        
        if(key == punch_2){
            p2 = punch2;
            
            if(panel.getP2Name().equals("Cliff") || panel.getP2Name().equals("Pasta"))
                panel.setWidth2(120);
            else
                panel.setWidth2(100);
            
            
            //COLLISION
            if(x2 - panel.getWidth2()<= x){
                panel.player1Hit();
                am.playHit1();
                
                if(panel.isPlayer1Dead()){
                    panel.setWidth1(140);
                    x-=20;
                    p1 = lose1;
                }
            }
            else{
                am.playFail1();
            }
        }
        
        if(key == atk2){
            p2 = kick2;
            panel.setWidth2(100);
            
            if(panel.getP2Name().equals("Cliff") || panel.getP2Name().equals("Pasta"))
                panel.setWidth2(120);
            else
                panel.setWidth2(100);
            
            //COLLISION
            if(x2 - panel.getWidth2() <= x){
                panel.player1Hit();
                am.playHit2();
                if(panel.isPlayer1Dead()){
                    panel.setWidth1(140);
                    x-=20;
                    p1 = lose1;
                }
            }
            else{
                am.playFail2();
            }
        }
        
        if(key == sAtk2){
            p2 = sKick2;
            
            if(panel.getP2Name().equals("Cliff") || panel.getP2Name().equals("Pasta"))
                panel.setWidth2(60);
            else
                panel.setWidth2(100);
            
            //COLLISION
            if(x2 - panel.getWidth2() <= x){
                panel.player1Hit();
                am.playHit3();
                
                if(panel.isPlayer1Dead()){
                    panel.setWidth1(140);
                    x-=20;
                    p1 = lose1;
                }
            }
            else{
                am.playFail3();
            }
        }
    }
    
    public void keyReleased(KeyEvent evt){
        int key = evt.getKeyCode();
        int left,right;
        int left2,right2;
        int punch,  atk1, sAtk1;
        int punch_2, atk2, sAtk2;
        
        left = KeyEvent.VK_A;
        right = KeyEvent.VK_D;
        punch = KeyEvent.VK_Q; 
        atk1 = KeyEvent.VK_W; //kick1 
        sAtk1 = KeyEvent.VK_E; //kick2
        
        left2 = KeyEvent.VK_LEFT;
        right2 = KeyEvent.VK_RIGHT;
        punch_2 = KeyEvent.VK_NUMPAD1;
        atk2 = KeyEvent.VK_NUMPAD2; //kick1
        sAtk2 = KeyEvent.VK_NUMPAD3; //kick2
        
        if(key == left || key == right){
            p1 = normal1;
            dX = 0;
            if(key == left || key == right)
                if(panel.getP1Name().equals("Cliff") || panel.getP1Name().equals("Pasta"))
                    panel.setWidth1(60);
        }
        
        if(key == punch){
            p1 = normal1;
            
            if(panel.getP1Name().equals("Cliff") || panel.getP1Name().equals("Pasta"))
                panel.setWidth1(60);
            else
                panel.setWidth1(80);
            
            if(panel.isPlayer2Dead()){
                panel.setWidth2(140);
                x2+=20;
                p2 = lose2;
            }
            
            
        }

        if(key == atk1){
            p1 = normal1;
           
            if(panel.getP1Name().equals("Cliff") || panel.getP1Name().equals("Pasta"))
                panel.setWidth1(60);
            else
                panel.setWidth1(80);
            
            if(panel.isPlayer2Dead()){
                panel.setWidth2(140);
                x2+=20;
                p2 = lose2;
            }
        }

        if(key == sAtk1){
            p1 = normal1;
            
            if(panel.getP1Name().equals("Cliff") || panel.getP1Name().equals("Pasta"))
                panel.setWidth1(60);
            else
                panel.setWidth1(80);
            
            if(panel.isPlayer2Dead()){
                panel.setWidth2(140);
                x2+=20;
                p2 = lose2;
            }
        }
        //PLAYER 2 CONTROLS
        if(key == left2 || key == right2){
            p2 = normal2;
            dX2 = 0;
            if(key == left2 || key == right2)
                if(panel.getP2Name().equals("Cliff") || panel.getP2Name().equals("Pasta"))
                    panel.setWidth2(60);
        }
        
        if(key == punch_2){
            p2 = normal2;
            dX = 0;
            
            if(panel.getP2Name().equals("Cliff") || panel.getP2Name().equals("Pasta"))
                panel.setWidth2(60);
            else
                panel.setWidth2(80);
            
            if(panel.isPlayer1Dead()){
                panel.setWidth1(140);
                x-=20;
                p1 = lose1;
            }
        }
        
        if(key == atk2){
            p2 = normal2;
            
            if(panel.getP2Name().equals("Cliff") || panel.getP2Name().equals("Pasta"))
                panel.setWidth2(60);
            else
                panel.setWidth2(80);
            
            if(panel.isPlayer1Dead()){
                panel.setWidth1(140);
                x-=20;
                p1 = lose1;
            }
        }
        
        if(key == sAtk2){
            p2 = normal2;
            
            if(panel.getP2Name().equals("Cliff") || panel.getP2Name().equals("Pasta"))
                panel.setWidth2(60);
            else
                panel.setWidth2(80);
            
            if(panel.isPlayer1Dead()){
                panel.setWidth1(140);
                x-=20;
                p1 = lose1;
            }
        }
        
    }
    
    public void movePlayer1(){
        x += dX;
        panel.setPlayer1(p1);
    }
    
    public void movePlayer2(){
        x2+=dX2;
        panel.setPlayer2(p2); 
        
    }
    
    public int getX(){
        return x;
    }
    
    public int getX2(){
        return x2;
    }
    
    public int getY(){
        return y;
    }
    
    public int getY2(){
        return y2;
    }
    
}
