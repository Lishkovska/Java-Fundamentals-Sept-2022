package firstLesson;

import java.util.Scanner;

public class sumOfOdds09 {
    public static void main (String [] arg){
        Scanner scanner=new Scanner(System.in);

        int numberOdds=Integer.parseInt(scanner.nextLine());
        int sumOdds=0;

        for (int i=1 ; i<=numberOdds*2 ; i++){
            if (i % 2 != 0){
                System.out.println(i);
                sumOdds=sumOdds+i;
            }
        }

        System.out.printf("Sum: %d",sumOdds);
    }
}
