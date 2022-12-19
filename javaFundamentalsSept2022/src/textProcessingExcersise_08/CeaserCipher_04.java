package textProcessingExcersise_08;

import java.util.Scanner;

public class CeaserCipher_04 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for(char symbol : textInput.toCharArray()){
            encryptedText.append((char)(symbol + 3));
        }
        System.out.println(encryptedText);
    }
}
