package L05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbersList.add(Integer.valueOf(numberToAdd));
            } else if (command.contains("Insert")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (index >= 0 && index <= numbersList.size() - 1){
                    numbersList.add(index, numberToAdd);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(command.split("\\s+")[1]);
                if (indexToRemove >= 0 && indexToRemove <= numbersList.size() - 1){
                    numbersList.remove(indexToRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= countShiftLeft; time++) {
                    int firstNumber = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNumber);
                }
            } else if (command.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= countShiftRight; time++) {
                    int lastNumber = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, lastNumber);
                }


            }


            command = scanner.nextLine();
        }

        for (int number : numbersList){
            System.out.print(number + " ");
        }

    }
}
