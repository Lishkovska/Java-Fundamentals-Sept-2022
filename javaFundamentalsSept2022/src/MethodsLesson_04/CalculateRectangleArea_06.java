package MethodsLesson_04;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int widthInput = Integer.parseInt(scanner.nextLine());
        int heightInput = Integer.parseInt(scanner.nextLine());

        int areaResult = area(widthInput, heightInput);
        System.out.println(areaResult);

    }
    public static int area (int width, int height){
        int result = width * height;
        return result;
    }
}
