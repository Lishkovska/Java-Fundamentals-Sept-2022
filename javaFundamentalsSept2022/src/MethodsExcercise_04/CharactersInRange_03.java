package MethodsExcercise_04;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        charactersRange(firstSymbol, secondSymbol);

    }
    public static void charactersRange (char symbol1, char symbol2){
       if (symbol1 < symbol2){
           for (char start = (char)(symbol1 + 1) ; start < symbol2 ; start++){
               System.out.print(start + " ");
           }
       }  else {
           for (char start = (char)(symbol2 + 1) ; start < symbol1 ; start++){
               System.out.print(start + " ");
       }
       }
    }
    }
