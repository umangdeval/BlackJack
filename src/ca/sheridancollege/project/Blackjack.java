/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Prem Parashar
 */
public  class Blackjack {

    private Player[] players =new Player[2];// the players of the game
    private boolean status=true; //whether the game is still going on
    public boolean isStatus() {
        return status;
    }

    public Blackjack(Player player) {
        players[0] = player;
        players[1] = new Player("Dealer");
        players[0].addHand(new Hand());
        players[1].addHand(new Hand());
        players[0].getHand()[0].addCard();
        players[1].getHand()[0].addCard();
        System.out.println("Your : " + players[0].getHand()[0]);
        System.out.println("Dealer : " + players[1].getHand()[0]);
    }

    public void drawCard()
    {
        players[0].getHand()[0].addCard();
        players[1].getHand()[0].addCard();
        System.out.println("Your : " + players[0].getHand()[0]);
        System.out.println("Dealer : " + players[1].getHand()[0]);
        if(players[0].isSplit()){
        players[0].getHand()[1].addCard();
        System.out.println("Your 2nd: " + players[0].getHand()[1]);
        }
        declareWinner();
    }
    public void steady()
    {
        players[1].getHand()[0].addCard();
        System.out.println("Dealer : " + players[1].getHand()[0]);
        declareWinner();
    }
    public void split()
    {
        if(players[0].getHand()[0].getCards().get(0).getValue()==players[0].getHand()[0].getCards().get(1).getValue())
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
