/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adamt
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
   @Test
  public void wagerTest(){
Player p=new Player();
p.setWager(500);
assertEquals(500,p.getWager());
}

 @Test
  public void MoneyTest(){
Player p=new Player();
p.moneyLost(100);
assertEquals(900,p.getMoney());
p.moneyGained(1000);
assertEquals(1900,p.getMoney());

}


    
}
