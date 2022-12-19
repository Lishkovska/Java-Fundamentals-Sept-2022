package textProcessingLesson_08;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String bannedWords = scanner.nextLine();
        String[] bannedArr = bannedWords.split(", ");
        String textInput = scanner.nextLine();

        for (String word : bannedArr){
          textInput = textInput.replace(word, repeatSymbol("*", word.length()));

        }
        System.out.println(textInput);
    }
    public static String repeatSymbol (String s , int count){
        String result = "";
        for (int i = 0 ; i < count ; i++ ){
           result = result + s;
        }
        return result;
    }
}
