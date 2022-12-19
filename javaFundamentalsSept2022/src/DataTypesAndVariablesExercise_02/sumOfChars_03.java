package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class sumOfChars_03 {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0 ;
        for ( int i = 1 ; i <= n ; i++){
            char letter = scanner.nextLine().charAt(0);
            sum += (int)letter ;
        }
        System.out.printf("The sum equals: %d",sum );
    }
}
