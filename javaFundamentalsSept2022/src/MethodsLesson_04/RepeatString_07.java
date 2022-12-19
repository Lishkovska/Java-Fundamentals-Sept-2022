package MethodsLesson_04;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int nInput = Integer.parseInt(scanner.nextLine());

        String repeatString = repeatString(input, nInput);
        System.out.print(repeatString);

    }
    public static String repeatString (String text, int n){
        String result = "";
        for (int i = 0 ; i < n ; i++){
            result = result + text;
        }
        return result;
    }
    }
