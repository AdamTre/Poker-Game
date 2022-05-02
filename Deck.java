
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adamt
 */
public class Deck {
   private ArrayList<Card> deck = new ArrayList<Card>();

public Deck(){
ArrayList<Card> cdeck = new ArrayList<Card>();

for(int i=0;i<=3;i++){
    for(int j=0;j<13;j++){
      cdeck.add(new Card(i,j));
     
        }
    }
deck=cdeck;
}

public void printAllCards(){
    for(int i=0;i<deck.size();i++){
       System.out.println(deck.get(i).toString());
}
}

public Card getCard(int i){


       return deck.get(i);


}

public Card deal(){


       return deck.remove(0);


}


public int countCards(){
return deck.size();
}

public void shuffle(){
Collections.shuffle(deck,new Random());

}



}


