package L06_NestedLoops;

import java.util.Scanner;

public class PME02_LettersCombinations {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        char firstLetter = scanner.next().charAt(0);
        char secondLetter = scanner.next().charAt(0);
        char thirdLetter = scanner.next().charAt(0);
        int counter = 0;

        for (char i = firstLetter; i<=secondLetter; i++) {
            for (char j = firstLetter; j <= secondLetter; j++) {
                for (char k = firstLetter; k <= secondLetter; k++) {
                    if (i == thirdLetter || j ==thirdLetter || k ==thirdLetter) {
                        continue;
                    } else {
                        counter++;
                        System.out.printf("%c%c%c ", i,j,k);
                    }
                }
            }
        }
        System.out.println(counter);
    }
}