package mapsLampdaStreamLesson_07;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).filter(e -> e.length() % 2 == 0)
                .toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(),inputArr));


    }
}
