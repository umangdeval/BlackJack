/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


/**
 * This class creates a new card with a suit and value.
 * @author Umang
 * @author Ankur
 * @author Nupur 
 * @author Dhruv
 */
public class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    // Creating a new type of variable called suits.
    public enum suits{CLUBS,SPADES,DIAMONDS,HEARTS};
    // Creating a new type of variable called values.
    public enum values{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING};
    // Creating a new type of variable called suits.
    private final suits suit;
    // Creating a new type of variable called values.
    private final values value;
    // Creating a new card with a suit and value.
    public Card(suits suit, values value) {
        this.suit = suit;
        this.value = value;
    }
    /**
     * This function returns the suit of the card
     * 
     * @return The suit of the card.
     */
    public suits getSuit() {
        return suit;
    }
    /**
     * This function returns the value of the enum
     * 
     * @return The value of the enum.
     */
    public values getValue() {
        return value;
    }
    /**
     * The toString() method returns a string representation of the object
     * 
     * @return The value and suit of the card.
     */
    public String toString() {
        return value + " of " + suit;
    }

}
