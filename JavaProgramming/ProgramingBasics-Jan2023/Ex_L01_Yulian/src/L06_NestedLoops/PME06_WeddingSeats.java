package L06_NestedLoops;

import java.util.Scanner;

public class PME06_WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int countRows = Integer.parseInt(scanner.nextLine());
        int countSeats = Integer.parseInt(scanner.nextLine());

        int seatCounter = 0;

        for (char sector = 'A'; sector <= lastSector.charAt(0); sector++){
            int seatsPerRow;
            for (int row = 1; row <= countRows ; row++) {

                if (row % 2 == 0){
                    seatsPerRow = countSeats + 2;
                }else {
                    seatsPerRow = countSeats;
                }
                for (char seat = 'a'; seatsPerRow > 0;seat++){
                    System.out.printf("%s%d%s%n",sector,row,seat);
                    seatCounter++;
                    seatsPerRow--;
                }

            }
            countRows++;
        }
        System.out.println(seatCounter);

    }
}
