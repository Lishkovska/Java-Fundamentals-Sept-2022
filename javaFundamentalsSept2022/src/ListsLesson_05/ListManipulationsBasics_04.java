package ListsLesson_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsBasics_04 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        List< Integer > numbersList = Arrays.stream (scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        String lineInput = scanner.nextLine();

        while (!lineInput.equals("end")){
            String [] currentCommandArr = lineInput.split(" ");
            String command = currentCommandArr[0];

            switch (command){
                case "Add" :
                    int numToAdd = Integer.parseInt(currentCommandArr[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove" :
                    int numToRemove = Integer.parseInt(currentCommandArr[1]);
                    numbersList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt" :
                    int indexToRemoveAt = Integer.parseInt(currentCommandArr[1]);
                    numbersList.remove(indexToRemoveAt);
                    break;
                case "Insert" :
                    int numToInsert = Integer.parseInt(currentCommandArr[1]);
                    int indexToInsert = Integer.parseInt(currentCommandArr[2]);
                    numbersList.add(indexToInsert, numToInsert);
                    break;

            }
            lineInput = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));

    }
}
