package ArraysExercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while ( ! command.equals("end")){
         if (command.contains("swap")){
             int index1 = Integer.parseInt(command.split(" ")[1]);
             int index2 = Integer.parseInt(command.split(" ")[2]);
             int element1 = numbersArray[index1];
             int element2 = numbersArray[index2];
             numbersArray[index1] = element2;
             numbersArray[index2] = element1;
         } else if ( command.contains("multiply")){
             int index1 = Integer.parseInt(command.split(" ")[1]);
             int index2 = Integer.parseInt(command.split(" ")[2]);
             int element1 = numbersArray[index1];
             int element2 = numbersArray[index2];
             int product = element1 * element2 ;
             numbersArray[index1] = product;
         } else if (command.equals("decrease")){
             for (int i = 0 ; i < numbersArray.length ; i++){
                 numbersArray[i] -= 1;
             }
         }
         command = scanner.nextLine();
        }
        for (int i = 0 ; i < numbersArray.length ; i ++){
            int currentNum = numbersArray[i];
            if (i != numbersArray.length-1){
                System.out.print(currentNum + ", ");
            } else {
                System.out.print(currentNum);
            }
        }
    }
}
