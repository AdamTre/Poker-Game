/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.ArrayList;

/**
 *
 * @author charlotteolaniyi
 */
public class Poker {

public static Deck d;
public static Player p1;
 public static boolean aiTurn=false;
 public static boolean playerTurn=true;

int round=1;

Card c= new Card(0,12);

public void turnCheck(){
if(aiTurn&&playerTurn==false){

}
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        p1 = new Player();
        d = new Deck();

p1.getHand().addToHand(new Card(2,12));
p1.getHand().addToHand(new Card(3,10));
p1.getHand().addToHand(new Card(1,11));
p1.getHand().addToHand(new Card(2,12));
p1.getHand().addToHand(new Card(3,0));
p1.getHand().addToHand(new Card(1,12));

//
System.out.println(p1.getHand().is3OfAKind());

        d.shuffle();
       // StartPage s = new StartPage ();
        
        
      //  s.setVisible(true);
    }



    
}
