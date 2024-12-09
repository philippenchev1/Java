package Practice;

import java.util.Scanner;

public class Practice08CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете от конзолата число r и пресмята и отпечатва лицето и периметъра на кръг
        // / окръжност с радиус r, като форматирате изхода в следния вид: "<calculated area>"
        //"<calculated parameter>". Форматирайте изходните данни до втория знак след десетичната запетая.

        double r = Double.parseDouble(scanner.nextLine());

        double circleArea = Math.PI*(r*r);
        double circlePerim = 2*Math.PI*r;

        System.out.printf("%.2f" + "%n" + "%.2f" , circleArea, circlePerim );
    }
}
