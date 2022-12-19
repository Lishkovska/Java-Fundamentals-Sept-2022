package ArraysExercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumPeople = 0 ;

        int [] wagonsArr = new int[n];
        for ( int i = 0 ; i < wagonsArr.length ; i++){
            int currentPeople = Integer.parseInt(scanner.nextLine());
            sumPeople += currentPeople;
            wagonsArr [i] = currentPeople;
            System.out.printf("%d ",wagonsArr[i]);
        }
        System.out.println();
        System.out.print(sumPeople);
    }
}
