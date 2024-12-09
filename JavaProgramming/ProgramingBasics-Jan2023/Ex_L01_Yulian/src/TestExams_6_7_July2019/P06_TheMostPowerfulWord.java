package TestExams_6_7_July2019;

import java.util.Scanner;

public class P06_TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mostPowerfulWord = "";
        double maxPower = 0;

        String input = scanner.nextLine();

        while (!"End of words".equals(input)){
            double inputSum = 0;
            for (int i = 0; i < input.length() ; i++) {
                inputSum += input.charAt(i);
            }

            int numLength = input.length();
            String firstLetter = input.toLowerCase();
            if (firstLetter.charAt(0) == 'a'
                    || firstLetter.charAt(0) == 'e'
                    || firstLetter.charAt(0) == 'i'
                    || firstLetter.charAt(0) == 'o'
                    || firstLetter.charAt(0) == 'u'
                    || firstLetter.charAt(0) == 'y'){
                inputSum = inputSum * numLength;
            }else {
                inputSum = Math.floor(inputSum/numLength);
            }


            if (inputSum > maxPower){
                maxPower = inputSum;
                mostPowerfulWord = input;
            }
            input = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %.0f",mostPowerfulWord,maxPower);


    }
}
