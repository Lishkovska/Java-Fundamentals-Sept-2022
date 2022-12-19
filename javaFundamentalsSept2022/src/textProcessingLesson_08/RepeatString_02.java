package textProcessingLesson_08;


import java.util.Scanner;

public class RepeatString_02 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : inputArr){
            int count = word.length();
            for (int i = 0 ; i < count ; i++){
                result.append(word);
            }
        }
        System.out.println(result);
    }
    }
