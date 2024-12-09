package FinalExam_30_07_23;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String spell = scanner.nextLine();
        StringBuilder spellDeciphered = new StringBuilder(spell);
        String command = scanner.nextLine();
        while (!command.equals("Abracadabra")){
            String [] commandArr = command.split(" ");
            String input = commandArr[0];

            switch (input){
                case "Illusion":
                    int index = Integer.parseInt(commandArr[1]);
                    String  letter = commandArr[2];

                    if (index >= 0 && index <= spellDeciphered.length() - 1){
                        spellDeciphered.setCharAt(index,letter.charAt(0));

                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }

                    break;
                case "Abjuration":
                    String upperCase = spellDeciphered.toString().toUpperCase();
                    spellDeciphered = new StringBuilder(upperCase);
                    System.out.println(spellDeciphered);
                    break;
                case "Necromancy":
                    String lowerCase = spellDeciphered.toString().toLowerCase();
                    spellDeciphered  =new StringBuilder(lowerCase);
                    System.out.println(spellDeciphered);
                    break;
                case "Divination":
                    String first = commandArr[1];
                    String second = commandArr[2];

                    if (spellDeciphered.toString().contains(first)) {
                        String replaceString = spellDeciphered.toString().replaceAll(first, second);
                        spellDeciphered = new StringBuilder(replaceString);
                        System.out.println(spellDeciphered);
                    }
                    break;
                case "Alteration":
                    String substring = commandArr[1];
                    if (spellDeciphered.toString().contains(substring)){
                        String remove = spellDeciphered.toString().replace(substring,"");
                        spellDeciphered = new StringBuilder(remove);
                        System.out.println(spellDeciphered);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
            }

            command = scanner.nextLine();
        }


    }
}
