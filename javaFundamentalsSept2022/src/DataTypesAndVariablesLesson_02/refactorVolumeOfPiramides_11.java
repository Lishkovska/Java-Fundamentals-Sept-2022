package DataTypesAndVariablesLesson_02;

import java.util.Scanner;

public class refactorVolumeOfPiramides_11 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double volume = ( length * width * height) / 3;

        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", volume);

    }
}
