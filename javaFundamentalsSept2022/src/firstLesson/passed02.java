package firstLesson;

import java.util.Scanner;

public class passed02 {
    public static void main (String [] arg){
        Scanner scanner=new Scanner(System.in);
        
        double grade=Double.parseDouble(scanner.nextLine());
        
        if (grade >=3){
            System.out.print("Passed!");
        }
    }
}
