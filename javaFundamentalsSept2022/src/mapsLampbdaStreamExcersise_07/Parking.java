package mapsLampbdaStreamExcersise_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        LinkedHashMap<String, String> parkingDataMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String currentCommand = input[0];
            String name = input[1];

            switch (currentCommand){
                case "register" :
                    String plates = input[2];
                    if (!parkingDataMap.containsKey(name)) {
                        parkingDataMap.put(name, plates);
                        System.out.println(name + " registered " + plates + " successfully");
                    } else  {
                            System.out.println("ERROR: already registered with plate number " + plates);
                        }
                    break;
                case "unregister" :
                    if (!parkingDataMap.containsKey(name)){
                        System.out.println("ERROR: user " + name + " not found");

            } else {
                        parkingDataMap.remove(name);
                        System.out.println(name + " unregistered successfully");

                    }
                    break;
            }
            }
        parkingDataMap.forEach((name, plates) -> System.out.println(name + " => " + plates));
    }
}