package MethodsExcercise_04;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getResult(num1, num2, num3));

    }
    public static int getResult (int n1, int n2, int n3){
        int result = (n1 + n2) - n3;
        return result;
    }
    }
