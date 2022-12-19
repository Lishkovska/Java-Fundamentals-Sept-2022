package ArraysExercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum_06 {
    public static void main(String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        int [] numsArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;

        for ( int index = 0 ; index < numsArray.length ; index ++){
            int currentElement = numsArray[index];
            int leftSum = 0 ;
            int rightSum = 0 ;
            for ( int leftIndex = 0 ; leftIndex < index ; leftIndex++){
                leftSum += numsArray[leftIndex];
            }
            for ( int rightIndex = index + 1 ; rightIndex < numsArray.length ; rightIndex ++){
                rightSum += numsArray[rightIndex];
            }
            if ( leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }

        }
        if (!isFound){
            System.out.println("no");
        }

    }
}
