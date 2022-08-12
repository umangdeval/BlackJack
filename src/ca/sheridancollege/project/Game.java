package ca.sheridancollege.project;

// Importing the scanner class from the java.util package.
import java.util.Scanner;

/**
 * It's a class that runs the game
 * @author Umang
 * @author Ankur
 * @author Nupur 
 * @author Dhruv
 */
public class Game {
    /**
     * It's a blackjack game that allows the user to draw, stay, split, and quit
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Blackjack!\n##################################");
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        // It's creating a new player object and assigning it to the variable player.
        Player player = new Player(name);
        // It's creating a new blackjack object and assigning it to the variable game.
        Blackjack game = new Blackjack(player);
        // It's a counter that keeps track of the number of games played.
        int i = 1;
        // It's a while loop that runs the game until the user quits.
        while (i >0) {
            System.out.println("Enter your choice: Draw(1), Stay(2), Split(3) or quit(0)");
            String choice = in.nextLine();
            if (choice.equalsIgnoreCase("draw")||choice.equalsIgnoreCase("1")) {
                if (game.isStatus()) {
                    game.drawCard();
                } else
                {System.out.println("Game restarted");
                    game = new Blackjack(player);
                    i++;
                }
                
            } else if (choice.equalsIgnoreCase("split")||choice.equalsIgnoreCase("3")) {
                game.split();
            } else if (choice.equalsIgnoreCase("stay")||choice.equalsIgnoreCase("2")) {
                if (game.isStatus()) {
                    game.steady();
                } else{System.out.println("Game restarted");
                game = new Blackjack(player);
                i++;
            }
            } else if (choice.equalsIgnoreCase("quit")||choice.equalsIgnoreCase("0")) {
                System.out.println("Thanks for playing");
                System.out.println("Your score is: " + player.getScore());
                System.out.println("Number of games played:" + i);
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        in.close();
    }

}
