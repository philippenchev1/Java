package TestExams_18_19_July2020;

import java.util.Scanner;

public class P02_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Да се отпечата на конзолата сумата, която ще трябва да заплати Мими за багажите, в следния формат:
//•	" The total price of bags is: {цената на багажите} lv. "
//Сумата да бъде форматирана до втората цифра след десетичния знак.

        double priceBagOver20 = Double.parseDouble(scanner.nextLine());
        int bagsWeight = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int countBags = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

//        Мими има закупени самолетни билети, но в последствие решава да си добави багаж към тях.
//Таксите за багаж се изчисляват въз основа на теглото на чекирания багаж:
//•	до 10кг – 20% от цената на багаж над 20кг
//•	между 10кг и 20кг вкл. – 50% от цената на багаж над 20кг.
//•	над 20кг – таксата се чете от конзолата
//В зависимост от броя на дните, които остават до пътуването, цената се оскъпява:
//•	повече от 30 дни - цената на багажа се оскъпява с 10%
//•	между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
//•	по-малко от 7 дни - цената на багажа се оскъпява с 40%
//Напишете програма, която пресмята колко ще трябва да заплати Мими, спрямо горните условия

        if (bagsWeight < 10){
            totalPrice = priceBagOver20 * 0.2;
        } else if (bagsWeight <= 20) {
            totalPrice = priceBagOver20 * 0.5;
        }else {
            totalPrice = priceBagOver20;
        }

        if (days < 7){
            totalPrice = totalPrice * 1.4;
        } else if (days <= 30) {
            totalPrice = totalPrice * 1.15;
        }else {
            totalPrice = totalPrice * 1.1;
        }


        System.out.printf("The total price of bags is: %.2f lv. ",totalPrice*countBags);


    }
}
