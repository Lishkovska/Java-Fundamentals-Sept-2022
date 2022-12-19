package textProcessingLesson_08;

import java.util.Scanner;

public class DigitLettersAndOthers_05 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        StringBuilder digitsSb = new StringBuilder();
        StringBuilder lettersSb = new StringBuilder();
        StringBuilder othersSb = new StringBuilder();

        char [] symbolsArr = lineInput.toCharArray();
        for ( char currentSymbol : symbolsArr){
            if(Character.isDigit(currentSymbol)){
                digitsSb.append(currentSymbol);
            } else if (Character.isLetter(currentSymbol)){
                lettersSb.append(currentSymbol);
            } else {
                othersSb.append(currentSymbol);
            }
        }
        System.out.println(digitsSb);
        System.out.println(lettersSb);
        System.out.println(othersSb);

    }
}
