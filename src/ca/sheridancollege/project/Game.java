package ca.sheridancollege.project;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Blackjack!\n");
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        Player player = new Player(name);
        Blackjack game = new Blackjack(player);
        int i = 1;
        while (i >0) {
            System.out.println("Enter your choice: Draw, Stay, Split or quit");
            String choice = in.nextLine();
            if (choice.equalsIgnoreCase("draw")) {
                if (game.isStatus()) {
                    game.drawCard();
                } else
                {System.out.println("Game restarted");
                    game = new Blackjack(player);
                    i++;
                }
                
            } else if (choice.equalsIgnoreCase("split")) {
                game.split();
            } else if (choice.equalsIgnoreCase("stay")) {
                if (game.isStatus()) {
                    game.steady();
                } else{System.out.println("Game restarted");
                game = new Blackjack(player);
                i++;
            }
            } else if (choice.equalsIgnoreCase("quit")) {
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
