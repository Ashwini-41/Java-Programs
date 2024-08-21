/*
 * Write a Program DeckOfCards.java, to initialize deck of cards having suit
("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
"9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
method and then distribute 9 Cards to 4 Players and Print the Cards received by
the 4 Players using 2D Array...
 */
package OOPs_Problem;

import java.util.Random;

public class DeckOfCards {
   private static final String[] Suits = {"Clubs","Diamonds","Hearts","Spades"};
   private static final String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

   private String[] deck = new String[52];

   private String[][] playerCards = new String[4][9];

   public DeckOfCards(){
    for(int i=0;i<Suits.length;i++){
        for(int j=0;j<Ranks.length;j++){
            deck[ i * Ranks.length + j] = Ranks[j] + " of " + Suits[i];
        }
     }
   }

   public void Shuffle(){
    Random random  = new Random();

    for(int i=0;i<deck.length;i++){
        int r = i + random.nextInt(deck.length - i);
        String temp = deck[i];
        deck[i] = deck[r];
        deck[r] = temp;
    }
   }
   public void distribute(){
    for(int i=0;i<4;i++){
        for(int j=0;j<9;j++){
            playerCards[i][j] = deck[i * 9 + j];
        }
    }
   }

   public void printCards(){
    int x =1;
    for(int i=0;i<4;i++){
        int no = 1;
       System.out.println("Player " + x + " Cards");
        
        for(int j=0;j<9;j++){
            System.out.println( no + ": " + playerCards[i][j] + " ");
            no++;
        }
        x++;
        System.out.println();
    }
   }
    public static void main(String[] args) {
        DeckOfCards card = new DeckOfCards();
        card.Shuffle();
        card.distribute();
        card.printCards();

    }
}
