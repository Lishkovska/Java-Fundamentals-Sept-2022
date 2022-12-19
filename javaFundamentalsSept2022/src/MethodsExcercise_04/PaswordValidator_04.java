package MethodsExcercise_04;

import java.util.Scanner;

public class PaswordValidator_04 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String passwordInput =  scanner.nextLine();

       boolean isRightLength = isCorrectLength(passwordInput);
       if (!isRightLength){
           System.out.println("Password must be between 6 and 10 characters");
       }

       boolean isCorrectLettersAndDigits = isCorrectContent(passwordInput);
       if (!isCorrectLettersAndDigits){
           System.out.println("Password must consist only of letters and digits");
       }

       boolean isContainTwoDigits = isCountDigits(passwordInput);
           if (! isContainTwoDigits){
               System.out.println("Password must have at least 2 digits");
           }


       if (isRightLength && isCorrectLettersAndDigits && isContainTwoDigits ){
           System.out.println("Password is valid");
       }

    }

    public static boolean isCorrectLength (String password){
        if (password.length() >= 6 && password.length() <=10){
            return true;
        } else {
            return  false;
        }
    }
    public static boolean isCorrectContent (String password){
        for (char symbol : password.toCharArray()) {
            if (! Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    public static boolean isCountDigits (String password){
        int count = 0;
        for ( char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)){
                count++;
            }
        }
        return count >= 2;
    }
    }
