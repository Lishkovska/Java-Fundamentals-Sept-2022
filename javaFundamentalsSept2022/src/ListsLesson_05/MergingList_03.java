package ListsLesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingList_03 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        List< Integer > firstList = Arrays.stream (scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        List< Integer > secondList = Arrays.stream (scanner.next().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int minSize = Math.min(firstList.size(), secondList.size());
        for (int i = 0 ; i < minSize ; i++){
            int firstNum = firstList.get(i);
            int secondNum = secondList.get(i);

            resultList.add(firstNum);
            resultList.add(secondNum);
        }
        if (firstList.size() > secondList.size()){
            resultList.addAll(firstList.subList(minSize, firstList.size()));
        } else if (firstList.size() < secondList.size()){
            resultList.addAll(secondList.subList(minSize, secondList.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]"," "));

    }
}
