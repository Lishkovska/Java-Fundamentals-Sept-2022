package MethodsExcercise_04;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int start = 1 ; start <= n ; start++){
           if (isDivisibleBy8(start) && isThereOneOddDigit(start)){
               System.out.println(start);
           }
        }

    }
    public static boolean isDivisibleBy8 (int number){
        int sumDigits = 0;
        while (number > 0){
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number= number / 10 ;
        }
        return sumDigits % 8 == 0 ;
    }
    public static boolean isThereOneOddDigit (int number){

        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                return  true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
    }
