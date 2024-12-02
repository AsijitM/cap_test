package tricks;

import java.util.*;

public class ListCheatSheet {
    public static void main(String[] args) {
        
        // 1. Create and Initialize a List (ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Apple");         // Adds an element
        list.add("Banana");
        list.add("Cherry");
        
        // 2. Accessing Elements
        System.out.println("First element: " + list.get(0));  // Access by index
        System.out.println("Size of list: " + list.size());   // Get size of list
        
        // 3. Remove Elements
        list.remove("Banana");     // Removes by value
        list.remove(1);            // Removes by index
        System.out.println("List after removal: " + list);

        // 4. Check if an element exists
        System.out.println("Contains 'Apple': " + list.contains("Apple"));

        // 5. Update elements
        list.set(0, "Orange");     // Set new value at index
        System.out.println("Updated list: " + list);

        // 6. Iterating over the list
        System.out.println("Iterating through list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 7. List to Array Conversion
        String[] array = new String[list.size()];
        list.toArray(array);
        
        // 8. Sorting the List
        Collections.sort(list);    // Sorts the list
        System.out.println("Sorted list: " + list);

        // 9. Reversing the List
        Collections.reverse(list); // Reverses the list
        System.out.println("Reversed list: " + list);

        // 10. Clearing the List
        list.clear();               // Removes all elements
        System.out.println("List after clear: " + list);

        // 11. 2D List (List of Lists)
        List<List<Integer>> twoDList = new ArrayList<>();
        
        // Create inner lists and add them to the 2D List
        List<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> row2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> row3 = new ArrayList<>(Arrays.asList(7, 8, 9));
        
        twoDList.add(row1);
        twoDList.add(row2);
        twoDList.add(row3);

        // Accessing elements from the 2D List
        System.out.println("2D List element at [1][1]: " + twoDList.get(1).get(1)); // 5

        // Iterating over the 2D List
        System.out.println("Iterating over 2D List:");
        for (List<Integer> row : twoDList) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // 12. Add a row to 2D List
        List<Integer> newRow = new ArrayList<>(Arrays.asList(10, 11, 12));
        twoDList.add(newRow);
        System.out.println("2D List after adding new row: " + twoDList);

        // 13. Remove a row from 2D List
        twoDList.remove(0);  // Removes the first row
        System.out.println("2D List after row removal: " + twoDList);
    }
}
