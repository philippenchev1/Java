package L10_RegEx_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furniture = new ArrayList<>();
        double totalSum = 0;

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?[0-9]*)!(?<quantity>\\d+)";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String furnitureName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                double currentPrice = quantity * price;
                totalSum += currentPrice;
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);

        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
