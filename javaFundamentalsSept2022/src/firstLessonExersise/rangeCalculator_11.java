package firstLessonExersise;

import java.util.Scanner;

public class rangeCalculator_11 {
    public static void main (String [] arg){

        Scanner scanner = new Scanner(System.in);

        int lostGames= Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int brokenHeadset = lostGames / 2 ;
        int brokenMouse = lostGames / 3 ;
        int brokenKeyboard = lostGames / 6 ;
        int brokenDisplay = lostGames / 12 ;

        double allCosts = (headsetPrice * brokenHeadset) + (mousePrice * brokenMouse )+ (keyboardPrice
        * brokenKeyboard) + (displayPrice * brokenDisplay);

        System.out.printf("Rage expenses: %.2f lv.", allCosts);



    }
}
