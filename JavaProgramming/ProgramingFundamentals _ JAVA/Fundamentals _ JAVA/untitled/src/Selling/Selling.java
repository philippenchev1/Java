package Selling;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Selling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];


        for (int row = 0; row < size; row++) {
            String valuesOfRow = scanner.nextLine();
            matrix[row] = valuesOfRow.split("");

        }

        int currentRow = -1;
        int currentCol = -1;

        int firstPillarRow = 0;
        int firstPillarCol = 0;

        int secondPillarRow = 0;
        int secondPillarCol = 0;

        boolean isFound = false;


        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col].equals("S")){
                    currentRow = row;
                    currentCol = col;
                }

                if (matrix[row][col].equals("O") && isFound == false){
                    firstPillarRow = row;
                    firstPillarCol = col;
                    isFound = true;
                }

                if (matrix[row][col].equals("O") && isFound == true){
                    secondPillarRow = row;
                    secondPillarCol = col;
                }

            }
        }

        int money = 0;
        while (money < 50) {
            String commands = scanner.nextLine();
            int oldRow = currentRow;
            int oldCol = currentCol;

            switch (commands) {
                case "up":
                    currentRow--;
                break;
                case "down":
                    currentRow++;
                break;
                case "left":
                    currentCol--;
                break;
                case "right":
                    currentCol++;
                break;

            }

            if (currentRow < 0 || currentRow >= size || currentCol < 0 || currentCol >= size){
                matrix[oldRow][oldCol] = "-";
                break;
            }

            if (currentRow == firstPillarRow && currentCol == firstPillarCol){
                currentRow = secondPillarRow;
                currentCol = secondPillarCol;
                matrix[oldRow][oldCol] = "-";
                matrix[firstPillarRow][firstPillarCol] = "-";
                matrix[currentRow][currentCol] = "S";
            } else if (matrix[currentRow][currentCol].equals("-")) {
                matrix[oldRow][oldCol] = "-";
                matrix[currentRow][currentCol] = "S";
            } else {
                money += Integer.parseInt(matrix[currentRow][currentCol]);
                matrix[oldRow][oldCol] = "-";
                matrix[currentRow][currentCol] = "S";
            }
        }

        if (money >= 50){
            System.out.println("Good news! You succeeded in collecting enough money!");
        } else {
            System.out.println("Bad news, you are out of the bakery.");
        }

        System.out.println("Money: "+ money);
        printMatrix(size, matrix);


    }

    private static void printMatrix(int size, String[][] matrix) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
