package Maps_Lambda_StreamAPI;

import java.util.*;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String item : inputArr){
            item = item.toLowerCase();

            wordsMap.putIfAbsent(item,0);
            wordsMap.put(item,wordsMap.get(item) + 1);
        }

        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));

    }
}
