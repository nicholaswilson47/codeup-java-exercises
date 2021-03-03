import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class MethodsExercises {
    public static int addNumber(int num1, int num2) {


        return num1 + num2;

    }

    public static int subtractNumber(int num1, int num2) {


        return num1 - num2;

    }

    public static int multiplyNumber(int num1, int num2) {


        return num1 * num2;

    }

    public static int divideNumber(int num1, int num2) {


        return num1 / num2;

    }

    public static int modulusNumber(int num1, int num2) {


        return num1 % num2;

    }
    public static int Factorial(int input){
        int i, value = 1;
        for(i = 1; i<=input;i++){
            value = value * i;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(addNumber(2,2));
        System.out.println(subtractNumber(2,2));
        System.out.println(multiplyNumber(2,2));
        System.out.println(divideNumber(77,7));
        System.out.println(modulusNumber(50,9 ));
        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
        System.out.println();
        int userInput = getInteger(0, 10);
        System.out.println(userInput);


        System.out.println("The factorial of " +"!"+ userInput + " is: " + Factorial(userInput));
        diceRoll(scan);
    }




    public static int getInteger(int min, int max) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number between "+ min + "and" + max + ": ");// first prompt user to enter a number between min and max
        int response = sc.nextInt();// then read the number
        if (response >= min && response <= max) {// if the number is in range, return it
            System.out.println("num in range ");
            return response;
        }else{
            return getInteger(min, max);// else, return getInteger(min, max)


        }



    }
    public static void diceRoll(Scanner scan){

        while( true ){


            System.out.println("Give me the number of sides of the dice");
            short n = Short.parseShort(scan.nextLine());
            int range = n - 1 + 1;
            System.out.println("Your dice roll 1 = " + ((int)(Math.random() * range) + 1) );
            System.out.println("Your dice roll 2 = " + ((int)(Math.random() * range) + 1) );

            System.out.println("Do you wish to continue? y/n");
            if(scan.nextLine().toLowerCase().equals("n")){
                break;
            }
        }

    }
}