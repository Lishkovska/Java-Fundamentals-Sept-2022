package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class pokemon_10 {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int countPoke = 0;
        int firstPower = power;
        while ( power >= distance){
            power = power - distance ;
            countPoke++;

            if (power == firstPower /2){
                if (factor != 0){
                    power = power / factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPoke);

    }
}
