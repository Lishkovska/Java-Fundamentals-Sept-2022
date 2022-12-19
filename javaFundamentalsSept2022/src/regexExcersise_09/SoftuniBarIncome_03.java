package regexExcersise_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome_03 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        String regex = "%([A-Z][a-z]*)%[^|$%.]*<(\\w+)>[^|$%.]*\\|([0-9]+)\\|[^|$%.]*?([0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalAmount = 0 ;
        while (!lineInput.equals("end of shift")){
           Matcher matcher = pattern.matcher(lineInput);
           if(matcher.find()){
             String customer = matcher.group(1);
             String product = matcher.group(2);
             double price = Double.parseDouble(matcher.group(4));
             int count = Integer.parseInt(matcher.group(3));
             double currentAmount = price * count ;
             totalAmount += currentAmount ;

             System.out.printf("%s: %s - %.2f%n",customer,product,currentAmount);
           }
           lineInput = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f",totalAmount);

    }
}
