package firstLesson;

import java.util.Scanner;

public class backIn30Minutes04 {
    public static void main (String [] arg){
        Scanner scanner=new Scanner(System.in);

        int initialHour=Integer.parseInt(scanner.nextLine());
        int initialMinutes=Integer.parseInt(scanner.nextLine());

        int hourInMinutesFinal=(initialHour *60)+initialMinutes+30;
        int finalHour=hourInMinutesFinal/60;
        int finalMinutes=hourInMinutesFinal%60;

        if (finalHour>23){
     finalHour=0;
}
        System.out.printf("%d:%02d",finalHour,finalMinutes);
}
}
