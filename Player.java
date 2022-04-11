/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poker;

import java.util.ArrayList;

/**
 *
 * @author adamt
 */
public class Player {

    private int money;
    private int wager;
    private Hand hand;

public Player(){
money=1000;
wager=0;
hand=new Hand();
}

public Hand getHand(){
return hand;
}

public void setWager(int i){
wager=i;

}

public int getWager(){
return wager;

}

public int moneyGained(int i){
    money+=i;
    return money;
}

public int moneyLost(int i){
    money-=i;
    return money;
}


public int getMoney(){
return money;

}









}
