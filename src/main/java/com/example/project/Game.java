package com.example.project;
import java.util.ArrayList;


public class Game{
    public static String determineWinner(Player p1, Player p2,String p1Hand, String p2Hand,ArrayList<Card> communityCards){
        if (Utility.getHandRanking(p1Hand)>Utility.getHandRanking(p2Hand)){ //if p1 hand ranking > p2 hand ranking p1 wins
            return "Player 1 wins!";
        }    
        if (Utility.getHandRanking(p1Hand)<Utility.getHandRanking(p2Hand)){ //if p2 hand ranking > p1 hand ranking p1 wins
            return "Player 2 wins!";
        }  
        if (Utility.getHandRanking(p1Hand)==Utility.getHandRanking(p2Hand)){ //if the hand ranking is the same look at the high card

            int p1High = Math.max(Utility.getRankValue(p1.getHand().get(1).getRank()),Utility.getRankValue(p1.getHand().get(0).getRank())); //variable to store p1 high card
            int p2High = Math.max(Utility.getRankValue(p2.getHand().get(1).getRank()),Utility.getRankValue(p2.getHand().get(0).getRank())); //variable to store p2 high card
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