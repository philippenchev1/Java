package L03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //You are given an array with integers. Write a program to modify the elements after receiving the following commands:
        //•	"swap {index1} {index2}" takes two elements and swap their places.
        //•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
        //•	"decrease" decreases all elements in the array with 1.

        //Input
        //On the first input line, you will be given the initial array values separated by a single space.
        //On the next lines, you will receive commands until you receive the command "end". The commands are as follows:
        //•	"swap {index1} {index2}"
        //•	"multiply {index1} {index2}"
        //•	"decrease"

        //Output
        //The output should be printed on the console and consist of elements of the modified array
        // – separated by a comma and a single space ", ".

        //Constraints
        //•	Elements of the array will be integer numbers in the range [-231...231].
        //•	The count of the array elements will be in the range [2...100].
        //•	Indexes will always be in the range of the array.

        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String [] commandParts = command.split(" ");
            String commandType = commandParts[0];

            switch (commandType){
                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int element1 = numbers[index1];
                    int index2 = Integer.parseInt(commandParts[2]);
                    int element2 = numbers[index2];

                    numbers[index1] = element2;
                    numbers[index2] = element1;
                    break;

                case "multiply":
                    int multiplyElementIndex1 = Integer.parseInt(commandParts[1]);
                    int multiplyElement1 = numbers[multiplyElementIndex1];
                    int multiplyElementIndex2 = Integer.parseInt(commandParts[2]);
                    int multiplyElement2 = numbers[multiplyElementIndex2];

                    int product = multiplyElement1 * multiplyElement2;
                    numbers[multiplyElementIndex1] = product;
                    break;

                case "decrease":
                    for (int index = 0; index < numbers.length ; index++) {
                        numbers[index] = numbers[index] - 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbers).replace("[", "").replace("]", ""));

    }
}



