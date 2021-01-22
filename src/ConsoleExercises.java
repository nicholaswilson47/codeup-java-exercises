import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.141592;
        System.out.printf("The value of pi is approximately %.2f.", pi);

        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        answer = scan.nextInt();
        System.out.printf("Your number is %d%n", answer);
//        we get an inputmismatchexception if we eneter something besides an integer.

        System.out.println("please enter 3 words: ");
        String str1 =scan.next();
        String str2 =scan.next();
        String str3 =scan.next();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println();
        scan.nextLine();

        System.out.println("Please enter a sentence:");
        String sentence = scan.nextLine();
        System.out.println("Here is your sentence: ");
        System.out.println(sentence);

    }
}