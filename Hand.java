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
public class Hand {
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int score;

    public Hand(){

    }   

public Hand(ArrayList<Card> h){
    score=0;
    h=hand;
    }   

public int countCards(){
return hand.size();
}

public void clearHand(){
while(!hand.isEmpty()){
    hand.remove(0);
   }
       
}

public Card addToHand(Card c){
  hand.add(c);

return c;
}

public Card getCard(int i){
if(i<0||i>=hand.size()){
    throw new IllegalArgumentException("Invalid Range");
}else{
    return hand.get(i);
}

}

public void sortBySuit(){
    int smallNum=0;
    int j=0;
    int index=0;

    for(int i=1;i<hand.size();i++){
        smallNum = hand.get(i-1).getSuit();
        index = i-1;

             for(j=i;j<hand.size();j++){
               if(hand.get(j).getSuit()<smallNum){
                smallNum = hand.get(j).getSuit();
        }
    }
          swap(i-1, index);
    }
}



public void sortByValue(){
    int smallNum=0;
    int j=0;
    int index=0;

    for(int i=1;i<hand.size();i++){
        smallNum = hand.get(i-1).getValue();
        index = i-1;

             for(j=i;j<hand.size();j++){
               if(hand.get(j).getValue()<smallNum){
                smallNum = hand.get(j).getValue();
        }
    }
          swap(i-1, index);
    }
}

public void swap(int source, int dest){
    Card temp = hand.get(dest);
    hand.set(dest, hand.get(source));
    hand.set(source, temp);
}


public boolean isFlush(){
     
        sortBySuit();
    score+=6;
        return(hand.get(0).getSuit()==hand.get(hand.size()-1).getSuit());
}

public boolean isStraight(){
  int i,testValue;

sortByValue();
//If hand contains an Ace
  if(hand.get(5).getValue()==12){
     boolean a = hand.get(0).getValue()==0 && hand.get(1).getValue()==1
            && hand.get(2).getValue()==2 && hand.get(3).getValue()==3;

     boolean b = hand.get(1).getValue()==10 && hand.get(2).getValue()==11
             && hand.get(3).getValue()==12 && hand.get(4).getValue()==13;

     return(a||b);

}else{
    testValue =hand.get(0).getValue()+1;

    for(i=1;i<hand.size();i++){
if(hand.get(i).getValue() != testValue)
    return (false);

    testValue++;
}
score+=6;
return (true);
}
}

public boolean isRoyalFlush(){
score+=7;
return isStraight() && isFlush();
}

public boolean is4OfAKind(){
 sortByValue();
    if(hand.get(0).getValue()==hand.get(3).getValue()||hand.get(1).getValue()==hand.get(4).getValue()
        ||hand.get(2).getValue()==hand.get(5).getValue()){
    score+=4;
   return true;
    }else{
    return false;
        }

    }

public boolean is3OfAKind(){
 sortByValue();
    if(hand.get(0).getValue()==hand.get(2).getValue()||hand.get(1).getValue()==hand.get(3).getValue()
        ||hand.get(2).getValue()==hand.get(4).getValue()||hand.get(3).getValue()==hand.get(5).getValue()){
      score+=3;
      return true;

    }else{
    return false;
        }

    }

public int containsPairs(){
    int pairs=0;
sortByValue();
    for(int i=0;i<hand.size();i++){
        for(int j=i+1;j<hand.size();j++){
if(hand.get(i).getValue()==hand.get(j).getValue());
pairs++;
score++;
}
}
        return pairs;
}

public boolean isFullHouse(){
score+=5;
return containsPairs()>0&&is3OfAKind();


}

public int compareTo(Hand h){
if(score<h.score){
    return -1;
}else if(score>h.score){
    return 1;
}else{
    return 0;
}
}


}


