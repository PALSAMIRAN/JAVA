 import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] charCount = countDuplicateCharacters(input);

        System.out.println("Duplicate characters and their counts:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                char ch = (char) i;
                System.out.println(ch + ": " + charCount[i]);
            }
        }
    }

    public static int[] countDuplicateCharacters(String input) {
        int[] charCount = new int[256];  

        for (char ch : input.toCharArray()) {
            charCount[ch]++;
        }

        return charCount;
    }
}
