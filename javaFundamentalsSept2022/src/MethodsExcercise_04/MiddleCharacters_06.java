package MethodsExcercise_04;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacters(input);
    }

    private static void printMiddleCharacters (String text) {
        if (text.length() % 2 == 1) {
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }
        else {
            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;

            System.out.println("" + text.charAt(indexFirstMiddleCharacter) + text.charAt(indexSecondMiddleCharacter));
        }
    }
}

