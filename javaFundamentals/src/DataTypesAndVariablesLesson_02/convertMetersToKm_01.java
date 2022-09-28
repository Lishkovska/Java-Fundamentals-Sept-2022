package DataTypesAndVariablesLesson_02;

import java.util.Scanner;

public class convertMetersToKm_01 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double km = meters * 1.0 / 1000 ;

        System.out.printf("%.2f", km);
    }
}
