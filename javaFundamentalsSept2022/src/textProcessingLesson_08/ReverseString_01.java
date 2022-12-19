package textProcessingLesson_08;

import java.util.Scanner;

public class ReverseString_01 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")){
            StringBuilder reverseWord = new StringBuilder();
            for (int i = input.length() - 1; i >=0 ; i--) {
                char currentSymbol = input.charAt(i);
                reverseWord.append(currentSymbol);

            }
            System.out.printf("%s = %s%n", input,reverseWord);

            input = scanner.nextLine();
        }



    }
}
