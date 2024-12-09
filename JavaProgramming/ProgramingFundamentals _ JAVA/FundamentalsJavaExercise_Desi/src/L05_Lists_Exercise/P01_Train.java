package L05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandData = command.split(" ");
            if (commandData[0].equals("Add")){
                int passengers = Integer.parseInt(commandData[1]);
                listOfWagons.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(commandData[0]);
                for (int index = 0; index < listOfWagons.size(); index++) {
                    int currentWagon = listOfWagons.get(index);
                    if (currentWagon + passengersToAdd <= maxCapacity){
                        listOfWagons.set(index,currentWagon + passengersToAdd);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int wagon : listOfWagons){
            System.out.print(wagon + " ");
        }
    }
}
