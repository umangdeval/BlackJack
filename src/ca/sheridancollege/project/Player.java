/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;



/**
 * This class is used to create a player object that contains the player's name, score, hand, and
 * whether the hand is split or not.
 * @author Umang
 * @author Ankur
 * @author Nupur 
 * @author Dhruv
 */
public  class Player {

    private String name; //the unique name for this player
    private int score; //the score of this player
    private Hand[] hand=new Hand[2]; //the hand of this player
    private boolean split=false; //whether this player can split

    /**
     * This function returns a boolean value that indicates whether the hand is split or not
     * 
     * @return The boolean value of the variable split.
     */
    public boolean isSplit() {
        return split;
    }

    /**
     * This function sets the split variable to the value of the parameter split
     * 
     * @param split If true, the input will be split into multiple lines.
     */
    public void setSplit(boolean split) {
        this.split = split;
    }

    /**
     * This function returns the score of the player
     * 
     * @return The score of the player.
     */
    public int getScore() {
        return score;
    }

    /**
     * This function sets the score of the player to the score passed in as a parameter
     * 
     * @param score The score of the player.
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * This function returns the hand array
     * 
     * @return The hand array.
     */
    public Hand[] getHand() {
        return hand;
    }

    /**
     * This function adds a hand to the player's hand array
     * 
     * @param hand The hand that the player is playing with.
     */
    public void addHand(Hand hand) {
        if(split)
        this.hand[1] = hand;
        else
        this.hand[0] = hand;
    }

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
   

}
