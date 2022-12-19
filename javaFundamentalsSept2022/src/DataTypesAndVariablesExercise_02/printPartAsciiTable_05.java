package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class printPartAsciiTable_05 {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);

        int firstSymbol = Integer.parseInt(scanner.nextLine());
        int lastSymbol = Integer.parseInt(scanner.nextLine());

        for (int i = firstSymbol ; i <= lastSymbol ; i++){

            System.out.print((char) i + " ");
        }
    }
}
