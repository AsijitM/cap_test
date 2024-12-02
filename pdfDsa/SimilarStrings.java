package pdfDsa;

import java.util.*;


public class SimilarStrings {
	
	    public static int countSimilarPairs(String[] words) {
	        Map<String, Integer> grp = new HashMap<>();
	        
	        for (String w : words) {
	            Set<Character> st = new HashSet<>();
	            for (char c : w.toCharArray()) {
	                st.add(c);
	            }
	            
	            List<Character> sortedList = new ArrayList<>(st);
	            Collections.sort(sortedList);
	            StringBuilder chars = new StringBuilder();
	            for (char c : sortedList) {
	                chars.append(c);
	            }
	            
	            String key = chars.toString();
	            grp.put(key, grp.getOrDefault(key, 0) + 1);
	        }
	        
	        int ans = 0;
	        for (int val : grp.values()) {
	            ans += (val * (val - 1)) / 2;
	        }
	        
	        return ans;
	    }
	    
	    public static void main(String[] args) {
	        String[] words = {"abc", "bca"};
	        System.out.println(countSimilarPairs(words)); // Example usage
	    }
	}



