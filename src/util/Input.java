package util;

import java.util.Scanner;

public class Input {


    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String input = scanner.nextLine();
        return input;
    }

    public static boolean yesNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter either yes (for true) or no (for false)");
        String input = scanner.nextLine();
        return (input.equalsIgnoreCase("yes") | input.equalsIgnoreCase("y") | input.equalsIgnoreCase("true") | input.equalsIgnoreCase("t"));
    }

    public static int getInt (int min, int max) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number between " + min + " and " + max);
        String s = scanner.nextLine();
        int input = Integer.valueOf(s);
        if (input > max | input < min) {System.out.println("Please select again, your choice was outside the range."); getInt(min, max);}
//        else {System.out.println("Thank you, your selection was within the range.");}
        return input;
    }

    public static int getInt (int min, int max, String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        String s = scanner.nextLine();
        int input = Integer.valueOf(s);
        if (input > max | input < min) {System.out.println("Please select again, your choice was outside the range."); getInt(min, max);}
        else {System.out.println("Thank you, your selection was within the range.");}
        return input;
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        String s = scanner.nextLine();
        return Integer.valueOf(s);
    }

    public static double getDouble(double min, double max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between " + min + " and " + max);
        double input = scanner.nextDouble();
        if (input > max | input < min) {System.out.println("Please select again, your choice was outside the range."); getDouble(min, max);}
        else {System.out.println("Thank you, your selection was within the range.");}
        return input;
    }

    public static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        return scanner.nextDouble();
    }

}