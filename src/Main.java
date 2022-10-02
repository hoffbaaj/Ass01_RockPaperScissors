import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int playerAChoice;
        int playerBChoice;

        playerAChoice = getPlayerAMove();
        playerBChoice = getPlayerBMove();

        displayWinner(playerAChoice, playerBChoice);

    }
    public static int getPlayerAMove()
    {

        Scanner input = new Scanner(System.in);

        int playerAChoice;

        System.out.print("Player A, please enter your move (R, P, S, or r, p, s): ");
        playerAChoice = input.nextInt();

        while (playerAChoice != 'R' && playerAChoice != 'P' && playerAChoice != 'S' && playerAChoice != 'r' && playerAChoice != 'p' && playerAChoice != 's') {

            System.out.print("Invalid move. Please enter R, P, S, or r, p, s: ");
            playerAChoice = input.nextInt();

        }

        return playerAChoice;

    }

    public static int getPlayerBMove()
    {

        Scanner input = new Scanner(System.in);

        int playerBChoice;

        System.out.print("Player B, please enter your move (R, P, S, or r, p, s): ");
        playerBChoice = input.nextInt();

        while (playerBChoice != 'R' && playerBChoice != 'P' && playerBChoice != 'S' && playerBChoice != 'r' && playerBChoice != 'p' && playerBChoice != 's') {

            System.out.print("Invalid move. Please enter R, P, S, or r, p, s: ");
            playerBChoice = input.nextInt();

        }

        return playerBChoice;

    }
    public static void displayWinner(int playerAChoice, int playerBChoice)
    {
        if (playerAChoice == playerBChoice)
        {

            System.out.println("It's a tie!");

        }
        else if (playerAChoice == 'R' || playerAChoice == 'r')
        {
            if (playerBChoice == 'S' || playerBChoice == 's')
            {

                System.out.println("Rock breaks scissors! Player A wins!");

            }
            else
            {

                System.out.println("Paper covers rock! Player B wins!");

            }

        }
        else if (playerAChoice == 'P' || playerAChoice == 'p')
        {

            if (playerBChoice == 'R' || playerBChoice == 'r')
            {

                System.out.println("Paper covers rock! Player A wins!");

            }
            else
            {

                System.out.println("Scissors cut paper! Player B wins!");

            }

        }
        else if (playerAChoice == 'S' || playerAChoice == 's')
        {

            if (playerBChoice == 'P' || playerBChoice == 'p')
            {

                System.out.println("Scissors cut paper! Player A wins!");

            }
            else
            {

                System.out.println("Rock breaks scissors! Player B wins!");

            }

        }

    }

}