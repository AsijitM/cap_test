package pdfDsa;

public class OptimalStringLength {
	 public static int getOptimalStringLength(int countA, int countB, int maxA, int maxB) {
	        if (countA == 0 || maxA == 0) {
	            return Math.min(maxB, countB);
	        }
	        if (countB == 0 || maxB == 0) {
	            return Math.min(maxA, countA);
	        }

	        if ((countB + 1) * maxA < countA) {
	            return countB + (countB + 1) * maxA;
	        }
	        if ((countA + 1) * maxB < countB) {
	            return countA + (countA + 1) * maxB;
	        }

	        return countA + countB;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int countA = 3, countB = 3, maxA = 3, maxB = 3;
	        System.out.println(getOptimalStringLength(countA, countB, maxA, maxB)); // Example output
	    }

}
