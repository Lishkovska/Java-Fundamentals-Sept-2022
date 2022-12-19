package ListsExcercise_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty_03 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int countLinesInput = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int firstLine = 1 ; firstLine <= countLinesInput ; firstLine++){
            String data = scanner.nextLine();
            List<String> dataParts = Arrays.stream(data.split(" ")).collect(Collectors.toList());
            String name = dataParts.get(0);

            if (dataParts.size()==3){
                if (guests.contains(name)){
                    System.out.printf("%s is already in the list!%n",name);
                } else {
                    guests.add(name);
                }
            } else if (dataParts.size()==4){
                if (guests.contains(name)){
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n",name);
                }
            }

        }
        for (String names : guests){
            System.out.println(names);
        }

    }
}
