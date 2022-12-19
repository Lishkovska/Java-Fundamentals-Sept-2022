package MethodsExcercise_04;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long fact1 = getFactorial(firstNum);
        long fact2 = getFactorial(secondNum);

        double division = fact1 * 1.0 /fact2 ;
        System.out.printf("%.2f",division);

    }
    public static long getFactorial (int n1){
        long fact = 1;
        for (int i = 1; i <= n1; i++) {
            fact = fact * i;
        }
        return fact;
    }
    }
