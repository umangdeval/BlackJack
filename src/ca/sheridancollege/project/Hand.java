package ca.sheridancollege.project;

import java.util.ArrayList;

public class Hand extends Deck{
    
    private ArrayList<Card> hand=new ArrayList<Card>();
    private int handSize;
    
    public Hand() {
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getHand() {
        return hand;
    }
    
    public void addCard()
    {
        hand.add(super.drawCard());
        setHandSize();
        handValue();
    }
    public void removeCard()
    {
        hand.remove(0);
        setHandSize();
    }

    public int getHandSize() {
        return handSize;
    }

    public void setHandSize() {
        this.handSize = hand.size();
    }
    public int handValue()
    {
        setHandSize();
        int handValue=0,ace=0;
        for(int i=0;i<hand.size();i++)
        {
            switch(getHand().get(i).getValue())
            {
                case ACE:
                ace++;
                break;
                case TWO:
                handValue+=2;
                break;
                case THREE:
                handValue+=3;
                break;
                case FOUR:
                handValue+=4;
                break;
                case FIVE:
                handValue+=5;
                break;
                case SIX:
                handValue+=6;
                break;
                case SEVEN:
                handValue+=7;
                break;
                case EIGHT:
                handValue+=8;
                break;
                case NINE:
                handValue+=9;
                break;
                case TEN:
                handValue+=10;
                break;
                case JACK:
                handValue+=10;
                break;
                case QUEEN:
                handValue+=10;
                break;
                case KING:
                handValue+=10;
                break;

        }
        for(int j=0;j<ace;j++)
        {
            if(handValue<=10)
            {
                handValue+=11;
            }
            else
            {
                handValue+=1;
            }
            }
        }
    
    return handValue;
}

    @Override
    public String toString() {
        return "Hand has -: "+ hand.toString()+" and the value is "+handValue();
    }

    
}//end class
    

