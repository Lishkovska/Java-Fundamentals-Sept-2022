package ArraysLesson_03;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumber_03 {
    public static void main(String[] arg ){

        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer:: parseInt).toArray();

        int sumEven = 0 ;
        for (int i = 0 ; i < numbersArr.length ; i++){
            if ( numbersArr[i] % 2 == 0){
                sumEven += numbersArr[i];
            }
        }
        System.out.println(sumEven);
    }
}
