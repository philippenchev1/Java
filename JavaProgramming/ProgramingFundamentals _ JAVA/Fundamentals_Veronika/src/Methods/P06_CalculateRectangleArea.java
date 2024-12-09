package Methods;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = area(width,height);

        System.out.printf("%.0f",area);

    }
    public static double area (double a,double b){
        return a * b;
    }
}
