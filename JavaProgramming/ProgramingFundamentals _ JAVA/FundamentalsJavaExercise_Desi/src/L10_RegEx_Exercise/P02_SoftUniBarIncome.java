package L10_RegEx_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalIncome = 0.0;

        while (!input.equals("end of shift")) {
            Pattern pattern = Pattern.compile("%([A-Z][a-z]+)%.*?<([\\w]+)>.*?\\|([0-9]+)\\|.*?(\\d+\\.?\\d*)\\$");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customerName = matcher.group(1);
                String product = matcher.group(2);
                int count = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));
                double totalPrice = count * price;
                System.out.printf("%s: %s - %.2f%n", customerName, product, totalPrice);
                totalIncome += totalPrice;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}
