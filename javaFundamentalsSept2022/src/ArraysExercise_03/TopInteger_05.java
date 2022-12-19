package ArraysExercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger_05 {
    public static void main(String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

       // 1 4 3 2

        for ( int i = 0 ; i < numbers.length ; i ++){
            int startNumber = numbers[i];
            if ( i == numbers.length - 1){
                System.out.print(startNumber + " ");
                break;
            } boolean isTop = false;
            for ( int j = i+1 ; j < numbers.length ; j++){
              int nextNumber =  numbers [j] ;
              if (startNumber > nextNumber){
                  isTop = true;
              } else {
                  isTop = false;
                  break;
              }

            } if (isTop){
                System.out.print(startNumber + " ");
            }
            }
        }
    }

