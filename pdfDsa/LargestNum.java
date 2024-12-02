package pdfDsa;

public class LargestNum {
	public static String getLargestNumber(String num) {
        int n = num.length();
        char[] numArray = num.toCharArray(); // Convert string to char array for easy manipulation
        int idx = 0;

        // Iterate over the digits of the number
        for (int i = 0; i < n; i++) {
            int lastParity = (numArray[i] - '0') % 2; // Calculate the parity of the current digit
            int[] freq = new int[10]; // Array to store frequency of digits

            // While within bounds and digits have the same parity as the current digit
            while (i < n && (numArray[i] - '0') % 2 == lastParity) {
                freq[numArray[i] - '0']++; // Increment frequency of the digit
                i++;
            }
            i--; // Decrement i since the outer loop will increment it again

            // Fill the largest number by appending digits in descending order
            for (int j = 9; j >= 0; j--) {
                while (freq[j] > 0) {
                    numArray[idx++] = (char) (j + '0'); // Place the digit
                    freq[j]--;
                }
            }
        }
        return new String(numArray); // Convert char array back to string
    }

    public static void main(String[] args) {
        String num = "0082663"; // Example input
        System.out.println(getLargestNumber(num)); // Output the result
    }

}
