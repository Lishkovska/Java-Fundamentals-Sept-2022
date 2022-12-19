package DataTypesAndVariablesLesson_02;

import java.util.Scanner;

public class lowerOrUpper_08 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(letter)){
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }

    }
}
