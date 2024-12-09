package MidExamPractice_29_02_20;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")){
           String[] commandArr = command.split("\\s+");

           switch (commandArr[0]) {
               case "Urgent":
                   if (!ifExist(shoppingList, commandArr[1])){
                       shoppingList.add(0,commandArr[1]);
                   }
                   break;
               case "Unnecessary":
                   if (ifExist(shoppingList,commandArr[1])){
                       shoppingList.remove(commandArr[1]);
                   }
                   break;
               case "Correct":
                   if (ifExist(shoppingList,commandArr[1])){
                       int index = shoppingList.lastIndexOf(commandArr[1]);
                       shoppingList.set(index, commandArr[2]);
                   }
                   break;
               case "Rearrange":
                   if (ifExist(shoppingList,commandArr[1])){
                       shoppingList.remove(commandArr[1]);
                       shoppingList.add(commandArr[1]);
                   }
                   break;
           }

            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", shoppingList));

    }

    private static boolean ifExist(List<String> list, String item){
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).equals(item)){
                return true;
            }
        }
        return false;
    }
}
