package mapsLampbdaStreamExcersise_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming2 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

    Map<String, Integer> itemsPowerMap = new LinkedHashMap<>();
        itemsPowerMap.put("shards", 0);
        itemsPowerMap.put("fragments", 0);
        itemsPowerMap.put("motes", 0);

    Map<String, Integer> junkItemsMap = new LinkedHashMap<>();

    boolean isWin = false;
        while (!isWin) {
        String input = scanner.nextLine();
        String[] inputData = input.split(" ");

        for (int i = 0; i <= inputData.length - 1; i += 2) {
            int quantity = Integer.parseInt(inputData[i]);
            String material = inputData[i + 1].toLowerCase();

            if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                int currentQuantity = itemsPowerMap.get(material);
                itemsPowerMap.put(material, currentQuantity + quantity);
            } else {
                if (!junkItemsMap.containsKey(material)) {
                    junkItemsMap.put(material, quantity);
                } else {
                    int current = junkItemsMap.get(material);
                    junkItemsMap.put(material, current + quantity);
                }
            }

            if (itemsPowerMap.get("shards") >= 250) {
                System.out.println("Shadowmourne obtained!");
                itemsPowerMap.put("shards", itemsPowerMap.get("shards") - 250);
                isWin = true;
                break;
            } else if (itemsPowerMap.get("fragments") >= 250) {
                System.out.println("Valanyr obtained!");
                itemsPowerMap.put("fragments", itemsPowerMap.get("fragments") - 250);
                isWin = true;
                break;
            } else if (itemsPowerMap.get("motes") >= 250) {
                System.out.println("Dragonwrath obtained!");
                itemsPowerMap.put("motes", itemsPowerMap.get("motes") - 250);
                isWin = true;
                break;
            }
        }

        if (isWin) {
            break;
        }
    }
        for (Map.Entry<String, Integer> entry : itemsPowerMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }

      //  items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        for (Map.Entry<String, Integer> entry : junkItemsMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }

        //junkItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
}
}


