package Methods;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int numberRepeat = Integer.parseInt(scanner.nextLine());


        System.out.println(repeatString(text,numberRepeat));

    }

    public static String repeatString (String text, int count){
        String result = "";
        for (int i = 0; i < count ; i++) {
            result = result + text;
        }
        return result;
    }
}
