package Practice;

import java.util.Scanner;

public class Practice06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Георги ще има гости вечерта и решава да ги нагости с паламуд, сафрид и миди.
        // Затова отива на рибната борса, за да си купи по няколко килограма.
        // Oт конзолата се въвеждат цените в лева на скумрията и цацата.
        // Също количеството на паламуд, сафрид и миди в килограми.
        // Колко пари ще са му необходими, за да плати сметката си, ако цените на борсата са:

        //•	Паламуд – 60% по-скъп от скумрията
        //•	Сафрид – 80% по-скъп от цацата
        //•	Миди – 7.50 лв. за килограм
        //Вход
        //От конзолата се четат 5 числа:
        //•	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
        //•	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
        //•	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
        //•	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
        //•	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]
        //Изход
        //Да се отпечата на конзолата едно число с плаваща запетая: колко пари ще са нужни на Георги, за да си плати сметката.
        // Числото трябва да е форматирано до вторият знак след десетичната запетая (1.2457 -> 1.25).


           double skumriaPrice = Double.parseDouble(scanner.nextLine());
           double cacaPrice = Double.parseDouble(scanner.nextLine());
           double palamudKilos = Double.parseDouble(scanner.nextLine());
           double safridKilos = Double.parseDouble(scanner.nextLine());
           int midi = Integer.parseInt(scanner.nextLine());

           double palamudPrice = palamudKilos *(skumriaPrice + skumriaPrice * 0.6) ;
           double safridPrice = safridKilos * (cacaPrice + cacaPrice * 0.8);
           double midiPrice = midi * 7.5;

           double totalPrice = palamudPrice + safridPrice + midiPrice;

        System.out.printf("%.2f", totalPrice);

            }
    }


