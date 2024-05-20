 import java.util.*;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the number of substrings: ");
        int numSubstrings = scanner.nextInt();

        List<String> substrings = splitString(input, numSubstrings);

        System.out.println("Substrings:");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }

    public static List<String> splitString(String input, int numSubstrings) {
        List<String> substrings = new ArrayList<>();
        int length = input.length();
        int chunkSize = (int) Math.ceil((double) length / numSubstrings);

        for (int i = 0; i < length; i += chunkSize) {
            int endIndex = Math.min(i + chunkSize, length);
            substrings.add(input.substring(i, endIndex));
        }

        return substrings;
    }
}

