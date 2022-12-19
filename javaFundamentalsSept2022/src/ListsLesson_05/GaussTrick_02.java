package ListsLesson_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);


        List< Integer > numbersList = Arrays.stream (scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        int listSize = numbersList.size();
        for (int i = 0 ; i < listSize/ 2 ; i++){
            int firstNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size()-1);

            numbersList.set(i, firstNum+lastNum);
            numbersList.remove(numbersList.size()-1);
        }
        for ( int currentNum : numbersList){
            System.out.print(currentNum + " ");
        }

    }
}
