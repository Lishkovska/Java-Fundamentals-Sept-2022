package mapsLampbdaStreamExcersise_07;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, Double> productPriceMap =  new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productQuantityMap =  new LinkedHashMap<>();

        while (!command.equals("buy")){
            String nameProduct = command.split(" ")[0];
            double priceProduct = Double.parseDouble(command.split(" ")[1]);
            int quantityProduct = Integer.parseInt(command.split(" ")[2]);


            if (!productPriceMap.containsKey(nameProduct)){
                productPriceMap.put(nameProduct, priceProduct);
            } else {
                productPriceMap.put(nameProduct, priceProduct);
            }

            if (!productQuantityMap.containsKey(nameProduct)){
                productQuantityMap.put(nameProduct, quantityProduct);
            } else {
                productQuantityMap.put(nameProduct, productQuantityMap.get(nameProduct) + quantityProduct);
            }


            command = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPriceMap.entrySet()) {
            String name = entry.getKey();
            double finalSum = entry.getValue() * productQuantityMap.get(name);
            System.out.printf("%s -> %.2f%n",entry.getKey(), finalSum);
        }


    }
}
