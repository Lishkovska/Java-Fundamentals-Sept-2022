package regexExcersise_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmeails_04 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        //"[A-Za-z0-9]+[._-]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+";
        String regex = "[A-Za-z0-9]+[.-_]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textInput);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
