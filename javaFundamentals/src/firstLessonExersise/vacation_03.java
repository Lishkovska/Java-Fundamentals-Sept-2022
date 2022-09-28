package firstLessonExersise;

import java.util.Scanner;

public class vacation_03 {
    public static void main (String [] arg){
        Scanner scanner=new Scanner(System.in);

        int people=Integer.parseInt(scanner.nextLine());
        String typeOfPeople= scanner.nextLine();
        String day= scanner.nextLine();

        double price=0;

        if (day.equals("Friday")) {
            if (typeOfPeople.equals("Students")) {
                price = 8.45;
                if (people >= 30){
                    price = price * 0.85;
                }

            } else if (typeOfPeople.equals("Business")) {
                price = 10.90;
                if (people >= 100){
                    people -= 10;
                }
            } else if (typeOfPeople.equals("Regular")) {
                price = 15;
                if (people >= 10 && people <= 20){
                    price = price * 0.95;
                }
            }
        } else if (day.equals("Saturday")) {
            if (typeOfPeople.equals("Students")) {
                price = 9.80;
                if (people >= 30){
                    price = price * 0.85;
                }
            } else if (typeOfPeople.equals("Business")) {
                price = 15.60;
                if (people >= 100){
                    people -= 10;
                }
            } else if (typeOfPeople.equals("Regular")) {
                price = 20;
                if (people >= 10 && people <= 20){
                    price = price * 0.95;
                }
            }

        } else if (day.equals("Sunday")) {
            if (typeOfPeople.equals("Students")) {
                price = 10.46;
                if (people >= 30){
                    price = price * 0.85;
                }

            } else if (typeOfPeople.equals("Business")) {
                price = 16;
                if (people >= 100){
                    people -= 10;
                }
            } else if (typeOfPeople.equals("Regular")) {
                price = 22.50;
                if (people >= 10 && people <= 20) {
                    price = price * 0.95;
                }
            }
        }

        double totalPrice = price * people;
        System.out.printf("Total price: %.2f",totalPrice);
                }
                }


