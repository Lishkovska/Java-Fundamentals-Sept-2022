package DataTypesAndVariablesExercise_02;

import java.util.Scanner;

public class beerKegs_08 {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolumeKeg = Double.MIN_VALUE ;
        String kegModel = " " ;

        for ( int i = 1 ; i <= n ; i++){
            String keg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius , 2) * height;

            if ( volume > maxVolumeKeg){
                maxVolumeKeg = volume ;
                kegModel = keg ;
            }
        }
        System.out.println(kegModel);

    }
}
