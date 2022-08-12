/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;



/**
 * The Blackjack class is a game that has two players and a status that determines whether the game is
 * still going on.
 * @author Umang
 * @author Ankur
 * @author Nupur 
 * @author Dhruv
 */
public  class Blackjack {

    private Player[] players =new Player[2];// the players of the game
    private boolean status=true; //whether the game is still going on
    /**
     * This function returns the status of the user
     * 
     * @return The status of the account.
     */
    public boolean isStatus() {
        return status;
    }

    // This is the constructor of the class. It is called when the object of the class is created.
    public Blackjack(Player player) {
        players[0] = player;
        players[1] = new Player("Dealer");
        players[0].addHand(new Hand());
        players[1].addHand(new Hand());
        players[0].getHand()[0].addCard();
        players[1].getHand()[0].addCard();
        System.out.println("Your : " + players[0].getHand()[0]);
        System.out.println("Dealer : " + players[1].getHand()[0]);
        players[1].getHand()[0].addCard();
        System.out.println("Dealer's second card is hidden");
    }

    /**
     * The function drawCard() is called when the player chooses to hit. It adds a card to the player's
     * hand and the dealer's hand. If the dealer's hand is less than or equal to 16, it adds another
     * card to the dealer's hand. If the dealer's hand is greater than 16, it prints out that the
     * dealer is staying. It then prints out the player's hand and the dealer's hand. If the player has
     * split, it adds a card to the player's second hand. It then calls the function declareWinner()
     */
    public void drawCard()
    {
        System.out.println("Dealer : " + players[1].getHand()[0]);
        players[0].getHand()[0].addCard();
        if(players[1].getHand()[0].handValue()<=16)
        {players[1].getHand()[0].addCard();
            System.out.println("Dealer Drawing:");
        System.out.println("Dealer : " + players[1].getHand()[0]);
            }
        else
        {
         System.out.println("Dealer is staying");
        }
        System.out.println("Your : " + players[0].getHand()[0]);
        if(players[0].isSplit()){
        players[0].getHand()[1].addCard();
        System.out.println("Your 2nd: " + players[0].getHand()[1]);
        }
        declareWinner();
    }
    /**
     * If the dealer's hand value is less than or equal to 16, the dealer will draw another card. If
     * the dealer's hand value is greater than 16, the dealer will compare his hand value to the
     * player's hand value. If the dealer's hand value is less than the player's hand value, the player
     * wins. If the dealer's hand value is greater than the player's hand value, the dealer wins. If
     * the dealer's hand value is equal to the player's hand value, the dealer wins
     */
    public void steady()
    {
        if(players[1].getHand()[0].handValue()<=16)
        {players[1].getHand()[0].addCard();
        System.out.println("Dealer : " + players[1].getHand()[0]);
        declareWinner();
        }
        else if(players[1].getHand()[0].handValue()>16)
        {
            if(players[1].getHand()[0].handValue()<players[0].getHand()[0].handValue())
            {
                System.out.println("YOU WIN");
                players[0].setScore(players[0].getScore()+1);
                status=false;

            }
            else if(players[1].getHand()[0].handValue()>players[0].getHand()[0].handValue())
            {
                System.out.println("YOU LOSE");
                players[1].setScore(players[1].getScore()+1);
                status=false;
                
            }
            else if(players[1].getHand()[0].handValue()==players[0].getHand()[0].handValue())
            {
                System.out.println("YOU LOSE");
                players[1].setScore(players[1].getScore()+1);
                status=false;
            }
        }
    }
    /**
     * If the first two cards in the player's hand are the same, then the player can split their hand
     * into two hands
     */
    public void split()
    {
        if(players[0].getHand()[0].getHand().get(0).getValue()==players[0].getHand()[0].getHand().get(1).getValue())
        {
            players[0].setSplit(true);
            players[0].addHand(new Hand());
            players[0].getHand()[0].removeCard();
            players[0].getHand()[1].addCard();
            System.out.println("Your 2nd : " + players[0].getHand()[0]);
        }
        else
        {
            players[0].setSplit(false);
            System.out.println("You can't split");
        }
    }

    /**
     * This function is used to declare the winner of the game
     */
    public  void declareWinner(){
        if(players[0].getHand()[0].handValue()>21&&players[0].getHand()[0].handValue()!=21)
        {
            players[1].setScore(players[1].getScore()+1);
            System.out.println("You lose");
            this.status=false;
        }
        else if(players[1].getHand()[0].handValue()>21&&players[1].getHand()[0].handValue()!=21)
        {
            players[0].setScore(players[0].getScore()+1);
            System.out.println("You win");
            this.status=false;
        }
        
        else if(players[0].isSplit()&&players[0].getHand()[1].handValue()>21&&players[0].getHand()[1].handValue()!=21)
        {
            players[1].setScore(players[1].getScore()+1);
            System.out.println("You lose the 2nd hand");
            this.status=false;
        }
        else if (players[0].getHand()[0].handValue()==21)
        {
            players[0].setScore(players[0].getScore()+1);
            System.out.println("You win");
            this.status=false;
        }
        else if (players[0].isSplit()&&players[0].getHand()[1].handValue()==21)
        {
            players[0].setScore(players[0].getScore()+1);
            System.out.println("You win the 2nd hand");
            this.status=false;
        }
        else if (players[1].getHand()[0].handValue()==21)
        {
            players[1].setScore(players[1].getScore()+1);
            System.out.println("You lose");
            this.status=false;
        }
       
    }


}//end class
