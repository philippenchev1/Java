package Practice;

import java.util.Scanner;

public class Practice03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете градуси по скалата на Целзий (°C) и ги преобразува до градуси по скалата на Фаренхайт (°F).
        // Потърсете в Интернет подходяща формула, с която да извършите изчисленията.
        // Форматирате изхода до втория знак след десетичната запетая.

        double celsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f",fahrenheit);
    }
}
