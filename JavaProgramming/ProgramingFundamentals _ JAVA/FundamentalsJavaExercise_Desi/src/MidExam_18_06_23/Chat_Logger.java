package MidExam_18_06_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chat_Logger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<String> chat = new ArrayList<>();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            switch (commandParts[0]) {

                case "Chat":
                    chat.add(commandParts[1]);
                    break;
                case "Delete":
                    if (chat.contains(commandParts[1])) {
                        chat.remove(commandParts[1]);
                    }
                    break;
                case "Edit":
                    if (chat.contains(commandParts[1])) {
                        chat.set(chat.indexOf(commandParts[1]), commandParts[2]);
                    }
                    break;
                case "Pin":
                    if (chat.contains(commandParts[1])) {
                        chat.remove(commandParts[1]);
                        chat.add(commandParts[1]);
                    }
                    break;
                case "Spam":
                    for (int i = 1; i < commandParts.length; i++) {
                        chat.add(commandParts[i]);
                    }
                    break;
            }
            command = scanner.nextLine();

        }
        for (String chats : chat) {
            System.out.println(chats);
        }

    }
}

