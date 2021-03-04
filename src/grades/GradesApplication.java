package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();
        Student ted = new Student("Ted");
        ted.addGrade(95);
        ted.addGrade(88);
        ted.addGrade(60);
        ted.addGrade(75);
        Student josh = new Student("Josh");
        josh.addGrade(95);
        josh.addGrade(99);
        josh.addGrade(88);
        josh.addGrade(94);
        Student jimmie = new Student("Jimmie");
        jimmie.addGrade(89);
        jimmie.addGrade(97);
        jimmie.addGrade(93);
        jimmie.addGrade(87);
        Student casey = new Student("Casey");
        casey.addGrade(100);
        casey.addGrade(101);
        casey.addGrade(98);
        casey.addGrade(99);
        students.put("edwardmccormick",ted);
        students.put("talltree4prez",josh);
        students.put("jimmiesnowbunny", jimmie);
        students.put("fridaynext", casey);

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome!");
        do { System.out.println("\nHere are the GitHub usernames of our students: \n");
            for (String key : students.keySet())
            {System.out.printf("| %s ", key);}
            System.out.println("|");
            System.out.println("You can look up detailed student records by their GitHub usernames, type \"average\" for the class average, type \"grades\" to see all student grades, or type \"report\" to see a CSV report.");
            System.out.printf("Which command would you like to execute? \n >");
            String userinput = in.nextLine().trim();

            if (students.get(userinput) == null & !userinput.equalsIgnoreCase("grades") & !userinput.equalsIgnoreCase("grade") & !userinput.equalsIgnoreCase("average") & !userinput.equalsIgnoreCase("averages") & !userinput.equalsIgnoreCase("report") & !userinput.equalsIgnoreCase("reports")) {
                System.out.printf("I'm sorry, that didn't match any student or viable command, please try again. \n >");
            }
            else if (userinput.equalsIgnoreCase("average") | userinput.equalsIgnoreCase("averages")) {double output = 0; int count = 0;
                for (int i = 0; i < students.keySet().size(); i++) {

                    for (int ii = 0 ; ii < students.get(students.keySet().toArray()[i]).getGradesSize() ; ii++)
//                for (int ii = 0 ; ii < 4 ; ii++)
                    {
                        output += students.get(students.keySet().toArray()[i]).getGrades(ii); count++;
                    }

                }System.out.printf("The average for all students is:  %.4f", output/count);
            }
            else if (userinput.equalsIgnoreCase("grades")|userinput.equalsIgnoreCase("grade"))
            { ArrayList output = new ArrayList();
                for (int i = 0; i < students.keySet().size(); i++) {

                    for (int ii = 0 ; ii < students.get(students.keySet().toArray()[i]).getGradesSize() ; ii++)
//                    for (int ii = 0 ; ii < 4 ; ii++)
                    {
                        output.add(students.get(students.keySet().toArray()[i]).getGrades(ii));
                    }

                }System.out.println("All recorded grades for the class are: " + output);
            }
            else if (userinput.equalsIgnoreCase("report") | userinput.equalsIgnoreCase("reports")) {
                System.out.println("name,github_username,average,grade1,grade2,grade3,grade4...");
                for (int i = 0; i < students.keySet().size(); i++) {
                    System.out.printf("%s,", students.get(students.keySet().toArray()[i]).getName());
                    System.out.printf("%s,", students.keySet().toArray()[i]);
                    System.out.printf("%.2f,", students.get(students.keySet().toArray()[i]).getGradeAverage());
//                System.out.println(students.get(students.keySet().toArray()[i]).getGrades());
                    for (int ii = 0; ii<  students.get(students.keySet().toArray()[i]).getGradesSize(); ii++)
                    {System.out.printf("%d,", students.get(students.keySet().toArray()[i]).getGrades(ii));}
                    System.out.print("\n");
                }
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("End of report");
            }

            else {
                System.out.printf("Name: %s - GitHub Username: %s\n", students.get(userinput).getName(), userinput);
                System.out.printf("Current Average: %.2f\n", students.get(userinput).getGradeAverage());
                System.out.println("This student's grades are: " + students.get(userinput).getGrades());
                System.out.printf("Would you like to see another student? Enter for another or type \"no\" to exit. \n >");
                userinput = in.nextLine().trim();
                if (userinput.equalsIgnoreCase("no")) {break;}
            }
        } while (true);
        System.out.println("Thank you, goodbye.");
    }
}