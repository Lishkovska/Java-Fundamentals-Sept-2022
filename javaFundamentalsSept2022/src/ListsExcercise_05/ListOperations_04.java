package ListsExcercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        List< Integer > numbersList = Arrays.stream (scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] currentCommand = command.split("\\s+");
            String commandToDo = currentCommand[0];
            //· Add {number} - add number at the end
            if (commandToDo.contains("Add")){
                int numberToAdd = Integer.parseInt(currentCommand[1]);
                numbersList.add(numberToAdd);
            } else if (commandToDo.contains("Insert")){
                int numberToInsert = Integer.parseInt(currentCommand[1]);
                int indexToInsert = Integer.parseInt(currentCommand[2]);
                if(isValidIndex(indexToInsert, numbersList)){
                    numbersList.add(indexToInsert, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandToDo.contains("Remove")){
                int indexToRemove = Integer.parseInt(currentCommand[1]);
                if (isValidIndex(indexToRemove, numbersList)) {
                    numbersList.remove(indexToRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")){
                int count = Integer.parseInt(currentCommand[2]);
                for (int i = 1 ; i <= count ; i++) {
                    int firstNum = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNum);
                }
            } else if (commandToDo.contains("Shift right")){
                int count = Integer.parseInt(currentCommand[2]);
                for (int i = 1 ; i <=count ; i++){
                    int lastNum = numbersList.get(numbersList.size()-1 );
                    numbersList.remove(numbersList.size()-1);
                    numbersList.add(0, lastNum);
                }
            }
            command = scanner.nextLine();
            }
            for (int n : numbersList){
                System.out.print(n + " ");
            }
        }


    public static boolean isValidIndex (int index, List<Integer> list){
        return index>=0 && index <= list.size()-1 ;
    }
}
