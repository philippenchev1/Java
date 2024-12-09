package L06_NestedLoops;

import java.util.Scanner;

public class PME07_SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int passwordCounter = 0;

        char A = 35;
        char B = 64;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b ; y++) {
                if (passwordCounter == maxPasswords){
                    break;
                }else {
                    System.out.printf("%s%s%d%d%s%s|",A,B,x,y,B,A);
                    A++;
                    B++;
                    passwordCounter++;

                    if (A > 55){
                        A = 35;
                    }
                    if (B > 96){
                        B = 64;
                    }
                }

            }

        }

    }
}
