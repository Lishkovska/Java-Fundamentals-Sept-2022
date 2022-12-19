package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class waterOverflow_07 {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);

      int n = Integer.parseInt(scanner.nextLine());
      int tank = 255;
      int sum = 0 ;
      for ( int i = 1 ; i <= n ; i++){
          int pourWater = Integer.parseInt(scanner.nextLine());
          sum += pourWater ;

          if (sum > tank){
              System.out.println("Insufficient capacity!");
              sum -= pourWater;
          }
      }
      System.out.printf("%d",sum);
    }
}
