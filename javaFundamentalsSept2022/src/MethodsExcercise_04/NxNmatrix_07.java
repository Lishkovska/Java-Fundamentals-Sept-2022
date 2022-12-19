package MethodsExcercise_04;

import java.util.Scanner;

public class NxNmatrix_07 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        getMatrix(n);

    }

    public static void getMatrix(int n) {
        for (int row = 1; row <= n; row ++){
            for (int column = 1; column <= n; column++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
