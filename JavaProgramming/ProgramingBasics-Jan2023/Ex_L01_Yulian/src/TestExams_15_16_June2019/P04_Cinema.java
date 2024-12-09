package TestExams_15_16_June2019;

import java.util.Scanner;

public class P04_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int sum = 0;
        int currentPeople = 0;


        while (!command.equals("Movie time!")){
            int countPeople = Integer.parseInt(command);
            currentPeople += countPeople;

            if (currentPeople > capacity){
                break;

            }

            if (countPeople % 3 == 0){
                sum += (countPeople * 5)-5;
            }else {
                sum += countPeople * 5;
            }

                command = scanner.nextLine();
        }

        if (currentPeople > capacity){
            System.out.printf("The cinema is full.%n");
        }else {
            System.out.printf("There are %d seats left in the cinema.%n",capacity - currentPeople);
        }

        System.out.printf("Cinema income - %d lv.",sum);






    }
        }
