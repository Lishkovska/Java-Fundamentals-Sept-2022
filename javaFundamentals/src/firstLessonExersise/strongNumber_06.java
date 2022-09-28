package firstLessonExersise;

import java.util.Scanner;

public class strongNumber_06 {
    public static void main (String [] arg){

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumFactoriel = 0;
        int startNumber = number ;

        while ( number > 0){
            int lastDigit = number % 10 ;
            int factoriel = 1;
            for ( int i = 1 ; i <= lastDigit ; i++ ){
               factoriel = factoriel * 1 ;
            }
            sumFactoriel += factoriel;
            number = number / 10 ;
        }
        if (sumFactoriel == startNumber){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
