package pdfDsa;
import java.util.*;
public class HackerLandChessTournament {
	public static int getPotentialOfWinner(List<Integer> potential, int k) {
	    int n = potential.size(); // Get the size of the potential list
	    int[] potentials = new int[n];
 
	    // Convert List to array for easier processing
	    for (int i = 0; i < n; i++) {
	        potentials[i] = potential.get(i);
	    }
 
	    int consecutiveWins = 0;
	    int currentPotential = potentials[0]; // Initialize the current potential
 
	    // Iterate through the array
	    for (int i = 1; i < potentials.length; i++) {
	        if (potentials[i] < currentPotential) {
	            consecutiveWins++;
	            if (consecutiveWins >= k) {
	                return currentPotential; // Winner found
	            }
	        } else {
	            // Reset the current potential and wins if the streak breaks
	            currentPotential = potentials[i];
	            consecutiveWins = 1; // Count the current match as a win
	        }
	    }
 
	    return currentPotential; // Return the player with the highest potential
	}
 
}
 
 
public static void main(String[] args) {
    List<Integer> potential = Arrays.asList(3, 5, 2, 6, 8, 2, 9);
    int k = 2;
    System.out.println(getPotentialOfWinner(potential, k)); // Output depends on the list and k
}

}
