package TestExams_6_7_April2019;

import java.util.Scanner;

public class P05_MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMovies = Integer.parseInt(scanner.nextLine());

        double sumRatings = 0;
        double minRating = Double.MAX_VALUE;
        double maxRating = Double.MIN_VALUE;
        String minRatingMovie = "";
        String maxRatingMovie = "";

        for (int i = 1; i <= countMovies ; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sumRatings += rating;

            if (rating > maxRating){
                maxRating = rating;
                maxRatingMovie = movieName;
            } else if (rating < minRating){
                minRating = rating;
                minRatingMovie = movieName;;
            }



        }


            double averageRating = sumRatings / countMovies;
            System.out.printf("%s is with highest rating: %.1f%n",maxRatingMovie,maxRating);
            System.out.printf("%s is with lowest rating: %.1f%n",minRatingMovie,minRating);
            System.out.printf("Average rating: %.1f",averageRating);




    }
}
