package firstLessonExersise;

import java.util.Scanner;

public class orders_09 {
    public static void main (String [] arg){

        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        double pricePerCapsule=0;
        int days =0;
        int capsuleCount =0;


        double costs =0;
        double sum=0;
        for ( int i = 1 ; i <= orders ; i++){
             pricePerCapsule = Double.parseDouble(scanner.nextLine());
             days= Integer.parseInt(scanner.nextLine());
             capsuleCount = Integer.parseInt(scanner.nextLine());

            costs = ((days * capsuleCount) * pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f%n",costs);
            sum = sum + costs ;
        }

           System.out.printf("Total: $%.2f",sum);

        }
    }

