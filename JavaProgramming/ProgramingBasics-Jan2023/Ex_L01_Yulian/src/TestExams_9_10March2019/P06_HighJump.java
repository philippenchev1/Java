package TestExams_9_10March2019;

import java.util.Scanner;

public class P06_HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetHeight = Integer.parseInt(scanner.nextLine());
        int startingHigh = targetHeight - 30;

        int failCount = 0;
        int countJumps = 0;

        while (true){
            int currentJump = Integer.parseInt(scanner.nextLine());
            countJumps++;

            if (currentJump > startingHigh){
                if (startingHigh == targetHeight){
                    System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",startingHigh,countJumps);
                    break;
                }

                startingHigh += 5;
                failCount = 0;
            } else if (failCount < 2) {
                failCount++;

            }else{
                System.out.printf("Tihomir failed at %dcm after %d jumps.",startingHigh,countJumps);
                break;
            }

        }


    }
}
