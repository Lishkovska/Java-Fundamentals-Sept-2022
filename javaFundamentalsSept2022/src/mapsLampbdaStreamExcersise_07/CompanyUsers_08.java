package mapsLampbdaStreamExcersise_07;

import java.util.*;

public class CompanyUsers_08 {
    public static void main (String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        LinkedHashMap<String, List<String>> companyDataMap = new LinkedHashMap<>();

        while (!inputData.equals("End")){
            String companyName = inputData.split(" -> ")[0];
            String id = inputData.split(" -> ")[1];

            if(!companyDataMap.containsKey(companyName)){
                companyDataMap.put(companyName, new ArrayList<>());
            } else {
                companyDataMap.get(companyName).add(id);
            }
             if (companyDataMap.get(companyName).equals(id)){
                 companyDataMap.get(companyName).remove(id);
             }




            inputData = scanner.nextLine();
        }

        companyDataMap.entrySet().forEach( entry -> {
            System.out.printf("%s%n",entry.getKey());
            entry.getValue().forEach(id -> System.out.println("-- " + id));
        });

    }

}

