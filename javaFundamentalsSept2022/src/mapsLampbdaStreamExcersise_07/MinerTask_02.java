package mapsLampbdaStreamExcersise_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> minerMap = new LinkedHashMap<>();

        while (!input.equals("stop")){
            int quontity = Integer.parseInt(scanner.nextLine());

            if(!minerMap.containsKey(input)){
                minerMap.put(input, quontity);
            } else {
                minerMap.put(input, minerMap.get(input) + quontity);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : minerMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
