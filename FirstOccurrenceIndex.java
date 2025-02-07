import java.util.Scanner;

public class FirstOccurrenceIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input character
        System.out.print("Enter a character to find: ");
        char searchChar = scanner.next().charAt(0);

        // Find the index of the first occurrence
        int index = inputString.indexOf(searchChar);

        // Output the result
        if (index != -1) {
            System.out.println("The first occurrence of '" + searchChar + "' is at index: " + index);
        } else {
            System.out.println("The character '" + searchChar + "' is not found in the string.");
        }

        scanner.close();
    }
}
 