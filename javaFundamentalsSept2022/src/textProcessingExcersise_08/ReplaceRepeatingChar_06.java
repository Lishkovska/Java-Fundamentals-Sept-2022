package textProcessingExcersise_08;

import java.util.Scanner;

public class ReplaceRepeatingChar_06 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);


        StringBuilder inputSb = new StringBuilder(scanner.nextLine());

        //qqqwerqwecccwd

        for (int i = 0 ; i < inputSb.length() - 1 ; i++){

            if (inputSb.charAt(i) == inputSb.charAt( i + 1)){
                inputSb.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.println(inputSb);


    }
}
