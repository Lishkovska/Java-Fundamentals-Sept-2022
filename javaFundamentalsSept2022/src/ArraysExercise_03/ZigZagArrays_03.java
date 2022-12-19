package ArraysExercise_03;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String [] firstArray = new String[n];
        String [] secondArray = new String[n];

        for ( int i = 1 ; i <=n ; i ++){
            String [] currentNumbers = scanner.nextLine().split(" ");
            String firstNumbers = currentNumbers[0];
            String secondNumbers = currentNumbers[1];

            if ( i % 2 == 0){
                secondArray [i-1] = firstNumbers ;
                firstArray [i-1] = secondNumbers;
            } else {
                secondArray [i-1] = secondNumbers;
                firstArray [i-1] = firstNumbers;
            }
        }
        System.out.println(String.join (" ",firstArray));
        System.out.println(String.join (" ",secondArray));
    }
}
