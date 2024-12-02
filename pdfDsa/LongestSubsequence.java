package pdfDsa;

import java.util.Arrays;

public class LongestSubsequence {
	 public static int findLongestSubsequence(int[] arr) {
	        // Sort the array
	        Arrays.sort(arr);

	        // Initialize variables
	        int firstOdd = -1, firstEven = -1;
	        int lastOdd = -1, lastEven = -1;

	        // Traverse the array
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) { // Even number
	                lastEven = i;
	                if (firstEven == -1) {
	                    firstEven = i;
	                }
	            } else { // Odd number
	                lastOdd = i;
	                if (firstOdd == -1) {
	                    firstOdd = i;
	                }
	            }
	        }

	        // Calculate the longest subsequence
	        int ans = 1;
	        if (firstOdd != -1) {
	            ans = Math.max(ans, lastOdd - firstOdd + 1);
	        }
	        if (firstEven != -1) {
	            ans = Math.max(ans, lastEven - firstEven + 1);
	        }

	        return ans;
	    }

	    public static void main(String[] args) {
	        int[] arr = {7, 5, 6, 2, 3, 2, 4};
	        System.out.println("Longest Subsequence Length: " + findLongestSubsequence(arr));
	    }

}
