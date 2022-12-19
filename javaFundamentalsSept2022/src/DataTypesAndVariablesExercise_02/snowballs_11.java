package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class snowballs_11 {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        double maxSnowballValue = Double.MIN_VALUE ;
        int biggestSnowballSnow = 0;
        int biggestSnowballTime = 0;
        int biggestSnowballQuality =0;

        for ( int i = 1 ; i <= numberOfSnowballs ; i++){
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            //(snowballSnow / snowballTime) ^ snowballQuality
            double snowballValue = Math.pow (snowballSnow * 1.0 / snowballTime , snowballQuality);

            if ( snowballValue > maxSnowballValue){
                maxSnowballValue = snowballValue ;
                biggestSnowballSnow = snowballSnow;
                biggestSnowballTime = snowballTime ;
                biggestSnowballQuality = snowballQuality;
            }
        }
        //"{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})"
        System.out.printf("%d : %d = %.0f (%d)" , biggestSnowballSnow ,biggestSnowballTime,
                maxSnowballValue , biggestSnowballQuality);

    }
}
