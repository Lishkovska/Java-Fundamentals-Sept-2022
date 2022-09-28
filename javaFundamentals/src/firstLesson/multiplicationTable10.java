package firstLesson;

import java.util.Scanner;

public class multiplicationTable10 {
    public static void main (String [] arg){
        Scanner scanner=new Scanner(System.in);

        int firstNumber=Integer.parseInt(scanner.nextLine());
        int times=1;


        while (times<=10){
            int product =firstNumber * times;

            System.out.printf("%d X %d = %d%n",firstNumber,times,product);

            times++;
        }
    }
}
