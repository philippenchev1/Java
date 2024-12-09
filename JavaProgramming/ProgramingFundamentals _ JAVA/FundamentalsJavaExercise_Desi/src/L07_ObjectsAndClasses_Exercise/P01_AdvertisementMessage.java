package L07_ObjectsAndClasses_Exercise;

import java.util.Random;
import java.util.Scanner;

public class P01_AdvertisementMessage {
    static class Message {
        private Random random = new Random();

        private String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category", "Exceptional product.",
                "I can’t live without this product."};
        private String[] events = {"Now I feel good.","I have succeeded with this product.",
                "Makes miracles. I am happy of the results!","I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        private String[] author = {"Diana","Petya","Stella","Elena","Katya","Iva","Annie","Eva"};

        private String[] town = {"Burgas","Sofia","Plovdiv","Varna","Ruse"};

        public String randomMessage(){
            return String.format("%s %s %s - %s",
                    phrases[random.nextInt(phrases.length)],
                    events[random.nextInt(phrases.length)],
                    author[random.nextInt(phrases.length)],
                    town[random.nextInt(phrases.length)]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Message message = new Message();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String output = message.randomMessage();
            System.out.println(output);
        }

    }
}
