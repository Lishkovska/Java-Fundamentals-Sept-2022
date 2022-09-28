package DataTypesAndVariablesLesson_02;

import java.util.Scanner;

public class centuriesToMinutes_09 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        double years = centuries * 100 ;
        double days = years * 1.0 * 365.2422 ;
        double hours = days  * 24 ;
        double minutes = hours * 60 ;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",
                centuries ,years ,days ,hours ,minutes);



    }
}
