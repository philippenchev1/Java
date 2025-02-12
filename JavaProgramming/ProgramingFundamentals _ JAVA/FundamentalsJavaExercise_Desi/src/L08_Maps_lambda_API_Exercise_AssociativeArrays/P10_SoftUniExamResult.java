package L08_Maps_lambda_API_Exercise_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10_SoftUniExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userAndPoints = new LinkedHashMap<>();
        Map<String, Integer> languageCount = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")){
            String[] inputArr = input.split("-");
            String username = inputArr[0];

            if (input.contains("banned")){
                userAndPoints.remove(username);

            }else{
                String language = inputArr[1];
                int points = Integer.parseInt(inputArr[2]);

                if (!userAndPoints.containsKey(username)){
                    userAndPoints.put(username, points);
                }else{
                    int currentPoints = userAndPoints.get(username);
                    if (points > currentPoints){
                        userAndPoints.put(username, points);
                    }
                }

                if (!languageCount.containsKey(language)){
                    languageCount.put(language, 1);
                }else{
                    int currentCount = languageCount.get(language);
                    languageCount.put(language, currentCount + 1);
                }

            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userAndPoints.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languageCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
