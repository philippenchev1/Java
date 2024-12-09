package Arrays;

import java.util.Scanner;

public class PP01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Day of Week
        //Enter a day number and print the day name (in English) or "Invalid day!". Use an array of strings.

        //Hints
        //•	Use an array of strings holding the day names:
        // {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}.
        //•	Print the element at index (day-1) when it is in the range [1…7] or "Invalid Day!" otherwise.

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int day = Integer.parseInt(scanner.nextLine());

        if (day >= 1 && day <= 7){
            System.out.println(days[day - 1]);
        }else {
            System.out.println("Invalid day!");
        }


    }
}
