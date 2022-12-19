package ListsExcercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGames_06 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayerList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (firstPlayerList.size() != 0 && secondPlayerList.size() != 0) {
            int currentCardFirstPlayer = firstPlayerList.get(0);
            int currentCardSecondPlayer = secondPlayerList.get(0);
            firstPlayerList.remove(0);
            secondPlayerList.remove(0);

            if (currentCardFirstPlayer > currentCardSecondPlayer) {
                firstPlayerList.add(currentCardFirstPlayer);
                firstPlayerList.add(currentCardSecondPlayer);

            } else if (currentCardSecondPlayer > currentCardFirstPlayer) {
                secondPlayerList.add(currentCardSecondPlayer);
                secondPlayerList.add(currentCardFirstPlayer);

            }
        }
        if (firstPlayerList.size() == 0){
            System.out.printf("Second player wins! Sum: %d",getCardsSum(secondPlayerList));
        } else if (secondPlayerList.size() == 0){
            System.out.printf("First player wins! Sum: %d",getCardsSum(firstPlayerList));
        }
    }

    public static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }
        return sum;

    }
}
