package L04_ForCycle;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        От конзолата първо се четат два реда:
//•	Брой турнири, в които е участвал – цяло число в интервала [1…20]
//•	Начален брой точки в ранглистата - цяло число в интервала [1...4000]
//За всеки турнир се прочита отделен ред:
//•	Достигнат етап от турнира – текст – "W", "F" или "SF"
//Изход
//Отпечатват се три реда в следния формат:
//•	"Final points: {брой точки след изиграните турнири}"
//•	"Average points: {средно колко точки печели за турнир}"
//•	"{процент спечелени турнири}%"

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());


        int tournamentPoints = 0;

        int countWinn = 0;


        for (int i = 1; i <= countTournaments ; i++) {
            String ranking = scanner.nextLine();

            if (ranking.equals("W")){
                tournamentPoints += 2000;
                countWinn++;

            } else if (ranking.equals("F")) {
                tournamentPoints += 1200;


            } else if (ranking.equals("SF")) {
                tournamentPoints += 720;

            }


        }
        int finalPoints = startingPoints + tournamentPoints;
        int averagePoints = tournamentPoints/countTournaments;
        double percentWinns = countWinn*1.0 / countTournaments * 100;

        System.out.printf("Final points: %d%n",finalPoints);
        System.out.printf("Average points: %d%n",averagePoints);
        System.out.printf("%.2f%%",percentWinns);

    }
}
