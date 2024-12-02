package tricks;

public class ExceptionHandleExample {
    public static void main(String[] args) {
        // 1. Basic try-catch block
        try {
            int result = 10 / 0;  // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. Multiple catch blocks
        try {
            String str = null;
            int length = str.length();  // This will throw NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Error: " + e.getMessage());
        }

        // 3. Try-catch-finally block
        try {
            int[] numbers = new int[2];
            numbers[5] = 10;  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }

        // 4. Throwing exceptions explicitly
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // 5. Custom Exception Handling
        try {
            throw new CustomException("Custom error occurred!");
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        // 6. Using `throw` to throw exceptions
        try {
            validateNumber(10);
        } catch (Exception e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }

    // Method for throwing custom exception
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }

    // Custom Exception class
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    // Example of method that throws an exception
    static void validateNumber(int num) throws Exception {
        if (num < 20) {
            throw new Exception("Number is less than 20.");
        }
        System.out.println("Number is valid.");
    }
}
