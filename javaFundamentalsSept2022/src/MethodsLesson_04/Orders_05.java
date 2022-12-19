package MethodsLesson_04;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quontityInput = Integer.parseInt(scanner.nextLine());

        switch (productInput){
            case "coffee" :
                coffeeProduct(quontityInput);
                break;
            case "water" :
                waterProduct(quontityInput);
                break;
            case "coke" :
                cokeProduct(quontityInput);
                break;
            case "snacks" :
                snacksProduct(quontityInput);

        }
    }
    public static void coffeeProduct (int quontity){
        double result = quontity * 1.50;
        System.out.printf("%.2f",result);
    }
    public static void waterProduct (int quontity){
        double result = quontity * 1.00;
        System.out.printf("%.2f",result);
    }
    public static void cokeProduct (int quontity){
        double result = quontity * 1.40;
        System.out.printf("%.2f",result);
    }
    public static void snacksProduct (int quontity){
        double result = quontity * 2.00;
        System.out.printf("%.2f",result);
    }
}
