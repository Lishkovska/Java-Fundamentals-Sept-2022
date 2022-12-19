package MethodsLesson_04;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (commandInput){
            case "add" :
                addResult(firstNumInput, secondNumInput);
                break;
            case "multiply" :
                multiplyResult(firstNumInput, secondNumInput);
                break;
            case "subtract" :
                subtractResult(firstNumInput, secondNumInput);
                break;
            case "divide" :
                divideResult(firstNumInput, secondNumInput);
                break;
        }

    }
       public static void addResult (int firstNum, int secondNum){
          System.out.println(firstNum + secondNum);
       }
       public static void multiplyResult (int firstNum, int secondNum){
          System.out.println(firstNum * secondNum);
       }
       public static void subtractResult (int firstNum , int secondNum){
           System.out.println(firstNum - secondNum);
       }
       public static void divideResult (int firstNum, int secondNum){
           System.out.println(firstNum / secondNum);
       }

}
