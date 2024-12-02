package pdf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
        // Create the prices map
        Map<String, Double> prices = new HashMap<>();
        prices.put("Apple", 1.0);
        prices.put("Banana", 0.5);
        prices.put("Orange", 0.8);
        
        // Create the discounts map
        Map<String, Integer> discounts = new HashMap<>();
        discounts.put("Apple", 10); // 10% off on Apple
        discounts.put("Banana", 20); // 20% off on Banana

        // Create shopping list
        List<Node> shoppingList = Arrays.asList(
            new Node("Apple", 5),
            new Node("Banana", 10),
            new Node("Orange", 3)
        );

        // Create the grocery receipt object
        GroceryReceipt groceryReceipt = new GroceryReceipt(prices, discounts);

        // Calculate and print the result
        List<Grocery> groceries = groceryReceipt.Calculate(shoppingList);
        for (Grocery grocery : groceries) {
            System.out.println(grocery);
        }
    }

}
