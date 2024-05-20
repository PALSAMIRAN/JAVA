 import java.util.*;

public class question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        List<String> repeatedWords = findRepeatedWords(input);

        if (repeatedWords.isEmpty()) {
            System.out.println("No repeated words found.");
        } else {
            System.out.println("Repeated words:");
            for (String word : repeatedWords) {
                System.out.println(word);
            }
        }
    }

    public static List<String> findRepeatedWords(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        List<String> repeatedWords = new ArrayList<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedWords.add(entry.getKey());
            }
        }

        return repeatedWords;
    }
}

