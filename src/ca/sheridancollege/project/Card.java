/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * @author Prem Parashar
 * @author dancye
 */
public class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    public enum suits{CLUBS,SPADES,DIAMONDS,HEARTS};
    public enum values{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING};
    private final suits suit;
    private final values value;
    public Card(suits suit, values value) {
        this.suit = suit;
        this.value = value;
    }
    public suits getSuit() {
        return suit;
    }
    public values getValue() {
        return value;
    }
    public String toString() {
        return value + " of " + suit;
    }

}
