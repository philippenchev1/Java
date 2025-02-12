package MidExamPractice_07_04_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Moving_Target {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")){
            String[] commandLine = inputLine.split(" ");
            String command = commandLine[0];
            int index = Integer.parseInt(commandLine[1]);
            int value = Integer.parseInt(commandLine[2]);

            switch (command){
                case "Shoot" :
                    if (validIndex(targetList, index)){
                        int currentNum = targetList.get(index);
                        currentNum = currentNum - value;
                        if (currentNum <= 0){
                            targetList.remove(index);
                        }else {
                            targetList.set(index,currentNum);
                        }
                    }
                    break;
                case "Add":
                    if (validIndex(targetList, index)){
                        targetList.add(index, value);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    boolean validIndexRadius = targetList.size() - 1 >= index
                            && targetList.size() - 1 >= index + value
                            && index - value >= 0;
                    if (validIndexRadius){
                        int radius = value * 2 + 1;
                        for (int i = 0; i < radius; i++) {
                            targetList.remove(index - value);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            inputLine = scanner.nextLine();
        }

        List<String> resultList = new ArrayList<>();
        for (Integer target : targetList) {
            resultList.add(String.valueOf(target));
        }
        System.out.println(String.join("|", resultList));

    }
    public static boolean validIndex (List<Integer> list, int index){
        return index <= list.size() - 1 && index >= 0;
    }

}
