package ArraysExercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());
        for ( int i = 0 ; i < numbersArray.length ; i ++){
            int currentNum = numbersArray[i];
            for ( int index = i + 1 ; index < numbersArray.length ; index++){
                int inCurrentNum = numbersArray[index];
                if ( currentNum + inCurrentNum == magicSum){
                    System.out.println(currentNum + " " + inCurrentNum);
                }
            }
        }


    }
}
