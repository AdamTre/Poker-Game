
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

public int resetScore(){
score=0;
return score;
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
    for(int i=0;i<hand.size()-1;i++){   
       int index = i;
             for(int j=i+1;j<hand.size();j++)
     if(hand.get(j).getSuit()<hand.get(index).getSuit())
                index=j;


Card min=hand.get(index);
hand.set(index, hand.get(i));
hand.set(i, min);
    
       //   swap(i-1, index);
    }
}



public void sortByValue(){

    for(int i=0;i<hand.size()-1;i++){   
       int index = i;
             for(int j=i+1;j<hand.size();j++)
     if(hand.get(j).getValue()<hand.get(index).getValue())
                index=j;


Card min=hand.get(index);
hand.set(index, hand.get(i));
hand.set(i, min);
    
       //   swap(i-1, index);
    }
}




public boolean isFlush(){
     
        sortBySuit();
if(hand.get(0).getSuit()==hand.get(hand.size()-1).getSuit()){

    
    return true;
}else return false;
        
}

public boolean isStraight(){
  int i,testValue;

sortByValue();
//If hand contains an Ace
  if(hand.get(5).getValue()==12){
     boolean a = hand.get(0).getValue()==0 && hand.get(1).getValue()==1
            && hand.get(2).getValue()==2 && hand.get(3).getValue()==3&& hand.get(4).getValue()==4;

     boolean b = hand.get(0).getValue()==7&& hand.get(1).getValue()==8 && hand.get(2).getValue()==9
             && hand.get(3).getValue()==10 && hand.get(4).getValue()==11;
if(a==true||b==true){

}
     return(a||b);

}else{
    testValue =hand.get(0).getValue()+1;

    for(i=1;i<hand.size();i++){
if(hand.get(i).getValue() != testValue)
    return (false);
testValue++;
   
}

return (true);
}
}


public boolean isStraightFlush(){
if(isStraight() && isFlush()){

return true;
}else return false;

}
public boolean isRoyalFlush(){
if(isStraightFlush()&&hand.get(0).getValue()==7){

return true;
}else return false;

}

public boolean is4OfAKind(){
 sortByValue();
    if(hand.get(0).getValue()==hand.get(3).getValue()||hand.get(1).getValue()==hand.get(4).getValue()
        ||hand.get(2).getValue()==hand.get(5).getValue()){
    
   return true;
    }else{
    return false;
        }

    }

public boolean is3OfAKind(){
 sortByValue();
    if(hand.get(0).getValue()==hand.get(2).getValue()||hand.get(1).getValue()==hand.get(3).getValue()
        ||hand.get(2).getValue()==hand.get(4).getValue()||hand.get(3).getValue()==hand.get(5).getValue()){
      return true;

    }else{
    return false;
        }

    }

public int containsPairs(){
sortByValue();
int pairs=0;
for(int i=0;i<hand.size()-1;i++){
    if(hand.get(i).getValue()==hand.get(i+1).getValue()){
     if(i==hand.size()-2){
      pairs++;
        }else if(hand.get(i+2).getValue()==hand.get(i).getValue()){

        }else
      pairs++;
}
    }

return pairs;
}

public boolean isFullHouse(){
 if(containsPairs()>1&&is3OfAKind()&&is4OfAKind()==false){
return true;
}else
return containsPairs()>0&&is3OfAKind();


}

public int calcScore(){

    boolean flush=isFlush();
    boolean full=isFullHouse();
    boolean straight=isStraight();
    int p=containsPairs();
    boolean three=is3OfAKind();
    boolean four=is4OfAKind();
    boolean royal= isRoyalFlush();
    boolean sFlush=isStraightFlush();

    score+=(p*2);
    if(flush) score+=6;
    if(full) score+=7;
    if(straight) score+=5;
    if(three) score+=4;
    if(four) score+=8;
    if(royal) score+=10;
    if(sFlush) score+=9;

    return score;

}

public int compareTo(Hand h){
System.out.println(calcScore());
System.out.println(h.calcScore());

if(score<h.score){
resetScore();
h.resetScore();
    return -1;
}else if(score>h.score){
resetScore();
h.resetScore();
    return 1;
}else{
resetScore();
h.resetScore();
    return 0;
}
}


}

