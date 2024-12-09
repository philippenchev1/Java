package Lists_More_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String text = scanner.nextLine();
        String finalWord = "";

        for (int i = 0; i < numbersList.size(); i++) {
            int listIntValue = GetNumbersValue(numbersList.get(i));
            if (listIntValue > text.length()) {
                listIntValue = listIntValue - (text.length());
            }
            for (int j = 0; j < text.length(); j++) {
                if (j == listIntValue) {
                    finalWord += text.charAt(j);
                }
            }
            String modifiedText = "";
            for (int j = 0; j < text.length(); j++) {
                if (j == listIntValue) {
                    continue;
                } else {
                    modifiedText += text.charAt(j);
                }
            }
            text = modifiedText;
        }

        System.out.println(finalWord);

    }

    private static int GetNumbersValue(Integer number) {
        int value = 0;
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            String currentValue = String.valueOf(String.valueOf(number).charAt(i));
            value += Integer.parseInt(currentValue);
        }
        return  value;
    }
}
