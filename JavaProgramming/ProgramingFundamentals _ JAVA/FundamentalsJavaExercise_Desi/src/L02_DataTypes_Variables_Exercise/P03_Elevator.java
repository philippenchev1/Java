package L02_DataTypes_Variables_Exercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = numberPeople * 1.0 / capacity;

        System.out.printf("%.0f",Math.ceil(courses));
    }
}
