package L03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class PME05_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //5.	Kamino Factory
        //The clone factory in Kamino got another order to clone troops. But this time, you are tasked to find the best DNA sequence to use in the production.
        //You will receive the DNA length, and until you receive the command "Clone them!" you will be receiving DNA sequences of ones and zeroes, split by "!" (one or several).
        //You should select the sequence with the longest subsequence of ones. If there are several sequences with the same length of a subsequence of ones, print the one with the leftmost starting index, if there are several sequences with the same length and starting index, select the sequence with the greater sum of its elements.
        //After you receive the last command "Clone them!", you should print the collected information in the following format:
        //"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
        //"{DNA sequence, joined by space}"
        //Input / Constraints
        //•	The first line holds the length of the sequences – integer in the range [1…100].
        //•	On the next lines, until you receive "Clone them!" you will be receiving sequences (at least one) of ones and zeroes, split by "!" (one or several).


        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int[] tempArray = new int[n];
        int maxSequenceOnesCounter = 0;
        int minIndexPosition = n;
        int maxProbeSum = 0;
        int bestProbeNumber = 1; //whaaaaaaat

        int probeCounter = 0;

        while (!input.equals("Clone them!")) {
            int[] dnaArray = Arrays.stream(input.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int tempSequenceOnesCounter = 0;
            int tempIndexPosition = n;
            int tempProbeSum = 0;

            probeCounter++;

            for (int item : dnaArray) {
                if (item == 1) {
                    tempProbeSum++;
                }
            }

            for (int i = 0; i < dnaArray.length - 1; i++) {
                if (dnaArray[i] == 1) {
                    int sequenceOnesCounter = 1;
                    for (int next = i + 1; next < dnaArray.length; next++) {
                        if (dnaArray[i] == dnaArray[next]) {
                            sequenceOnesCounter++;
                        } else {
                            break;
                        }
                    }

                    if (sequenceOnesCounter > tempSequenceOnesCounter) {
                        tempSequenceOnesCounter = sequenceOnesCounter;
                        tempIndexPosition = i;
                    }
                }
            }

            if (tempSequenceOnesCounter > maxSequenceOnesCounter) {
                maxSequenceOnesCounter = tempSequenceOnesCounter;
                minIndexPosition = tempIndexPosition;
                maxProbeSum = tempProbeSum;
                bestProbeNumber = probeCounter;
                tempArray = Arrays.copyOf(dnaArray, n);
            } else if (tempSequenceOnesCounter == maxSequenceOnesCounter) {
                if (tempIndexPosition < minIndexPosition) {
                    minIndexPosition = tempIndexPosition;
                    maxProbeSum = tempProbeSum;
                    bestProbeNumber = probeCounter;
                    tempArray = Arrays.copyOf(dnaArray, n);
                } else if (tempIndexPosition == minIndexPosition) {
                    if (tempProbeSum > maxProbeSum) {
                        maxProbeSum = tempProbeSum;
                        bestProbeNumber = probeCounter;
                        tempArray = Arrays.copyOf(dnaArray, n);
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestProbeNumber, maxProbeSum);
        System.out.println(Arrays.toString(tempArray)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}


