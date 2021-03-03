import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        highLow(sc);
    }

    public static void highLow(Scanner sc) {
        int gameNumber = ((int) (Math.random() * 100) + 1);//Game picks a random number between 1 and 100.
        while (true) {
            System.out.println("Guess a number between 1 and 100: ");//Prompts user to guess the number.
            int userInput = Integer.parseInt(sc.nextLine());//All user inputs are validated
            if (userInput < gameNumber) {
                System.out.println("Higher");//If user's guess is less than the number, it outputs "HIGHER".
            } else if (userInput > gameNumber) {
                System.out.println("Lower");//If user's guess is more than the number, it outputs "LOWER".

            } else {
                System.out.println("Good guess");//if a user guesses the number, the game should declare "GOOD GUESS!"
                break;
            }
        }
    }
}