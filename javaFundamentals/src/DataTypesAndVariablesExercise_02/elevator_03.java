package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class elevator_03 {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(numberOfPeople * 1.0 / capacityOfElevator );


        System.out.printf("%.0f",courses);

    }
}
