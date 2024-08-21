package OOPs_Problem;

import java.util.Arrays;
import java.util.Random;

class Card {
    String Suits;
    String Ranks;

    public Card(String Suits , String Ranks){
        this.Suits = Suits;
        this.Ranks = Ranks;

    }

    public String getSuits(){
        return Suits;
    }
    public String getRank(){
        return Ranks;
    }
    @Override
    public String toString(){
        return Ranks + " of " + Suits;
    }
}

class Node{
    Card data;
    Node next;

    public Node(Card data){
       this.data = data;
       this.next = null;
    }
}

class Queue {
     Node front;
     Node rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }
    public void enqueue(Card card){
        Node newNode = new Node(card);

        if(rear == null){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public Card dequeue(){
        if(front ==   null){
            return null;
        }

        Node temp = front;
        front = front.next;

        if(front == null){
            rear = null;
        }
        return temp.data;
    }
    public boolean isEmplty(){
        return front == null;
    }

    public void displayQueue(){
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Player{
    String name;
    Queue cardsQueue;

    public Player(String name){
        this.name = name;
        this.cardsQueue = new Queue();
    }

    public void addCards(Card card){
        cardsQueue.enqueue(card);
    }

    public void sortCards(){
        Node current = cardsQueue.front;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        Card[] cardsArray = new Card[count];
        current = cardsQueue.front;

        for (int i = 0; i < count; i++) {
            cardsArray[i] = current.data;
            current = current.next;
        }

        Arrays.sort(cardsArray, (card1, card2) -> card1.getRank().compareTo(card2.getRank()));
       
        this.cardsQueue = new Queue();
        for(Card card : cardsArray){
            addCards(card);
        }
    }

    public void showCards(){
        System.out.println("Player " + name);
        cardsQueue.displayQueue();
    }
}

public class DeckOfCardsExtended {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Initialize deck
        Card[] deck = new Card[52];
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[i * ranks.length + j] = new Card(suits[i], ranks[j]);
            }
        }
 
         Random random  = new Random();
         for(int i=0;i<deck.length;i++){
              int r = i + random.nextInt(deck.length - i);
              Card temp = deck[i];
              deck[i] = deck[r];
              deck[r] = temp;
       }

       Player player[] = new Player[4];
       for(int i=0;i<4;i++){
        player[i] = new Player("Player " + (i + 1));
       }

    
        //String[][] players = new String[4][9];
        int cardIndex = 0;
        for (int i = 0; i < 9; i++) {
          
            for(Player players : player ){
                players.addCards(deck[cardIndex++]);
            }
        }
        
        for(Player players : player){
            players.sortCards();
        }

        Queue playerQueue = new Queue();
        for(Player players : player){
            playerQueue.enqueue(new Card(players.name, ""));
        }

        while (!playerQueue.isEmplty()) {
            Card playeCard = playerQueue.dequeue();
            for(Player players : player){
            if(players.name.equals(playeCard.getSuits())){
                players.showCards();
                System.out.println();
                break;
            }
           
         }
            
        }
    
    }
}
