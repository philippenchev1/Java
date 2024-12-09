package L06_Exam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class P03_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());


        int sumNumbers = 0;
        for (int number : numbersList){
            sumNumbers += number;
        }

        double avgNumber = sumNumbers * 1.0 / numbersList.size();

        List<Integer> biggestNumberList = new ArrayList<>();

        for (int number : numbersList){
            if (number > avgNumber){
                biggestNumberList.add(number);
            }
        }

        Collections.sort(biggestNumberList);
        Collections.reverse(biggestNumberList);

        if (biggestNumberList.size() > 0){
            if (biggestNumberList.size() < 5){
                System.out.println(biggestNumberList.toString()
                        .replace("[","")
                        .replace("]","")
                        .replace(",",""));
            }else {
                List<Integer> top5Numbers = biggestNumberList.subList(0,5);
                for (int number : top5Numbers){
                    System.out.print(number + " ");
                }
            }
        } else {
            System.out.println("No");
        }

    }
}
