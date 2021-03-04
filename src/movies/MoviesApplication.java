package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void getCategory(String genre) {
        Movie[] allMovies = MoviesArray.findAll();
        for (int i = 0; i<allMovies.length; i++) {
            if (allMovies[i].getCategory().equalsIgnoreCase(genre)) {
                System.out.println(allMovies[i].getName());
            }
        }
//        for (int i = 0; i < genreMovies.length; i++) {
//            System.out.println(genreMovies[i].getName());
//        }
//        return genreMovies;
    }

    public static void main(String[] args) {
        Movie[] allMovies = MoviesArray.findAll();

        while (true) {
            System.out.printf("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "\n" +
                    "Enter your choice: ");
            int input = util.Input.getInt(0, 5);
            if (input == 0) {
                System.out.println("Thank you, and goodbye!");break;}
            else if (input == 1) {
                for (int i = 0; i < allMovies.length; i++) {
                    System.out.println(allMovies[i].getName());
                }
            }
            else if (input == 2) {getCategory("animated");}
            else if (input == 3) {getCategory("drama");}
            else if (input == 4) {getCategory("horror");}
            else if (input == 5) {getCategory("scifi");}

        }
    }
}
