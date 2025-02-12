package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07WorkingHoursBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        boolean isWorkingDays = dayOfWeek.equals("Monday") ||
                dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday") ||
                dayOfWeek.equals("Saturday");

        boolean isWorkingHours = hour >= 10 && hour <= 18;

        if (isWorkingDays && isWorkingHours) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
