package TestExams_15_16_June2019;

import java.util.Scanner;

public class P01_SeriesCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        String nameOfMovie = scanner.nextLine();
        int numberSeasons = Integer.parseInt(scanner.nextLine());
        int numberEpisodes = Integer.parseInt(scanner.nextLine());
        double timeForEpisode = Double.parseDouble(scanner.nextLine());

        double episodesWithAdverbs = timeForEpisode * 1.2;
        double totalMinutes = episodesWithAdverbs * numberEpisodes * numberSeasons + (numberSeasons * 10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",nameOfMovie,totalMinutes);



    }
}
