package MethodsLesson_04;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        double gradeInput = Double.parseDouble(scanner.nextLine());

        findGrades(gradeInput);
    }
    public static void findGrades(double grades){
        if ( grades <= 2.99){
            System.out.println("Fail");
        } else if ( grades <= 3.49){
            System.out.println("Poor");
        } else if ( grades <= 4.49){
            System.out.println("Good");
        } else if ( grades <=5.49){
            System.out.println("Very good");
        } else if ( grades <= 6.00){
            System.out.println("Excellent");
        }
    }
}
