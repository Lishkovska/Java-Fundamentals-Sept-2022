package regexLesson_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers_02 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher matcher = pattern.matcher(input);

        List<String> phoneNumbers = new ArrayList<>();

        while (matcher.find()){
            phoneNumbers.add(matcher.group());
        }
        System.out.print(String.join(", ",phoneNumbers));

    }
}
