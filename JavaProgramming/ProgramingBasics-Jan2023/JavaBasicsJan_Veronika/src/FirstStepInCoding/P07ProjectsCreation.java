package FirstStepInCoding;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numOfProjeckts  = Integer.parseInt(scanner.nextLine());

        int hoursToCompleate = numOfProjeckts * 3;

        System.out.println("The architect " + name + " will need " + hoursToCompleate + " hours to complete " + numOfProjeckts + "project/s.");

    }
    }

