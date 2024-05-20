 import java.util.*;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = question4(input);

        System.out.println("String after removing repeated words: " + result);
    }

    public static String question4(String input) {
        String[] words = input.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        StringBuilder resultBuilder = new StringBuilder();

        for (String word : words) {
            if (!uniqueWords.contains(word.toLowerCase())) {
                resultBuilder.append(word).append(" ");
                uniqueWords.add(word.toLowerCase());
            }
        }

        return resultBuilder.toString().trim();
    }
}
