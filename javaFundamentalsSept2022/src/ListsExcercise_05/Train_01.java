package ListsExcercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        List< Integer > wagonsList = Arrays.stream (scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());


        int maxCapacityOfWagon = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String [] data = command.split(" ");

            if (data[0].equals("Add")) {
                int wagonToAdd = Integer.parseInt(data[1]);
                wagonsList.add(wagonToAdd);
            } else {
                int passengers = Integer.parseInt(data[0]);
                for (int i = 0 ; i < wagonsList.size() ; i++){
                    int wagon = wagonsList.get(i);
                    if (wagon + passengers <= maxCapacityOfWagon){
                        wagonsList.set(i, passengers + wagon);
                        break;
                    }

                }
                }
            command = scanner.nextLine();
            }
        for (int fullWagon : wagonsList){
            System.out.print(fullWagon + " ");
        }

        }

}
