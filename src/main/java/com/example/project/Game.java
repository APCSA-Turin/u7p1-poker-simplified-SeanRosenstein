package com.example.project;
import java.util.ArrayList;


public class Game{
    public static String determineWinner(Player p1, Player p2,String p1Hand, String p2Hand,ArrayList<Card> communityCards){
        if (Utility.getHandRanking(p1Hand)>Utility.getHandRanking(p2Hand)){
            return "Player 1 wins!";
        }    
        if (Utility.getHandRanking(p1Hand)<Utility.getHandRanking(p2Hand)){
            return "Player 2 wins!";
        }  
        if (Utility.getHandRanking(p1Hand)==Utility.getHandRanking(p2Hand)){

            int p1High = Math.max(Utility.getRankValue(p1.getHand().get(1).getRank()),Utility.getRankValue(p1.getHand().get(0).getRank()));
            int p2High = Math.max(Utility.getRankValue(p2.getHand().get(1).getRank()),Utility.getRankValue(p2.getHand().get(0).getRank()));
            if (p1High>p2High){
                return "Player 1 wins!";
            }
            else if (p1High<p2High){
                return "Player 2 wins!";
            }
            else{
                return "Tie!";
            }
        }  
        return "-1";
    }

    public static void play(){ //simulate card playing

    }
        
        

}