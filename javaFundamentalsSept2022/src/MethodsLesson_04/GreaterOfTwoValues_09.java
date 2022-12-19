package MethodsLesson_04;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "int" :
                int firstNumInput = Integer.parseInt(scanner.nextLine());
                int secondNumInput = Integer.parseInt(scanner.nextLine());
                int result = getMax(firstNumInput, secondNumInput);
                System.out.println(result);
                break;
            case "char" :
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                char resultChar = getMax(firstSymbol, secondSymbol);
                System.out.println(resultChar);
                break;
            case "string" :
                String firstInput = scanner.nextLine();
                String secondInput = scanner.nextLine();
                String resultText = getMax(firstInput, secondInput);
                System.out.println(resultText);
                break;
        }

    }
    public static int getMax (int firstNum, int secondNum){
        if (firstNum > secondNum){
           return firstNum;
        } else {
            return secondNum;
        }
    }
    public static char getMax (char firstSymbol, char secondSymbol){
        if (firstSymbol > secondSymbol){
            return firstSymbol;
        } else {
            return secondSymbol;
        }
    }
    public static String getMax (String firstText, String secondText){
        if (firstText.compareTo(secondText) >=0 ){
            return firstText;
        } else {
            return secondText;
        }
    }
}
