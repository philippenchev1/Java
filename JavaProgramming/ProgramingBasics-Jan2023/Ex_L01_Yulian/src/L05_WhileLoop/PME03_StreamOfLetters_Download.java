package L05_WhileLoop;

import java.util.Scanner;

public class PME03_StreamOfLetters_Download {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int c = 0, o = 0, n = 0;
        String word = "";

        while (!command.equals("End")) {

            char letter = command.charAt(0);

            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                switch (letter) {
                    case 'c':
                        if (c > 0) {
                            word += letter;
                        }
                        c++;
                        break;
                    case 'o':
                        if (o > 0) {
                            word += letter;
                        }
                        o++;
                        break;
                    case 'n':
                        if (n > 0) {
                            word += letter;
                        }
                        n++;
                        break;
                    default:
                        word += letter;
                }
            }
            if (c > 0 && o > 0 && n > 0) {
                System.out.print(word + " ");
                c = 0;
                o = 0;
                n = 0;
                word = "";
            }
            command = scanner.next();
        }
    }
}
