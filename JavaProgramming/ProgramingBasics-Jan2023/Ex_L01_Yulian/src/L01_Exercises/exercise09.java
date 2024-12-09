package L01_Exercises;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int widht = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int obem = lenght * widht * high ;
        double obemLitter = obem * 0.001;
        double percents = percent * 0.01;

        double needLittres = obemLitter * (1-percents);


        System.out.println(needLittres);


    }
}

