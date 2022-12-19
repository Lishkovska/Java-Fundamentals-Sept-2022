package textProcessingLesson_08;

import java.util.Scanner;

public class Substring_03 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String wordInput = scanner.nextLine();


        int index = wordInput.indexOf(wordToRemove);

        while (index != -1){
            index = wordInput.indexOf(wordToRemove);

            for (int i = 0 ; i < wordInput.length() ; i++){
                wordInput = wordInput.replace(wordToRemove, "");
            }
        }

        System.out.println(wordInput);

    }
}
