package mapsLampdaStreamLesson_07;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TreeMap<Integer, Integer> numsMap = new TreeMap<>();

        for (int current : numsArr){
            if (!numsMap.containsKey(current)){
                numsMap.put(current, 0);
            }
            numsMap.put(current, numsMap.get(current) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            System.out.printf("%d -> %d%n",entry.getKey(), entry.getValue() );
        }


    }
}
