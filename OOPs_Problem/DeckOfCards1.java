package OOPs_Problem;


import java.util.*;

public class DeckOfCards1  {
    public static void main(String[] args) {
        
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Initialize deck
        String[] deck = new String[52];
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[i * ranks.length + j] = ranks[j] + " of " + suits[i];
            }
        }
        
    
        Collections.shuffle(Arrays.asList(deck));
        
        
        String[][] players = new String[4][9];
        int cardIndex = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        
    
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}

