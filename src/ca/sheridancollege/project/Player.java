/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Prem Parashar
 */
public  class Player {

    private String name; //the unique name for this player
    private int score; //the score of this player
    private Hand[] hand=new Hand[2]; //the hand of this player
    private boolean split=false; //whether this player can split

    public boolean isSplit() {
        return split;
    }

    public void setSplit(boolean split) {
        this.split = split;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Hand[] getHand() {
        return hand;
    }

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
