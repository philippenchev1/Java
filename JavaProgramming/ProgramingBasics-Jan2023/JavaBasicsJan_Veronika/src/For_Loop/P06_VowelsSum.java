package For_Loop;

import java.util.Scanner;

public class P06_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0;
        // hello
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            switch (currentSymbol) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}


