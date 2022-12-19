package ListsExcercise_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> separatedArrays = Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(separatedArrays);

        System.out.println(separatedArrays.toString().replace("[", "").replace("]", "")
                .trim().replaceAll(",", "").replaceAll("\\s+", " "));



    }
}
