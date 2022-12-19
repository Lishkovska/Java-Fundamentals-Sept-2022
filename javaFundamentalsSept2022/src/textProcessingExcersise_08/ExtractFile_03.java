package textProcessingExcersise_08;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String[] inputLineArr = scanner.nextLine().split("\\\\");

        String fileToExtract = inputLineArr[inputLineArr.length - 1];
        String fileName = fileToExtract.split("\\.")[0];
        String fileExtension = fileToExtract.split("\\.")[1];

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s%n",fileExtension);

    }
}
