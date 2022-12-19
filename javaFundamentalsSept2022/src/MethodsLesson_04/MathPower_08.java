package MethodsLesson_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        double numberInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());

        double resultMathPower = getMathPower(numberInput, powerInput);
        DecimalFormat result = new DecimalFormat("0.####");
        System.out.println(result.format(resultMathPower));

    }

    public static double getMathPower(double num, double power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * num;
        }
        return result;
    }
}


