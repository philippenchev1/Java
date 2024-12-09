package Exams_18_19_February2023;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        boolean isValid2 = false;

//        •	a се мени от 1 до 9
//        •	b се мени от 9 до а
//        •	c се мени от 0 до 9
//        •	d се мени от 9 до c

        for (int a = 1; a <= 9 ; a++) {
            for (int b = 9; b >= a ; b--) {
                for (int c = 0; c <= 9 ; c++) {
                    for (int d = 9; d >= c ; d--) {

//Ако сумата (a + b + c + d) е равна на произведението (a * b * c * d)
// и едновременно с това n завършва на 5, трябва да се принтира числото abcd.
//Ако разделим произведението (a * b * c * d) на сумата (a + b + c + d) и получим 3 (целочислено), и едновременно с това n се дели на 3 без остатък,
// трябва да се принтира числото dcba.
//Програмата трябва да принтира на конзолата само първата валидна комбинация.
//Ако не се намери такова число abcd или dcba, трябва да се принтира "Nothing found".

                        int sum = a+b+c+d;
                        int produuct = a*b*c*d;

                        if (sum == produuct && n % 10 == 5){
                            isValid = true;
                            System.out.println(a * 1000 + b * 100 + c * 10 + d);
                            return;
                        } else if (produuct / sum == 3 && n % 3 == 0) {
                            isValid2 = true;
                            System.out.println(d * 1000 + c * 100 + b * 10 + a);
                            return;
                        }

                    }

                }

            }

        }

        System.out.println("Nothing found");

    }
}
