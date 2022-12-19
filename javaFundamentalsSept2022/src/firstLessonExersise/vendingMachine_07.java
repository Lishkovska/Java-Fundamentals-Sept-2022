package firstLessonExersise;

import java.util.Scanner;

public class vendingMachine_07 {
    public static void main (String [] arg){

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum =0;


        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);

            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1.0
                    && coins != 2.0) {
                System.out.printf("Cannot accept %.2f", coins);
            } else {
                sum += coins;
            }
            command = scanner.nextLine();

        }
        command = scanner.nextLine();
          while (!command.equals("End")){

              switch (command) {
                  case "Nuts":
                      if (sum >= 2) {
                          sum -= 2;
                      } else {
                          System.out.println("Sorry, not enough money");
                      }
                      break;
                  case "Water":
                      if (sum >= 0.7) {
                          sum -= 0.7;
                          System.out.printf("Purchased %s%n", command);
                      } else {
                          System.out.println("Sorry, not enough money");
                      }
                      break;
                  case "Crisps":
                      if (sum >= 1.5) {
                          sum -= 1.5;
                          System.out.printf("Purchased %s%n", command);
                      } else {
                          System.out.println("Sorry, not enough money");
                      }
                      break;
                  case "Soda":
                      if (sum >= 0.8) {
                          sum -= 0.8;
                          System.out.printf("Purchased %s%n", command);
                      } else {
                          System.out.println("Sorry, not enough money");
                      }
                      break;
                  case "Coke":
                      if (sum >= 1) {
                          sum -= 1;
                          System.out.printf("Purchased %s%n", command);
                      } else {
                          System.out.println("Sorry, not enough money");
                      }
                      break;
                  default:
                      System.out.println("Invalid product");
                      break;
              }
              command = scanner.nextLine();
          }
        if (sum >= 0) {
            System.out.printf("Change: %.2f", sum);
        }
    }
}

