

public class Card {
    
private int suit, value;
private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
private String[] cardValue = { "2", "3", "4", "5",
"6", "7", "8", "9", "10", "Joker", "King", "Queen","Ace"};

public Card(int cSuit, int cValue) {
if(cSuit<0||cSuit>3){
throw new IllegalArgumentException("Suit int must be between 0 and 3");
}
if(cValue<0||cValue>12){
throw new IllegalArgumentException("value int must be between 0 and 12");
}


suit = cSuit;
value = cValue;
}
public int getSuit(){
return suit;
}

public int getValue(){
return value;
}



public String toString() {
String cardInfo = cardValue[value] + " of " + cardSuit[suit];
return cardInfo;
}

public String getImage(){

return "/"+cardValue[value]+cardSuit[suit]+".png";
}


}
