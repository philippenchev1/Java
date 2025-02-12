package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String product = scanner.nextLine();
            products.add(product);

        }

        Collections.sort(products);

        int number = 1;
        for (String product : products){
            System.out.println(number + "." + product);
            number++;
        }
    }
}
