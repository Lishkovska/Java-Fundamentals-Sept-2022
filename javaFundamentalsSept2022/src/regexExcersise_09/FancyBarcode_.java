package regexExcersise_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcode_{
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@+#+[A-Z][A-Za-z-0-9]+[A-Z]@+#+";
        Pattern pattern = Pattern.compile(regex);
        StringBuilder digitsSb = new StringBuilder();
        String productGroup = "";

                for (int i = 0 ; i < n ; i++){
                    String lineInput = scanner.nextLine();
                    Matcher matcher = pattern.matcher(lineInput);
                    if(matcher.find()){
                        Pattern digits = Pattern.compile("[0-9]");
                        Matcher matcherDigits = digits.matcher(matcher.group());
                        if(matcherDigits.find()) {
                            digitsSb.append(matcherDigits.find());
                            productGroup = digitsSb.toString();
                            System.out.printf("Product group: %s%n", productGroup);
                        }  else {
                            productGroup = "00";
                            System.out.printf("Product group: %s%n", productGroup);
                        }
                    }  else {
                        System.out.println("Invalid barcode");
                    }
                }
    }
    }
