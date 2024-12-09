package L05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Delete")){
                int elementToDelete = Integer.parseInt(command.split(" ")[1]);
                numbersList.removeAll(Arrays.asList(elementToDelete));
            } else if (command.contains("Insert")) {
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                int indexToAdd = Integer.parseInt(command.split(" ")[2]);
                numbersList.add(indexToAdd,numberToAdd);
            }

            command = scanner.nextLine();
        }

        for (int number : numbersList){
            System.out.print(number + " ");
        }
    }
}
