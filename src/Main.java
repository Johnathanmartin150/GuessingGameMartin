import java.util.Random;
import java.util.Scanner;
public class Main {

   //psm TAB
    public static void main(String[] args) {

        int playerNumber, computerNumber;
        Random rand = new Random();
        Scanner read = new Scanner(System.in);

        do{
        computerNumber = rand.nextInt(99) + 1;

        do {
            System.out.println("please pick a number from 1 to 100");
            playerNumber = read.nextInt();
            read.nextLine();

            System.out.println("Please guess a number from 1 to 100.");
            if (computerNumber == playerNumber) {
                System.out.println("Correct");
            } else if (computerNumber > playerNumber) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
            playerNumber = read.nextInt();
        } while (computerNumber != playerNumber);
        System.out.println("You won!!!");
        System.out.println("would you like to play again Y OR N");
      again = read.nextLine();
    } while(again.equalsIgnoreCase("y"))


        System.out.println("thanks for playing.");

    }

}
