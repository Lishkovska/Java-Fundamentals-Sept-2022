package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class spiceMustFlow_09 {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int workers = 26;
        int totalSpice = 0;

        int countDays =0;

      while (startingYield >=100){
          int yield = startingYield - workers ;
          totalSpice += yield;
          countDays++ ;
          startingYield =startingYield - 10;
      }
      if (totalSpice >= 26){
          totalSpice -= 26 ;
      }
      System.out.println(countDays);
      System.out.println(totalSpice);


        }
}

