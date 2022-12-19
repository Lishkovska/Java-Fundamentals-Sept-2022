package ArraysLesson_03;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber_07 {
    public static void main(String[] arg ){

        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int [] condensedArray = new int[numbers.length-1];

        for ( int i = 0 ; i < numbers.length ; i++){
            if ( numbers.length == 1){
                break;
            }
            if (i == numbers.length - 1){
                int [] newCondensedArray = new int[condensedArray.length -1];
                i -= 1;
                numbers = condensedArray ;
                condensedArray = newCondensedArray;
            } else {
                condensedArray[i] = numbers[i] + numbers[i+1];
            }

        }
        System.out.println(numbers[0]);


    }
}
