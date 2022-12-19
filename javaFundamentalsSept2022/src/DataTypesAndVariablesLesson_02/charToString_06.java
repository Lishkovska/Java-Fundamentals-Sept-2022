package DataTypesAndVariablesLesson_02;

import java.util.Scanner;

public class charToString_06 {
   public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);

                System.out.printf("%c%c%c", firstSymbol, secondSymbol,thirdSymbol);
    }
}
