/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adamt
 */
public class PokerTest {
    private Poker p=new Poker();
    public PokerTest() {
        Poker p=new Poker();
    }
    
  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
public void newGameTest(){
    p.startNewGame();
    for(int i=0;i<3;i++){
        assertTrue(p.getDealerHand().getCard(i)==p.getPlayer2().getHand().getCard(i+3)&&p.getDealerHand().getCard(i)==p.getPlayer1().getHand().getCard(i+3));
        assertFalse(p.getDealerHand().getCard(i)==p.getPlayer2().getHand().getCard(i)&&p.getDealerHand().getCard(i)==p.getPlayer1().getHand().getCard(i));
}
}

@Test
public void startNewRound(){
    p.startNewGame();
    p.startNewRound();
    assertEquals(1,p.getRound());
    assertTrue(p.getP1Turn()==p.getAITurn()&&p.getP1Turn());
}

@Test
public void holdTest(){
    p.setP1Turn(false);
    p.setaiTurn(false);
    p.aiHold();
    p.Hold();

   assertTrue(p.getP1Turn()==p.getAITurn()&&p.getP1Turn());
}

@Test
public void raiseTest(){
p.Raise(999, p.getPlayer1());

assertEquals(999,p.getPlayer1().getWager());

}

@Test
public void callTest(){
p.Raise(500, p.getPlayer2());
p.Call();

assertEquals(500,p.getPlayer1().getWager());

p.Raise(323, p.getPlayer1());
p.aiCall();

assertEquals(823,p.getPlayer2().getWager());


}

@Test
public void getWinnerTest(){

p.getPlayer2().getHand().addToHand(new Card(0,0));
p.getPlayer2().getHand().addToHand(new Card(0,1));
p.getPlayer2().getHand().addToHand(new Card(0,2));
p.getPlayer2().getHand().addToHand(new Card(0,3));
p.getPlayer2().getHand().addToHand(new Card(0,4));
p.getPlayer2().getHand().addToHand(new Card(0,12));

p.getPlayer1().getHand().addToHand(new Card(0,7));
p.getPlayer1().getHand().addToHand(new Card(0,8));
p.getPlayer1().getHand().addToHand(new Card(0,9));
p.getPlayer1().getHand().addToHand(new Card(0,10));
p.getPlayer1().getHand().addToHand(new Card(0,11));
p.getPlayer1().getHand().addToHand(new Card(0,12));


p.getPlayer1().setWager(500);
p.getPlayer2().setWager(550);

assertEquals(1,p.getWinner());
assertEquals(1550,p.getPlayer1().getMoney());

}



}
