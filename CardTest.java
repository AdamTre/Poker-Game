/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;



/**
 *
 * @author charlotteolaniyi
 */
class CardTest {
  
   @Test
   void testConstructorPositiveScenario() throws IllegalAccessException {
       Card card = new Card(2,10);
       assertEquals(2, card.getSuit());
       assertEquals(10, card.getValue());
   }
  
   @Test
   void testConstructorInvalidCardSuit() throws IllegalAccessException {
       IllegalArgumentException invalidSuit = assertThrows(IllegalArgumentException.class, () -> new Card(6,10));
       assertEquals(invalidSuit.getMessage(),"Suit int must be between 0 and 3");
   }
  
   @Test
   void testConstructorInvalidCardValue() throws IllegalAccessException {
       IllegalArgumentException invalidValue = assertThrows(IllegalArgumentException.class, () -> new Card(2,16));
       assertEquals(invalidValue.getMessage(),"value int must be between 0 and 12");
   }
  
   @Test
   void testToString() throws IllegalAccessException {
       Card card = new Card(2,10);
       assertEquals("King of Hearts", card.toString());
   }
  
   @Test
   void testGetImage() throws IllegalAccessException {
       Card card = new Card(2,10);
       assertEquals("/KingHearts.png", card.getImage());
   }
  
}


