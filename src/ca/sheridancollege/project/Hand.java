package ca.sheridancollege.project;

// Importing the ArrayList class from the java.util package.
import java.util.ArrayList;

/**
 * This class is a subclass of the Deck class and it is used to create a hand of cards for the player
 * and the dealer
 * @author Umang
 * @author Ankur
 * @author Nupur 
 * @author Dhruv
 */
public class Hand extends Deck{
    
    // Creating a new ArrayList of type Card.
    private ArrayList<Card> hand=new ArrayList<Card>();
    // A variable that is used to store the size of the hand.
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
    
    /**
     * This function adds a card to the hand of the player
     */
    public void addCard()
    {
        hand.add(super.drawCard());
        setHandSize();
        handValue();
    }
    /**
     * This function removes the first card in the hand array list
     */
    public void removeCard()
    {
        hand.remove(0);
        setHandSize();
    }

    /**
     * This function returns the hand size of the player
     * 
     * @return The handSize variable is being returned.
     */
    public int getHandSize() {
        return handSize;
    }

    /**
     * This function sets the handSize variable to the size of the hand array
     */
    public void setHandSize() {
        this.handSize = hand.size();
    }
    /**
     * This function calculates the value of the hand
     * 
     * @return The handValue() method returns the value of the hand.
     */
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
    // Overriding the toString method.
    public String toString() {
        return "Hand has -: "+ hand.toString()+" and the value is "+handValue();
    }

    
}//end class
    

