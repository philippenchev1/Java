package RegularExpressions_RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";

        List<String> matchedPhones = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            matchedPhones.add(matcher.group());
        }

        System.out.println(String.join(", ",matchedPhones));


    }
}
