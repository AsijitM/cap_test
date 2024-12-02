package pdf;

import java.util.Map;

public class GroceryReceipt extends GroceryReceiptBase{
	private static final String List = null;

	public GroceryReceipt(Map<String,Double>prices,Map<String,Integer>discounts) {
		super(prices,discounts);
		
		@Override
		public List<Grocery> Calculate(List<Node> shoppingList) {
	        // Use a TreeMap to accumulate the counts of fruits
	        Map<String, Integer> list = new TreeMap<>();
	        
	        // Accumulate the total count for each fruit
	        for (Node s : shoppingList) {
	            String fruit = s.getFruit();
	            int sum = s.getCount();
	            list.put(fruit, list.getOrDefault(fruit, 0) + sum); // Add to existing count if fruit already exists
	        }
	        
	        // List to store final grocery items with price and total
	        List<Grocery> res = new ArrayList<>();
	        
	        // Process each fruit in the shopping list
	        for (Map.Entry<String, Integer> entry : list.entrySet()) {
	            String fruit = entry.getKey();
	            int sum = entry.getValue();
	            
	            // Get the price for the fruit
	            double price = getPrices().get(fruit);
	            double total;
	            
	            // Apply discount if available
	            if (getDiscounts().containsKey(fruit)) {
	                total = sum * price * (1 - (double) getDiscounts().get(fruit) / 100);
	            } else {
	                total = sum * price;
	            }
	            
	            // Add the calculated grocery item to the result list
	            res.add(new Grocery(fruit, price, total));
	        }
	        
	        // Return the final list of grocery items
	        return res;
	    }
		
	}

	
      
}
