package ListsLesson_05;

import java.util.*;

public class ListOfProducts_06 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            String currentProduct = scanner.nextLine();

            productList.add(currentProduct);

        }
        Collections.sort(productList);
       for (int i = 0 ; i < productList.size() ; i++){
           System.out.println(i + 1 + "." + productList.get(i));
       }
    }
}
