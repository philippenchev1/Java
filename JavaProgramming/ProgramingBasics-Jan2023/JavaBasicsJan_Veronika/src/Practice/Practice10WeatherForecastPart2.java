package Practice;

import java.util.Scanner;

public class Practice10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която при въведени градуси (реално число) принтира какво е времето,
        //Ако се въведат градуси, различни от посочените в таблицата, да се отпечата "unknown".

        //26.00 - 35.00	Hot
        //20.1 - 25.9	Warm
        //15.00 - 20.00	Mild
        //12.00 - 14.9	Cool
        //5.00 - 11.9	Cold

        double temperature = Double.parseDouble(scanner.nextLine());
        
        if (temperature < 5) {
            System.out.println("unknown");
        } else if (temperature <= 11.9) {
            System.out.println("Cold");
        } else if (temperature<= 14.9) {
            System.out.println("Cool");
        } else if (temperature <= 20) {
            System.out.println("Mild");
        } else if (temperature <= 25.9) {
            System.out.println("Warm");
        } else if (temperature <= 35) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");

    }

    }


    }

