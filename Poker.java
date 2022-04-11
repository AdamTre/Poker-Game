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

private  Deck d;
private Hand dealerHand= new Hand();
private Player p1=new Player();
private Player p2= new Player();
 private static boolean aiTurn;
 public static boolean playerTurn;
private int round;

public void Poker(){

}

public int getRound(){
return round;
}
public void startNewGame(){
    d=new Deck();
    d.shuffle();
    p1.setWager(0);
    p2.setWager(0);
    //so the game doesn't end we are assuming the ai has infinite money
    p2.moneyGained(9999);
    round=0;
dealerHand.addToHand(d.deal());

    for(int i=0;i<3;i++){
        p1.getHand().addToHand(d.deal());
        p2.getHand().addToHand(d.deal());
        }

p1.getHand().addToHand(dealerHand.getCard(0));
p2.getHand().addToHand(dealerHand.getCard(0));

    playerTurn=true;
    aiTurn=true;
}
public Hand getDealerHand(){
return dealerHand;
}
public void startNewRound(){
round++;
System.out.println(round);
Card c= dealerHand.addToHand(d.deal());
p1.getHand().addToHand(c);
p2.getHand().addToHand(c);
    playerTurn=true;
    aiTurn=true;
}

public void Hold(){
playerTurn=true;
}

public void aiHold(){
aiTurn=true;

}

public void setP1Turn(Boolean b){
playerTurn=b;
}

public void setaiTurn(Boolean b){
aiTurn=b;
}

public void Fold(){
///
startNewGame();

}

public Player getPlayer1(){
return p1;
}

public Player getPlayer2(){
return p2;
}

public boolean getAITurn(){
return aiTurn;
}

public boolean getP1Turn(){
return playerTurn;
}

public void Raise(int i,Player p){
if(i+p.getWager()>p.getMoney()||i<1){
throw new IllegalArgumentException("Cannot bet. Wager invalid");
}else{
p.setWager(i+p.getWager());
}

}

public void Call(){
p1.setWager(p2.getWager());
}

public void aiCall(){
p2.setWager(p1.getWager());
}



public boolean turnOverCheck(){
//round is over
if(aiTurn==false&&playerTurn==false){
return true;
}
//round is not over
return false;
}


public int getWinner(){
int result= p1.getHand().compareTo(p2.getHand());
if(result==0){

}else if(result==1){
p1.moneyGained(p1.getMoney()+p2.getWager());
}else{
p1.moneyLost(p1.getMoney()-p1.getWager());
}







return result;
}
/*

    public static void main(String[] args) {
        p1 = new Player();
        d = new Deck();
        dealerHand = new Hand();
dealerHand.
        d.shuffle();
       StartPage s = new StartPage ();
        
        
       s.setVisible(true);
    }
*/



    
}

