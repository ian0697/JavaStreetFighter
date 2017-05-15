package fightingGame;

public class RoundManager {
    
    private int roundNo;
    private int p1Wins;
    private int p2Wins;
    
    public RoundManager(){
        roundNo = 1;
        p1Wins = 0;
        p2Wins = 0;
    }
    
    public int getRoundNo(){
        return roundNo;
    }
    
    public void incrementRound(){
        roundNo++;
    }
    
    public int getP1Wins(){
        return p1Wins;
    }
    
    public void incrementP1Wins(){
        p1Wins++;
    }
    
    public int getP2Wins(){
        return p2Wins;
    }
    
    public void incrementP2Wins(){
        p2Wins++;
    }
    
}
