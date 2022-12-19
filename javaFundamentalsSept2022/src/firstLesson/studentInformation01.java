package firstLesson;

import java.util.Scanner;

public class studentInformation01 {
    public static void main (String [] arg){
        Scanner scanner= new Scanner (System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avrGrade=Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,avrGrade);
    }
}