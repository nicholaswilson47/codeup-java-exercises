import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bobScan = new Scanner(System.in);
        System.out.println("What will you say to Bob?");
        String userResponse = bobScan.nextLine().trim();

        if(userResponse.endsWith("?")){
            System.out.println("Sure.");
        }else if(userResponse.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if (userResponse.isEmpty()){
            System.out.println("Fine. Be that way!");
        }else {
            System.out.println("Whatever.");
        }


    }
}
