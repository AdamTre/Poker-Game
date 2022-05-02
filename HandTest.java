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
public class HandTest {
    
    public HandTest() {
    }
    

@Test
public void pairTest(){
Hand h= new Hand();
h.addToHand(new Card(0,0));
h.addToHand(new Card(2,12));
h.addToHand(new Card(0,12));
h.addToHand(new Card(1,2));
h.addToHand(new Card(2,8));
h.addToHand(new Card(0,5));

assertEquals(1,h.containsPairs());

}
    
@Test
public void is3OfAKindTest(){
Hand h= new Hand();
h.addToHand(new Card(0,1));
h.addToHand(new Card(2,4));
h.addToHand(new Card(0,11));
h.addToHand(new Card(1,4));
h.addToHand(new Card(2,11));
h.addToHand(new Card(0,4));

assertTrue(h.is3OfAKind());

}

@Test
public void is4OfAKindTest(){
    Hand h= new Hand();
    h.addToHand(new Card(0,1));
    h.addToHand(new Card(2,4));
    h.addToHand(new Card(0,11));
    h.addToHand(new Card(1,4));
    h.addToHand(new Card(2,4));
    h.addToHand(new Card(0,4));
assertTrue(h.is4OfAKind());

}
    @Test
public void isStriaght(){
    Hand h= new Hand();
    h.addToHand(new Card(0,1));
    h.addToHand(new Card(2,0));
    h.addToHand(new Card(0,2));
    h.addToHand(new Card(1,5));
    h.addToHand(new Card(2,3));
    h.addToHand(new Card(0,4));
assertTrue(h.isStraight());
}

    @Test
public void isFlush(){
    Hand h= new Hand();
    h.addToHand(new Card(0,1));
    h.addToHand(new Card(0,0));
    h.addToHand(new Card(0,2));
    h.addToHand(new Card(0,5));
    h.addToHand(new Card(0,3));
    h.addToHand(new Card(0,4));
assertTrue(h.isFlush());
}

@Test
public void isFullHouseTest(){
Hand h= new Hand();
h.addToHand(new Card(0,12));
h.addToHand(new Card(2,12));
h.addToHand(new Card(0,12));
h.addToHand(new Card(1,5));
h.addToHand(new Card(2,5));
h.addToHand(new Card(0,5));

assertTrue(h.isFullHouse());

}

@Test
public void isRoyalFlushTest(){
Hand h= new Hand();
h.addToHand(new Card(0,7));
h.addToHand(new Card(0,8));
h.addToHand(new Card(0,9));
h.addToHand(new Card(0,10));
h.addToHand(new Card(0,11));
h.addToHand(new Card(0,12));

assertTrue(h.isRoyalFlush());

}

@Test
public void isStraightFlushTest(){
Hand h= new Hand();
h.addToHand(new Card(0,0));
h.addToHand(new Card(0,1));
h.addToHand(new Card(0,2));
h.addToHand(new Card(0,3));
h.addToHand(new Card(0,4));
h.addToHand(new Card(0,12));

assertTrue(h.isStraightFlush());

}

@Test
public void clearCountTest(){
Hand h= new Hand();
h.addToHand(new Card(0,0));
h.addToHand(new Card(0,1));
h.addToHand(new Card(0,2));
h.addToHand(new Card(0,3));
h.addToHand(new Card(0,4));
h.addToHand(new Card(0,12));

assertEquals(6,h.countCards());
h.clearHand();
assertEquals(0,h.countCards());

}

@Test
public void compareToScore(){
Hand h= new Hand();
Hand h1= new Hand();
h.addToHand(new Card(0,0));
h.addToHand(new Card(0,1));
h.addToHand(new Card(0,2));
h.addToHand(new Card(0,3));
h.addToHand(new Card(0,4));
h.addToHand(new Card(0,12));

h1.addToHand(new Card(0,7));
h1.addToHand(new Card(0,8));
h1.addToHand(new Card(0,9));
h1.addToHand(new Card(0,10));
h1.addToHand(new Card(0,11));
h1.addToHand(new Card(0,12));

assertEquals(-1,h.compareTo(h1));


}


}