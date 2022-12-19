package MethodsLesson_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        double firstNumInput = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNumInput = Double.parseDouble(scanner.nextLine());

        DecimalFormat resultDf = new DecimalFormat("##.##");

        switch (operator){
            case '/' :
             double result = getResult(firstNumInput, secondNumInput);
             System.out.println(resultDf.format(result));
             break;
            case '*' :
                double resultMult = getResultMultiply(firstNumInput, secondNumInput);
                System.out.println (resultDf.format(resultMult));
                break;
            case '+' :
                double resultAdd = getResultAdd(firstNumInput, secondNumInput);
                System.out.println(resultDf.format(resultAdd));
                break;
            case '-' :
                double resultSubtract = getResultSubtract(firstNumInput, secondNumInput);
                System.out.println(resultDf.format(resultSubtract));
                break;

        }
    }
    public static double getResult (double firstNum, double secondNum){
        double divide = firstNum / secondNum;
        return divide;
    }
    public static double getResultMultiply (double firstNum, double secondNum){
        double multiply = firstNum * secondNum;
        return multiply;
    }
    public static double getResultAdd (double firstNum, double secondNum){
        double add = firstNum + secondNum;
        return add;
    }
    public static double getResultSubtract (double firstNum, double secondNum){
        double subtract = firstNum - secondNum;
        return subtract;
    }

}
