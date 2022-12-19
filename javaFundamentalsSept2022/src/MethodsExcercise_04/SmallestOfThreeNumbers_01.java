package MethodsExcercise_04;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        smallestNum(n1, n2, n3);
    }
    public static void smallestNum (int num1, int num2, int num3){
        if (num1 <= num2 && num1 <= num3){
            System.out.println(num1);
        } else if (num2 <= num1 && num2 <= num3){
            System.out.println(num2);
        } else if (num3 <= num1 && num3 <= num2){
            System.out.println(num3);
        }
    }
    }
