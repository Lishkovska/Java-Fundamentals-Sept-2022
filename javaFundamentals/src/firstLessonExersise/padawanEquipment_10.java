package firstLessonExersise;

import java.util.Scanner;

public class padawanEquipment_10 {
    public static void main (String [] arg){
        Scanner scanner=new Scanner(System.in);

        double budjet=Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceForLightsabers = Double.parseDouble(scanner.nextLine());
        double priceForRobes = Double.parseDouble(scanner.nextLine());
        double priceForBelts = Double.parseDouble(scanner.nextLine());

        double amountLightsabers = Math.ceil(countOfStudents + 0.10 * countOfStudents) * priceForLightsabers ;
        double amountRobes = countOfStudents * priceForRobes ;
        double amountBelts = (countOfStudents -  countOfStudents/ 6) * priceForBelts ;

        double allCosts = amountLightsabers + amountRobes +amountBelts ;

        if (allCosts <= budjet){
            System.out.printf("The money is enough - it would cost %.2flv.",allCosts);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(allCosts - budjet));
        }
    }
}
