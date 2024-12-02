package pdfDsa;
import java.util.*;
public class ClientServerArchitecture { 
	public static int findMaxInteractionTime(List<int[]> intervals) {
	    List<int[]> events = new ArrayList<>();
	    
	    // Create start and end events
	    for (int[] interval : intervals) {
	        events.add(new int[] { interval[0], 1 }); // Start of an event (+1 interaction)
	        events.add(new int[] { interval[1], -1 }); // End of an event (-1 interaction)
	    }
	 
	    // Sort events: first by time, then by type (end event before start event if times are the same)
	    Collections.sort(events, (a, b) -> {
	        if (a[0] != b[0]) {
	            return a[0] - b[0]; // Sort by time
	        }
	        return a[1] - b[1]; // Sort by event type (-1 before +1)
	    });
	 
	    int maxInteractions = 0;
	    int maxTime = -1;
	    int currInteractions = 0;
	 
	    // Process events to find the maximum number of interactions
	    for (int[] event : events) {
	        currInteractions += event[1];
	        if (currInteractions > maxInteractions) {
	            maxInteractions = currInteractions;
	            maxTime = event[0];
	        }
	    }
	 
	    return maxTime;
	}
	 
	 
	public static void main(String[] args) {
	    List<int[]> intervals = Arrays.asList(
	        new int[] {1, 5},
	        new int[] {2, 6},
	        new int[] {4, 8},
	        new int[] {7, 9}
	    );
	 
	    System.out.println(findMaxInteractionTime(intervals)); // Output: 4
	}

}
