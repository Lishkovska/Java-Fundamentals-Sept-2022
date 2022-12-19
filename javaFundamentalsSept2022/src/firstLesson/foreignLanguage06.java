package firstLesson;

import java.util.Scanner;

public class foreignLanguage06 {
    public static void main (String [] arg){
        Scanner scanner=new Scanner(System.in);

        String country=scanner.nextLine();

        switch (country){
            case "England" :
            case "USA" :
                System.out.println("English");
                break;
            case "Spain" :
            case "Argentina" :
            case "Mexico" :
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;

        }
    }
}
