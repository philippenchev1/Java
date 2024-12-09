package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int elementToAdd = Integer.parseInt(command.split(" ")[1]);
                numList.add(elementToAdd);
            } else if (command.contains("RemoveAt")) {
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                numList.remove(indexToRemove);
            } else if (command.contains("Remove")) {
                int elementToRemove = Integer.parseInt(command.split(" ")[1]);
                numList.remove(Integer.valueOf(elementToRemove));
            } else if (command.contains("Insert")) {
                String[] commandParts = command.split(" ");
                int number = Integer.parseInt(commandParts[1]);
                int index = Integer.parseInt(commandParts[2]);
                numList.add(index, number);
            }
            command = scanner.nextLine();
        }
        for (int number : numList) {
            System.out.print(number + " ");
        }

    }
}
