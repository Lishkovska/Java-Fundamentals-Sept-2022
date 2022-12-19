package firstLesson;

import java.util.Scanner;

public class theatrePromotions07 {
    public static void main (String [] arg){
        Scanner scanner=new Scanner(System.in);

        String typeOfTheDay= scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());

        int price=0;

        if (age>=0 && age<=18 ){
            if (typeOfTheDay.equals("Weekday")){
                price=12;
                System.out.printf("%d$",price);
            } else if (typeOfTheDay.equals("Weekend")){
                price=15;
                System.out.printf("%d$",price);
            } else if (typeOfTheDay.equals("Holiday")){
                price=5;
                System.out.printf("%d$",price);
            }

        } else if (age >18 && age <=64){
            if (typeOfTheDay.equals("Weekday")){
                price=18;
                System.out.printf("%d$",price);
            } else if (typeOfTheDay.equals("Weekend")){
                price=20;
                System.out.printf("%d$",price);
            } else if (typeOfTheDay.equals("Holiday")){
                price=12;
                System.out.printf("%d$",price);
            }
        }  else if (age >64 && age <=122 ){
            if (typeOfTheDay.equals("Weekday")){
                price=12;
                System.out.printf("%d$",price);
            } else if (typeOfTheDay.equals("Weekend")){
                price=15;
                System.out.printf("%d$",price);
            } else if (typeOfTheDay.equals("Holiday")){
                price=10;
                System.out.printf("%d$",price);
            }
        } else {
            System.out.println("Error!");
        }
    }
}
