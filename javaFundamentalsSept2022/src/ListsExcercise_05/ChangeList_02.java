package ListsExcercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        List< Integer > numLists = Arrays.stream (scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("end")){

        if (commandInput.contains("Delete")){
            int elementToDelete = Integer.parseInt(commandInput.split("\\s+")[1]);
            numLists.removeAll(Arrays.asList(elementToDelete));
        } else if (commandInput.contains("Insert")){
            int elementToInsert = Integer.parseInt(commandInput.split("\\s+")[1]);
            int indexToInsert = Integer.parseInt(commandInput.split("\\s+")[2]);
            numLists.add(indexToInsert, elementToInsert);
        }
            commandInput = scanner.nextLine();
        }
        for (int currentNum : numLists){
            System.out.print(currentNum + " ");
        }

    }
}
// Arrays.stream(scanner.nextLine()
//                                .split(" "))
//                                .map(Integer::parseInt)
//                                .collect(Collectors.toList());
//
//        String command = scanner.nextLine(); //команди
//        //stop: command == "end"
//        //continue: command != "end"
//        while (!command.equals("end")) {
//            //команда
//            //1. command = "Delete 3"
//            if (command.contains("Delete")) {
//                //"Delete 3".split(" ") -> ["Delete", "3"]
//                int numberForRemove = Integer.parseInt(command.split(" ")[1]);
//                //премахваме всички стойности от списъка равни на numberForRemove
// numbers.removeAll(Arrays.asList(numberForRemove));
//            }
//            //2. command = "Insert 3 1"
//            else if (command.contains("Insert")) {
//                //"Insert 3 1".split(" ") -> ["Insert", "3", "1"]
//                //вмъкна element на index
//                int element = Integer.parseInt(command.split(" ")[1]);
//                int index = Integer.parseInt(command.split(" ")[2]);
//                numbers.add(index, element);
//            }
//            command = scanner.nextLine();
//        }
//
//        //списък с числа -> {3, 4, 5, 6}
//       for (int number : numbers) {
//            System.out.print(number + " ");
//        }
 //