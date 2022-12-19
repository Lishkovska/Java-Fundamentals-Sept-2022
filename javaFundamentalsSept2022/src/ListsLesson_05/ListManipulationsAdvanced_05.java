package ListsLesson_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsAdvanced_05 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        List< Integer > numbersList = Arrays.stream (scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());



        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("end")){
            String [] command = inputCommand.split(" ");
            String currentCommandTodo = command[0];

            switch (currentCommandTodo){
                case "Contains" :
                    int numberToContain = Integer.parseInt(command[1]);
                    if (numbersList.contains(numberToContain)){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print even" :
                    for (int i = 0 ; i < numbersList.size() ; i ++){
                        int currentNum = numbersList.get(i);
                        if ( currentNum % 2 == 0){
                            System.out.println(currentNum + " ");
                        }
                    }
                    break;
                case "Print odd" :
                    for (int i = 0 ; i < numbersList.size() ; i ++){
                        int currentNum = numbersList.get(i);
                        if (currentNum % 2 != 0){
                            System.out.println(currentNum + " ");
                        }
                    }
                    break;
                case "Get sum" :
                    int sum = 0;
                    for (int i = 0 ; i < numbersList.size() ; i++){
                        int currentNum = numbersList.get(i);
                        sum += currentNum;
                    }
                    System.out.println(sum);
                    break;
                case "Filter" :
                    String outputFilter = "";
                    int num = Integer.parseInt(command[2]);

                    if (command[1].equals("<")) {
                        for (Integer numList : numbersList) {
                            if (numList < num) {
                                outputFilter += numList + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (command[1].equals(">")) {
                        for (Integer numList : numbersList) {
                            if (numList > num) {
                                outputFilter += numList + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (command[1].equals(">=")) {
                        for (Integer numList : numbersList) {
                            if (numList >= num) {
                                outputFilter += numList + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (command[1].equals("<=")) {
                        for (Integer numList : numbersList) {
                            if (numList <= num) {
                                outputFilter += numList + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    }
                    break;
            }
            inputCommand = scanner.nextLine();
        }
    }
}
