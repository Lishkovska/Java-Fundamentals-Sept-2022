package MoreExersisesAdditional;

import java.util.Scanner;

public class oskarsForLoop {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        String nameOfAactor = scanner.nextLine();
        double pointFromAcademy = Double.parseDouble(scanner.nextLine());
        int numberOfJury = Integer.parseInt(scanner.nextLine());

        double sumPoints = 0;
        double finalPoints = 0;
        for (int i = 1; i <= numberOfJury; i++) {
            String nameOfMemmberOfJury = scanner.nextLine();
            double pointsFromMember = Double.parseDouble(scanner.nextLine());

            int lenght = nameOfMemmberOfJury.length();
            double calculatedPoints = (lenght * pointsFromMember) / 2;
            sumPoints += calculatedPoints;
            finalPoints = sumPoints + pointFromAcademy;

            if (finalPoints > 1250.5 ) {
                break;
            }
        }
        if (finalPoints > 1250) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                    nameOfAactor, finalPoints);

        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameOfAactor, 1250.5 - finalPoints);
        }
    }
}
