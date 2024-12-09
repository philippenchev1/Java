package Lists_More_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> raceTime = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int finishTime = raceTime.get(raceTime.size()/ 2);
        int finishTimeIndex = (raceTime.size()-1)/ 2;

        double leftRacer = GetLeft(raceTime, finishTimeIndex);
        double rightRacer = GetRight(raceTime, finishTimeIndex);

        if (leftRacer - finishTime > rightRacer - finishTime){
            System.out.printf("The winner is right with total time: %.1f", rightRacer);
        } else {
            System.out.printf("The winner is left with total time: %.1f", leftRacer);
        }



    }

    private static double GetRight(List<Integer> list, int start) {
        double raceTime = 0;
        for (int i = list.size() - 1; i > start; i--) {
            raceTime += list.get(i);
            if (list.get(i) == 0) {
                raceTime = raceTime * 0.8;
            }
        }
        return raceTime;
    }

    private static double GetLeft(List<Integer> start, int end) {
        double raceTime = 0;
        for (int i = 0; i < end; i++) {
            raceTime += start.get(i);
            if (start.get(i) == 0){
                raceTime = raceTime * 0.8;
            }

        }
        return  raceTime;
    }
}
