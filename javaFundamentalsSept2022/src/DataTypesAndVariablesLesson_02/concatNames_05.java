package DataTypesAndVariablesLesson_02;

import java.util.Scanner;

public class concatNames_05 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.printf("%s%s%s",firstName , delimeter , secondName);

    }
}
