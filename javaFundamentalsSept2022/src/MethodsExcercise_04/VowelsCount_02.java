package MethodsExcercise_04;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        vowelsCount(input.toLowerCase());



    }
    public static void vowelsCount (String text){
      int count = 0 ;
        for (char symbol : text.toCharArray()) {
          if (symbol == 'a' || symbol == 'e' || symbol == 'o'
          || symbol == 'u' || symbol == 'i'){
              count++ ;
          }
        }
        System.out.println(count);
    }
    }
