package MethodsLesson_04;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        signOfInteger(numberInput);
    }
    public static void signOfInteger (int number){
        if (number > 0){
            System.out.printf("The number %d is positive.",number);
        } else if (number < 0){
            System.out.printf("The number %d is negative.",number);
        } else if (number == 0){
            System.out.printf("The number %d is zero.",number);
        }

    }
}
