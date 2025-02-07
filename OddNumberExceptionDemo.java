public class OddNumberExceptionDemo {

    // Custom exception class
    public static class OddNumberException extends Exception {
        public OddNumberException(String message) {
            super(message);
        }
    }

    // Method to check if a number is odd
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {  // Check if the number is odd
            throw new OddNumberException("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        int number = 5;  // Change this to test different numbers

        try {
            checkEvenNumber(number);
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
