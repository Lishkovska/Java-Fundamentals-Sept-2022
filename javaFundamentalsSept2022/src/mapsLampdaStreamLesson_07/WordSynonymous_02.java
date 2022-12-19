package mapsLampdaStreamLesson_07;

import java.util.*;

public class WordSynonymous_02 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> wordsMap = new LinkedHashMap<>();
        for (int i = 1 ; i <=n ; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            wordsMap.putIfAbsent(word, new ArrayList<>());
            wordsMap.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(), String.join(", ", entry.getValue()));
        }


    }
}
