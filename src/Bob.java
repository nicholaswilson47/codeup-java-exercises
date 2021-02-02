import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bobScan = new Scanner(System.in);

        while(true) {

            System.out.println("What will you say to Bob? (type bye if you want to finish this exec");
            String userResponse = bobScan.nextLine().trim();

            if (userResponse.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userResponse.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userResponse.toLowerCase().equals("bye")) {
                System.out.println("Good Bye");
                break;
            }else {
                System.out.println("Whatever.");
            }
        }

    }
}
