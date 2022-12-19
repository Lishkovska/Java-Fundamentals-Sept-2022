package mapsLampbdaStreamExcersise_07;

import java.util.*;

public class StudentAcademy_06 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();

        LinkedHashMap<String, List<String>> companyIdMap = new LinkedHashMap<>();

        while (!lineInput.equals("End")){
           String[] lineInputArr = scanner.nextLine().split(" -> ");
           String company = lineInputArr[0];
           String id = lineInputArr[1];

          if(companyIdMap.containsKey(company)){
              List<String> employees = companyIdMap.get(company);
              if(!employees.contains(id))
                  employees.add(id);
          } else {
              List<String> employees = new ArrayList<>();
              employees.add(id);
              companyIdMap.put(company, employees);
          }
          lineInput = scanner.nextLine();
        }

        companyIdMap.entrySet().forEach( entry -> {
            System.out.printf("%s%n",entry.getKey());
            entry.getValue().forEach(id -> System.out.println("-- " + id));
        });
    }
}
