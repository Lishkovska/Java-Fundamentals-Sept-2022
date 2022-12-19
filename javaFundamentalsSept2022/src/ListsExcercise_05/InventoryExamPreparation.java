package ListsExcercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InventoryExamPreparation {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        List<String> journalLlist = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String commandToDo = scanner.nextLine();

        while (!commandToDo.equals("Craft!")){
            String [] current = commandToDo.split("-");
            String words = current[0];

            switch (words){
                case "Collect" :
                    String itemToAdd = current[1];
                    if (journalLlist.contains(itemToAdd)){
                        break;
                    } else {
                        journalLlist.add(itemToAdd);
                    }
                    break;
                case "Drop" :
                    String itemToRemove = current[1];
                    if (journalLlist.contains(itemToRemove)){
                        journalLlist.remove(itemToRemove);
                    } else {
                        break;
                    }
                    break;
                case "Combine Items" :
                    String [] items = current[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];

                    int indexOldItem = journalLlist.indexOf(oldItem);
                    journalLlist.add(indexOldItem + 1, newItem);
                    break;
                case "Renew" :
                    String itemToChange = current[1];
                    if (journalLlist.contains(itemToChange)){
                        journalLlist.remove(itemToChange);
                        journalLlist.add(itemToChange);
                    }
                    break;
            }
            commandToDo = scanner.nextLine();
        }
        System.out.println(String.join(", ",journalLlist));

    }
}
