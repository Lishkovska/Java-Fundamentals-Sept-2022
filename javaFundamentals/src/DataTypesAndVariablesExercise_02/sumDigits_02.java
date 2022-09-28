package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class sumDigits_02 {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sumDigits = 0;

        while (num > 0){
            int currentDigit = num % 10 ;
            sumDigits += currentDigit ;
            num = num / 10 ;
        }
        System.out.println(sumDigits);
    }
}
