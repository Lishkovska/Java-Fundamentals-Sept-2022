package regexExcersise_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        double totalAmount = 0 ;
        String regex = ">>([A-Za-z]+)<<([0-9]+\\.?[0-9]*)!([0-9]+)";

        Pattern pattern = Pattern.compile(regex);

        List<String> furnitureList = new ArrayList<>();
        while (!lineInput.equals("Purchase")){
            Matcher matcher = pattern.matcher(lineInput);

            if(matcher.find()) {
                String furniture = matcher.group(1);
                double currentAmount = Double.parseDouble(matcher.group(2));
                int currentQuantity = Integer.parseInt(matcher.group(3));
                totalAmount += (currentAmount * currentQuantity);
                furnitureList.add(matcher.group(1));
            }
            lineInput = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalAmount);

    }
}
