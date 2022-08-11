/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Prem Parashar
 */
public class Deck {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private final int size=52;//the size of the grouping

    public Deck() {
        cards = new ArrayList<>();
        for (Card.suits suit : Card.suits.values()) {
            for (Card.values value : Card.values.values()) {
                cards.add(new Card(suit, value));
            }
        }
        shuffle();
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    public Card drawCard()
    {
        return getCards().remove(0);

        
    }

   

}//end class
