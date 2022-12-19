package textProcessingExcersise_08;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(", ");


        for (String username : inputArr) {
          if (isValidUsername(username)){
              System.out.println(username);
          }
        }
    }

    public static boolean isValidUsername(String username) {
        boolean isValidLength = username.length() >= 3 && username.length() <= 16;
        boolean isValidContent = false;

        for (char currentSymbol : username.toCharArray()){
            if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_'){
                 return false;
            }
        }
        isValidContent = true;
        return isValidLength && isValidContent;
    }

}

