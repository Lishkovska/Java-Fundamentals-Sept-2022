package MoreExersisesAdditional;

import java.util.Scanner;

public class trekkingManiaForLoop {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        int gropups = Integer.parseInt(scanner.nextLine());

        int mousala = 0;
        int monblan = 0 ;
        int kilimandjaro = 0 ;
        int k2 = 0 ;
        int everest = 0 ;

        int sumPeople =0;

        for ( int n = 0 ; n <= gropups ; n ++){
            int peopleInOneGroup = Integer.parseInt(scanner.nextLine());
            sumPeople += peopleInOneGroup ;

            if ( peopleInOneGroup <= 5){
                mousala = mousala + peopleInOneGroup ;
            } else if ( peopleInOneGroup <= 12 ){
                monblan = monblan + peopleInOneGroup;
            } else if ( peopleInOneGroup <= 25 ){
                kilimandjaro = kilimandjaro + peopleInOneGroup;
            } else if ( peopleInOneGroup <= 40) {
                k2 = k2 + peopleInOneGroup ;
            } else if (peopleInOneGroup >= 41) {
                everest = everest + peopleInOneGroup ;
            }
        }
        System.out.printf("%.2f%%%n",(mousala *1.0/ sumPeople) * 100);
        System.out.printf("%.2f%%%n",(monblan *1.0/ sumPeople) * 100);
        System.out.printf("%.2f%%%n",(kilimandjaro *1.0/ sumPeople) * 100);
        System.out.printf("%.2f%%%n",(k2 *1.0/ sumPeople) * 100);
        System.out.printf("%.2f%%%n",(everest *1.0/ sumPeople) * 100);
    }
}
