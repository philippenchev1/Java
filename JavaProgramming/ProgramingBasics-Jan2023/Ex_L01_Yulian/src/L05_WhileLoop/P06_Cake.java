package L05_WhileLoop;

import java.util.Scanner;

public class P06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wide = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int allAvailablePieces = wide*length;

        String command = scanner.nextLine();

        while (!command.equals("STOP")){
            int numPieces = Integer.parseInt(command);
            allAvailablePieces -= numPieces;

            if (allAvailablePieces <= 0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allAvailablePieces));
                break;
            }

            command = scanner.nextLine();

        }
        if (allAvailablePieces > 0){
            System.out.printf("%d pieces are left.%n",allAvailablePieces);

        }



    }
}
