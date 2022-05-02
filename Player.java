
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
