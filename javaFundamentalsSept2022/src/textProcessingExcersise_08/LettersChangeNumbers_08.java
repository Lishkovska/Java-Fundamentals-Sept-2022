package textProcessingExcersise_08;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] codesArr = input.split("\\s+");

        double totalSumCodesFirst = 0 ;
        double totalSumCodesSecond = 0 ;

        for (String codes : codesArr){
            char firstLetter = codes.charAt(0);
            char secondLetter = codes.charAt(2);
            double number = Double.parseDouble(codes.replace(firstLetter, ' ')
                    .replace(secondLetter, ' ')
                    .trim());

            if (Character.isUpperCase(firstLetter)){
                int position = (int) firstLetter - 64 ;
                totalSumCodesFirst /= number / position;

            } else {
                int positionLowerCase = (int) - 96 ;
                totalSumCodesFirst *= number * positionLowerCase ;
            }

            if (Character.isUpperCase(secondLetter)){
                int position = (int) firstLetter - 64 ;
                totalSumCodesSecond -= number - position;

            } else {
                int positionLowerCase = (int) - 96 ;
                totalSumCodesSecond += number + positionLowerCase ;

            }
        }
        System.out.printf("%.2f", totalSumCodesFirst + totalSumCodesSecond);


    }
}
