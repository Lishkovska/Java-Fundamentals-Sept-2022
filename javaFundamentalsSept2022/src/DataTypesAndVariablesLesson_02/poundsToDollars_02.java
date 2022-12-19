package DataTypesAndVariablesLesson_02;

import java.util.Scanner;

public class poundsToDollars_02 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        int pounds = Integer.parseInt(scanner.nextLine());

        double dollars = pounds * 1.0 * 1.36 ;

        System.out.printf("%.3f", dollars);
    }
}
