package firstLessonExersise;

import java.util.Scanner;

public class printAndSum_04 {
    public static void main (String [] arg){
        Scanner scanner=new Scanner(System.in);

        int firstNumber=Integer.parseInt(scanner.nextLine());
        int endNumber=Integer.parseInt(scanner.nextLine());

        int sum=0;
        for (int i=firstNumber ; i <=endNumber ; i++){
            System.out.print(i + " ");
            sum = sum+ i;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
