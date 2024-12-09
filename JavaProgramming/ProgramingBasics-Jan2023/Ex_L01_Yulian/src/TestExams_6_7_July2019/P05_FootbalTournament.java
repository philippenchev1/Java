package TestExams_6_7_July2019;

import java.util.Scanner;

public class P05_FootbalTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numPlayedGamePerSeason = Integer.parseInt(scanner.nextLine());

        int countW = 0;
        int countD = 0;
        int countL = 0;
        int totalPoints = 0;


        for (int i = 1; i <= numPlayedGamePerSeason ; i++) {
            String result = scanner.nextLine();

            switch (result){
                case "W":
                    countW++;
                    totalPoints += 3;
                    break;
                case "D":
                    countD++;
                    totalPoints += 1;
                    break;
                case "L":
                    countL++;
                    break;
            }

        }

//        o	"{името на отбора} has won {брой спечелени точки} points during this season"
//o	"Total stats:"
//o	"## W: {брой спечелени игри}"
//o	"## D: {брой игри, завършили наравно}"
//o	"## L: {брой загубени игри}"
//o	"Win rate: {процент спечелени игри}%"

        if (numPlayedGamePerSeason < 1){
            System.out.printf("%s hasn't played any games during this season.",name);
        }else {
            System.out.printf("%s has won %d points during this season.%n",name,totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n",countW);
            System.out.printf("## D: %d%n",countD);
            System.out.printf("## L: %d%n",countL);
            System.out.printf("Win rate: %.2f%%",countW * 1.0 / numPlayedGamePerSeason * 100);

        }


    }
}
