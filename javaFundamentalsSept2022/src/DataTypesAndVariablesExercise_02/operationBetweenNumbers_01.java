package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class operationBetweenNumbers_01 {
    public static void main(String[] arg ){
          Scanner scanner = new Scanner(System.in);

          int firstNum = Integer.parseInt(scanner.nextLine());
          int secondNum = Integer.parseInt(scanner.nextLine());
          int thirdNum = Integer.parseInt(scanner.nextLine());
          int fourthNum = Integer.parseInt(scanner.nextLine());
 //Read four integer numbers. Add first to the second, divide (integer) the sum by the third number,
        // and multiply the result by the fourth number. Print the result.
          int sum = firstNum + secondNum;
          int divide = sum / thirdNum;
          int multiply = divide * fourthNum ;

          System.out.println(multiply);
    }
}
