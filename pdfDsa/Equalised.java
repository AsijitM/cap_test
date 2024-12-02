package pdfDsa;
import java.util.*;
public class Equalised {


	    //code
	    public static boolean canBeEqualized(String first, String second) {
	        if (first.length() != second.length()) {
	            return false;
	        }

	        int x = -1, y = -1;
	        boolean[] identical = new boolean[26]; // To track identical characters
	        int offset = 'a';

	        if (first.equals(second)) {
	            return true;
	        }

	        for (int i = 0; i < first.length(); i++) {
	            if (first.charAt(i) == second.charAt(i)) {
	                identical[first.charAt(i) - offset] = true;
	            } else {
	                if (x == -1) {
	                    x = first.charAt(i) - offset;
	                    y = second.charAt(i) - offset;
	                } else if (x != first.charAt(i) - offset || y != second.charAt(i) - offset) {
	                    return false;
	                }
	            }
	        }

	        return !(identical[x] && identical[y]);
	    }

	    public static List<String> canBeEqualized(List<String> firstStrings, List<String> secondStrings) {
	        List<String> results = new ArrayList<>();

	        for (int i = 0; i < firstStrings.size(); i++) {
	            if (canBeEqualized(firstStrings.get(i), secondStrings.get(i))) {
	                results.add("YES");
	            } else {
	                results.add("NO");
	            }
	        }

	        return results;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        List<String> firstStrings = Arrays.asList("ac", "pqqrr");
	        List<String> secondStrings = Arrays.asList("ca", "prrrr");

	        List<String> results = canBeEqualized(firstStrings, secondStrings);

	        for (String result : results) {
	            System.out.println(result);
	        }
	    }
}

	



