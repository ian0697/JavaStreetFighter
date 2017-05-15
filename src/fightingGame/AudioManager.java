package fightingGame;

import java.applet.AudioClip;
import javax.swing.JApplet;

public class AudioManager {
    //BACKGROUND MUSIC
    AudioClip menu = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/menu.wav")); 
    AudioClip stage = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/stage.wav"));
    AudioClip fight = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/fight.wav"));
    
    //CLICK SOUND EFFECTS
    AudioClip click = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/click.wav"));
    AudioClip click2 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/click2.wav"));
    AudioClip click3 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/click3.wav"));
    
    //ANNOUNCER SOUND EFFECTS
    AudioClip round1 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/round1.wav"));
    AudioClip round2 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/round2.wav"));
    AudioClip round3 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/final.wav"));
    AudioClip countdown = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/countdown.wav"));
    
    //ATTACK HIT SOUND EFFECTS
    AudioClip hit1 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/hit1.wav")); 
    AudioClip hit2 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/hit2.wav"));
    AudioClip hit3 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/hit3.wav"));
    
    //FAIL HIT SOUND EFFECTS
    AudioClip fail1 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/fail1.wav")); 
    AudioClip fail2 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/fail2.wav"));
    AudioClip fail3 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/fail3.wav"));
    
    //CHARACTER VOICE
    AudioClip ouch1 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/ouch1.wav")); 
    AudioClip ouch2 = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/ouch2.wav"));
    AudioClip cry = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/cry.wav")); 
    AudioClip victory = JApplet.newAudioClip(getClass().getResource("/fightingGame/res/audio/victory.wav")); 
    
    public void playMenu(){
        menu.loop();
    }
    
    public void stopMenu(){
        menu.stop();
    }
    
    public void playStage(){
        stage.loop();
    }
    
    public void stopStage(){
        stage.stop();
    }
    
    public void playFight(){
        fight.loop();
    }
    
    public void stopFight(){
        fight.stop();
    }
    
    public void playRound1(){
        round1.play();
    }
    
    public void playRound2(){
        round2.play();
    }
    
    public void playFinalRound(){
        round3.play();
    }
    
    public void playClick(){
        click.play();
    }
   
    public void playClick2(){
        click2.play();
    }
    
    public void playClick3(){
        click3.play();
    }
    
    public void playHit1(){
        hit1.play();
    }
    
    public void playHit2(){
        hit2.play();
    }
    
    public void playHit3(){
        hit3.play();
    }
    
    public void playFail1(){
        fail1.play();
    }
    
    public void playFail2(){
        fail2.play();
    }
    
    public void playFail3(){
        fail3.play();
    }
    
    public void playOuch1(){
        ouch1.play();
    }
    
    public void playOuch2(){
        ouch2.play();
    }
    
    public void playCry(){
        cry.play();
    }
    
    public void playVictory(){
        victory.play();
    }
    
    public void playCountdown(){
        countdown.play();
    }
    
    public void stopCountdown(){
        countdown.stop();
    }
    
}
