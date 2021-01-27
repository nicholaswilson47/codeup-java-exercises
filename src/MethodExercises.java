import java.util.Scanner;

public class MethodExercises {

    public static double addNumbers(double num1, double num2){
        return num1 + num2;
    }
    public static double subtractNumbers(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplyNumbers(double num1, double num2){
        return num1 * num2;
    }
    public static double divideNumbers(double num1, double num2){
        if (num2 == 0){
            System.out.println("Your answer is undefined");
            return 0;
        }
        return num1 / num2;
    }
    public static double modulusNumbers(double num1, double num2){
        return num1 % num2;
    }
    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput >= min && userInput <= max){
            System.out.println("You chose a good number");
            return userInput;
        } else {
            System.out.println("that number was out of range");
            System.out.println("try again");
            return getInteger(min,max);
        }
    };
    public static long getFactorial(long num){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter another number between 1 and 10: ");
        long userInput = input.nextInt();
        long factorial = 1;
        if (userInput > 10 || userInput < 1 ){
            return getFactorial(userInput);
        } else {
            for (long i =1; i <= userInput; i++){
                factorial = factorial * i;
                System.out.println("!" + i + " = " + factorial);
            }
        }
        System.out.println("Continue?");
        return userInput;
    }

    public static void main(String[] args) {
        System.out.println(addNumbers(4,2));
        System.out.println(subtractNumbers(4,2));
        System.out.println(multiplyNumbers(4,2));
        System.out.println(divideNumbers(4,2));
        System.out.println(modulusNumbers(4,2));
        System.out.println(getFactorial(5));

    }
}
//    Basic Arithmetic
//
//    Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//        Subtraction
//        Multiplication
//        Division
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//        Test your methods and verify the output.
//
//        Add a modulus method that finds the modulus of two numbers.