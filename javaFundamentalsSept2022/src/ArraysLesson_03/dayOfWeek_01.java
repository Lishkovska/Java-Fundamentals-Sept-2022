package ArraysLesson_03;

import java.util.Scanner;

public class dayOfWeek_01 {
    public static void main(String[] arg ){

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] dayOfWeekArr = {
                "Monday" ,
                "Tuesday" ,
                "Wednesday" ,
                "Thursday" ,
                "Friday" ,
                "Saturday" ,
                "Sunday"
        };

        if(n >= 1 && n <= 7){
            System.out.println(dayOfWeekArr[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
