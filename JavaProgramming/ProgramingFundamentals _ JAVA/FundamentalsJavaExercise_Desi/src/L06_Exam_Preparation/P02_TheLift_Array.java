package L06_Exam_Preparation;

import java.util.Arrays;
import java.util.Scanner;

public class P02_TheLift_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWait = Integer.parseInt(scanner.nextLine());
        int []wagons = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        for (int wagon = 0; wagon <= wagons.length - 1; wagon++) {
            if (peopleWait > 0) {
                int currentCountPeople = wagons[wagon]; //текущ брой на хората
                while (currentCountPeople < 4) {
                    //добавям човек във вагона ако има чакащи
                    if (peopleWait <= 0) {
                        break;
                    }
                    currentCountPeople++;
                    wagons[wagon] = currentCountPeople;
                    peopleWait--;
                }
            }
        }

        if (peopleWait <= 0 && wagons[wagons.length - 1] < 4) {
            //имаме останало място
            System.out.println("The lift has empty spots!");
        } else if (peopleWait > 0 && wagons[wagons.length - 1] >= 4) {
            //нямаме повече място
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWait);
        }



        //отпечатваме вагоните
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}
