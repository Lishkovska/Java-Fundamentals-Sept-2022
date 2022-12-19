package mapsLampbdaStreamExcersise_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] inputArr = inputLine.split(" ");

        String junk = "" .toLowerCase();

        LinkedHashMap<String, Integer> materialsPowerMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> junkPower = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            for (int i = 0; i < inputArr.length; i += 2) {
                int power = Integer.parseInt(inputArr[i]);
                String items = inputArr[i + 1].toLowerCase();

                switch (items) {
                    case "shards":
                        if (!materialsPowerMap.containsKey(items)) {
                            materialsPowerMap.put(items, 0);
                        }
                        materialsPowerMap.put(items, materialsPowerMap.get(items) + power);
                        if (materialsPowerMap.get(items) == 250) {
                            System.out.println("Shadowmourne obtained!");
                            materialsPowerMap.put(items, materialsPowerMap.get(items) - 250);
                            isWin = true;
                            break;
                        }
                        break;
                    case "fragments":
                        if (!materialsPowerMap.containsKey(items)) {
                            materialsPowerMap.put(items, 0);
                        }
                        materialsPowerMap.put(items, materialsPowerMap.get(items) + power);
                        if (materialsPowerMap.get(items) == 250) {
                            System.out.println("Valanyr obtained!");
                            materialsPowerMap.put(items, materialsPowerMap.get(items) - 250);
                            isWin = true;
                            break;
                        }
                        break;
                    case "motes":
                        if (!materialsPowerMap.containsKey(items)) {
                            materialsPowerMap.put(items, 0);
                        }
                        materialsPowerMap.put(items, materialsPowerMap.get(items) + power);
                        if (materialsPowerMap.get(items) == 250) {
                            System.out.println("Dragonwrath obtained!");
                            materialsPowerMap.put(items, materialsPowerMap.get(items) - 250);
                            isWin = true;
                            break;
                        }
                        break;
                    default:
                        junk = items;
                        if (!junkPower.containsKey(junk)) {
                            junkPower.put(junk, 0);
                        }
                        junkPower.put(junk, junkPower.get(junk) + power);
                }
                break;
            }
        }

        for (Map.Entry<String, Integer> entry : materialsPowerMap.entrySet()) {
          if (entry.getKey().equals("shards")) {
                System.out.printf("shards: %d%n", entry.getValue());
            } else if (entry.getKey().equals("fragments")) {
                System.out.printf("fragments: %d%n", entry.getValue());
            } else if (entry.getKey().equals("motes")) {
              System.out.printf("motes: %d%n", entry.getValue());
          }
        }
        for (Map.Entry<String, Integer> entry : junkPower.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(), entry.getValue());
        }


    }
}
