package L04_ForCycle;

import java.util.Scanner;

public class P07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfGroups = Integer.parseInt(scanner.nextLine());

        int hikeMusala = 0;
        int hikeMontblan = 0;
        int hikeKilimangaro = 0;
        int hikeK2 = 0;
        int hikeEverest = 0;

        int allPeople = 0;

        for (int i = 1; i <= countOfGroups; i++) {
            int countOfPeopleInGroup = Integer.parseInt(scanner.nextLine());

            if (countOfPeopleInGroup<=5){
                hikeMusala += countOfPeopleInGroup;
                allPeople += countOfPeopleInGroup;

            } else if (countOfPeopleInGroup<=12) {
                hikeMontblan+= countOfPeopleInGroup;
                allPeople += countOfPeopleInGroup;

            } else if (countOfPeopleInGroup<=25) {
                hikeKilimangaro+= countOfPeopleInGroup;
                allPeople += countOfPeopleInGroup;

            }else if (countOfPeopleInGroup <=40){
                hikeK2+=countOfPeopleInGroup;
                allPeople += countOfPeopleInGroup;

            }else {
                hikeEverest+=countOfPeopleInGroup;
                allPeople += countOfPeopleInGroup;

            }
        }
        int sumOfGroups = hikeMusala+hikeMontblan+hikeKilimangaro+hikeK2+hikeEverest;
        double percentOfMusala = hikeMusala*1.0 / sumOfGroups * 100;
        double percentOfMontblan = hikeMontblan*1.0 / sumOfGroups * 100;
        double percentOfKilimangaro = hikeKilimangaro*1.0/ sumOfGroups * 100;
        double percentOfK2 = hikeK2*1.0 / sumOfGroups * 100;
        double percentOfEverest = hikeEverest * 1.0 / sumOfGroups * 100;

        System.out.printf("%.2f%%%n",percentOfMusala);
        System.out.printf("%.2f%%%n",percentOfMontblan);
        System.out.printf("%.2f%%%n",percentOfKilimangaro);
        System.out.printf("%.2f%%%n",percentOfK2);
        System.out.printf("%.2f%%%n",percentOfEverest);







    }
}
