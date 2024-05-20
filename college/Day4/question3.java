 import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the starting index (0-based): ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the length of the substring: ");
        int substringLength = scanner.nextInt();

        if (startIndex < 0 || startIndex >= inputString.length() || substringLength <= 0) {
            System.out.println("Invalid input. Please provide valid indices and length.");
            return;
        }

        int endIndex = startIndex + substringLength;
        if (endIndex > inputString.length()) {
            endIndex = inputString.length();
        }

        String extractedSubstring = inputString.substring(startIndex, endIndex);

        System.out.println("Extracted substring: " + extractedSubstring);
    }
}

