package ArraysExercise_03;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");

        for (String secondElement : secondArray) {
            for (String firstElement : firstArray) {
                if ( secondElement.equals(firstElement)){
                    System.out.print(firstElement + " ");
                    break;
                }
            }
        }
    }
}
