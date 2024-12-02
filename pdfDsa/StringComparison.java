package pdfDsa;

import java.util.HashMap;

public class StringComparison {
	public int stringComparsion(String s1, String s2) {
        // Define the priority order
        String[] priorityOrder = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ng", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        HashMap<String, Integer> priorityMap = new HashMap<>();
        
        // Populate the priority map
        for (int i = 0; i < priorityOrder.length; i++) {
            priorityMap.put(priorityOrder[i], i);
        }
        
        // Compare the strings
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            String char1 = String.valueOf(s1.charAt(i));
            String char2 = String.valueOf(s2.charAt(j));
            
            // Handle the special case for "ng"
            if (i < s1.length() - 1 && s1.substring(i, i + 2).equals("ng")) {
                char1 = "ng";
                i++;
            }
            if (j < s2.length() - 1 && s2.substring(j, j + 2).equals("ng")) {
                char2 = "ng";
                j++;
            }
            
            if (!char1.equals(char2)) {
                return priorityMap.get(char1) - priorityMap.get(char2) > 0 ? 1 : -1;
            }
            
            i++;
            j++;
        }
        
        // If one string is a prefix of the other
        if (i < s1.length()) return 1;
        if (j < s2.length()) return -1;
        
        return 0;
    }


}
