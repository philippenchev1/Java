package BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P10_MultiplicationTableForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10 ; i++) {
            int result = n * i;
            System.out.printf("%d X %d = %d%n",n,i,result);

        }
    }
}
