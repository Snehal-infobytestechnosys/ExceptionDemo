public class ExceptionDemo {

    public static void main(String[] args) {
        // Unchecked Exception: ArithmeticException
        try {
            int result = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        // Unchecked Exception: NullPointerException
        try {
            String str = null;
            int length = str.length(); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        // Checked Exception: FileNotFoundException
        try {
            java.io.FileReader file = new java.io.FileReader("nonexistent_file.txt"); // This will cause FileNotFoundException
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Custom Exception: InvalidAgeException
        try {
            validateAge(15);  // This will cause InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        // Finally block to ensure cleanup happens
        finally {
            System.out.println("This is the finally block, it runs no matter what.");
        }
    }

    // Custom exception class (Checked Exception)
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method to check age, throws custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        System.out.println("Access granted.");
    }
}
