package ArraysLesson_03;

import java.util.Scanner;

public class printNumbersInReverseOrder_02 {
    public static void main(String[] arg ){

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[n];
        for (int i = 0 ; i < n ; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            numbersArr[i] = currentNum ;
        }
        for ( int i = numbersArr.length - 1; i >=0 ; i--){
            System.out.printf("%d ",numbersArr[i]);
        }

    }
}
