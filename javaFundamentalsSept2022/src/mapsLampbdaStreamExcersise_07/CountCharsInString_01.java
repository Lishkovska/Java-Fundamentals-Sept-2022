package mapsLampbdaStreamExcersise_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String inputWord = scanner.nextLine().replaceAll (" ","");
        inputWord.toCharArray();

        LinkedHashMap<Character, Integer> countCharsMap = new LinkedHashMap<>();
        for (char i : inputWord.toCharArray()){
            if(!countCharsMap.containsKey(i)){
                countCharsMap.put(i, 1);
            } else {
                countCharsMap.put(i, countCharsMap.get(i) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countCharsMap.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
