package textProcessingExcersise_08;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        StringBuilder inputSb = new StringBuilder(inputLine);

        int total = 0 ;

        for (int i = 0 ; i < inputSb.length() ; i ++){
            char currentSymbol = inputSb.charAt(i);

            if (currentSymbol == '>'){
                int explosion = Integer.parseInt(inputSb.charAt(i + 1 ) + "");
                total += explosion;

            } else if ( currentSymbol != '>' && total > 0) {
                inputSb.deleteCharAt(i);
                total--;
                i--;
            }
        }
        System.out.println(inputSb);

    }
}
