package mapsLampbdaStreamExcersise_07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Courses_05 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> coursesAndNamesMap = new LinkedHashMap<>();

        while (!command.equals("end")){

          String course =command.split(" : ")[0];
          String name =command.split(" : ")[1];

          if (!coursesAndNamesMap.containsKey(course)){
              coursesAndNamesMap.put(course, new ArrayList<>());
          }
          coursesAndNamesMap.get(course).add(name);
          command = scanner.nextLine();
        }
        coursesAndNamesMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(name -> System.out.println("-- " + name));
        });

    }
}
