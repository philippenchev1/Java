package L02ConditionalStatments;

import java.util.Scanner;

public class PP02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());

        /*•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
          •	Когато почива, стопанинът му си играе с него  по 127 минути на ден.
*/

        /*Пример: 20 почивни дни -> работните дни са 345 (365 – 20 = 345).
        Реалното време за игра е 24 275 минути (345 * 63 + 20 *127).
        Разликата от нормата е 5 725 минути (30 000 – 24 275 = 5 725) или 95 часа и 25 минути.*/

        int workingDays = 365 - freeDays;
        int playGameTime = workingDays * 63 + freeDays * 127;

        int hourToPlay = Math.abs(playGameTime-30000)/60;
        int minutesToPlay = Math.abs(playGameTime-30000)%60;

        if (playGameTime >= 30000){

            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hourToPlay,minutesToPlay);
        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hourToPlay,minutesToPlay);
        }


    }
}
