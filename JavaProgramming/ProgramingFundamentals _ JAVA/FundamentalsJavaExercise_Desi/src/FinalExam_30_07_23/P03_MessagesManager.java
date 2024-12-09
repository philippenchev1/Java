package FinalExam_30_07_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        Map<String, Integer> sentMessagesMap = new LinkedHashMap<>();
        Map<String, Integer> receivedMessagesMap = new LinkedHashMap<>();

        while (!command.equals("Statistics")) {
            if (command.startsWith("Add")) {
                String username = command.split("=")[1];
                int sentMessages = Integer.parseInt(command.split("=")[2]);
                int receivedMessages = Integer.parseInt(command.split("=")[3]);
                sentMessagesMap.putIfAbsent(username, sentMessages);
                receivedMessagesMap.putIfAbsent(username, receivedMessages);
            } else if (command.startsWith("Message")) {
                String sender = command.split("=")[1];
                String receiver = command.split("=")[2];
                if (sentMessagesMap.containsKey(sender) && receivedMessagesMap.containsKey(receiver)) {
                    sentMessagesMap.put(sender, sentMessagesMap.get(sender) + 1);
                    receivedMessagesMap.put(receiver, receivedMessagesMap.get(receiver) + 1);

                    if (sentMessagesMap.get(sender) + receivedMessagesMap.get(sender) >= capacity) {
                        sentMessagesMap.remove(sender);
                        receivedMessagesMap.remove(sender);
                        System.out.printf("%s reached the capacity!%n", sender);
                    }
                    if (receivedMessagesMap.get(receiver) + sentMessagesMap.get(receiver) >= capacity) {
                        receivedMessagesMap.remove(receiver);
                        sentMessagesMap.remove(receiver);
                        System.out.printf("%s reached the capacity!%n", receiver);
                    }
                }
            } else if (command.startsWith("Empty")) {
                String username = command.split("=")[1];
                if (sentMessagesMap.containsKey(username)){
                    sentMessagesMap.remove(username);
                    receivedMessagesMap.remove(username);
                } else if (username.equals("All")) {
                    sentMessagesMap.clear();
                    receivedMessagesMap.clear();
                }
            }
            command = scanner.nextLine();
        }

        System.out.printf("Users count: %d%n", sentMessagesMap.size());
        for (Map.Entry<String,Integer> StingIntegerEntry : receivedMessagesMap.entrySet()) {
            System.out.printf("%s - %d%n",StingIntegerEntry.getKey(),StingIntegerEntry.getValue() +
                    sentMessagesMap.get(StingIntegerEntry.getKey()));
        }
    }
}
