import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumberExceptionDemo {

    // Custom exception class for duplicates
    public static class DuplicateNumberException extends Exception {
        public DuplicateNumberException(String message) {
            super(message);
        }
    }

    // Method to add a number to an array and check for duplicates
    public static void addNumber(int number, Set<Integer> uniqueNumbers) throws DuplicateNumberException {
        if (uniqueNumbers.contains(number)) {  // Check if the number is already present
            throw new DuplicateNumberException("Duplicate number found: " + number);
        } else {
            uniqueNumbers.add(number);  // Add number to set if it's not a duplicate
            System.out.println("Added number: " + number);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> uniqueNumbers = new HashSet<>();  // Set to store unique numbers
        int arraySize;

        System.out.print("Enter the number of elements you want to store: ");
        arraySize = scanner.nextInt();
        
        System.out.println("Enter " + arraySize + " integers:");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            try {
                addNumber(number, uniqueNumbers);
            } catch (DuplicateNumberException e) {
                System.out.println("Exception caught: " + e.getMessage());
                i--;  // Adjust loop counter to re-enter a valid number
            }
        }

        // Display all unique numbers entered
        System.out.println("Unique numbers entered: " + uniqueNumbers);
        
        scanner.close();
    }
}
