package tricks;

import java.util.*;

public class CollectionsTips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. List example (ArrayList)
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		// Add at specific index
		list.add(1, "Orange");

		// Get elements
		System.out.println("List: " + list);
		System.out.println("Element at index 2: " + list.get(2));

		// Remove elements
		list.remove("Banana");
		list.remove(1); // Remove by index
		System.out.println("List after removal: " + list);

		// 2. Set example (HashSet)
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");

		// Check if element exists
		System.out.println("Set contains 'Apple': " + set.contains("Apple"));

		// Remove element
		set.remove("Banana");
		System.out.println("Set after removal: " + set);

		// 3. Map example (HashMap)
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);

		// Get value by key
		System.out.println("Value for 'Apple': " + map.get("Apple"));

		// Check if key exists
		System.out.println("Map contains key 'Banana': " + map.containsKey("Banana"));

		// Iterate through keys and values
		System.out.println("Map entries:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// 4. Queue example (LinkedList as Queue)
		Queue<String> queue = new LinkedList<>();
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");

		// Poll element (remove and return)
		System.out.println("Polled element: " + queue.poll());

		// Peek element (view but do not remove)
		System.out.println("Peek element: " + queue.peek());

		// 5. Stack example
		Stack<String> stack = new Stack<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");

		// Pop element (remove and return)
		System.out.println("Popped element: " + stack.pop());

		// Peek element (view but do not remove)
		System.out.println("Peek element: " + stack.peek());

		// 6. Collections utility methods
		List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

		// Sort list
		Collections.sort(numbers);
		System.out.println("Sorted List: " + numbers);

		// Shuffle list
		Collections.shuffle(numbers);
		System.out.println("Shuffled List: " + numbers);

		// Reverse list
		Collections.reverse(numbers);
		System.out.println("Reversed List: " + numbers);

		// Find maximum and minimum
		System.out.println("Max: " + Collections.max(numbers));
		System.out.println("Min: " + Collections.min(numbers));

		// Fill list with specific value
		Collections.fill(numbers, 0);
		System.out.println("List after fill: " + numbers);
	}

}
