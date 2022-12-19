package textProcessingExcersise_08;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String firstNum = scanner.nextLine();
        String secondNum = scanner.nextLine();


        BigInteger firstNumberBig = new BigInteger(firstNum);
        BigInteger secondNumberBig = new BigInteger(secondNum);

        BigInteger productBig = firstNumberBig.multiply(secondNumberBig);

        System.out.println(productBig);



    }
}
