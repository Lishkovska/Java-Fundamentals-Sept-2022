package ArraysExercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int rotation = Integer.parseInt(scanner.nextLine());

       // 51 47 32 61 21
        //32 61 21 51 47

        for ( int i = 1 ; i <= rotation ; i++){
            int firstNumber = numbersArray[0];
            for ( int index = 0 ; index < numbersArray.length -1 ; i++){
                numbersArray[index] = numbersArray[index + 1];
            }
             numbersArray[numbersArray.length- 1] = firstNumber;
        }
        for (int number:numbersArray) {
            System.out.print(number + " ");
        }


    }
}
