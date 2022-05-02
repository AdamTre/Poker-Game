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
public class DeckTest {
    
    public DeckTest() {
    }

    @Test
    public void testCount(){
    Deck d= new Deck();
   int expected=52;
   int input= d.countCards();
    assertEquals(expected,input);

}

    @Test
    public void testDeal(){
      Deck d1= new Deck();
      while(d1.countCards()!=0){
      d1.deal();
}
     assertTrue(0==d1.countCards());

}


    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
