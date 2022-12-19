package ArraysLesson_03;

import java.util.Scanner;

public class reverseArrayOfString_04 {
    public static void main(String[] arg ){

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        for ( int i = 0 ; i < inputArr.length / 2 ; i++){
            String oldNumber = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 -i] = oldNumber;
        }
        System.out.println(String.join(" ",inputArr));
    }
}
