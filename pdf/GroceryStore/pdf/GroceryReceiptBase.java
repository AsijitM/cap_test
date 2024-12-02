package pdf;

import java.util.List;
import java.util.Map;

public class GroceryReceiptBase {

	private Map<String, Double> prices;
	private Map<String, Integer> discounts;

	public GroceryReceiptBase(Map<String, Double> prices, Map<String, Integer> discounts) {
		// TODO Auto-generated constructor stub
		this.prices=prices;
		this.discounts=discounts;
	}
	public List<Grocery> Calculate(List<Node>shoppingList){
		return null;
		
	}
	public Map<String, Double> getPrices() {
        return prices;
    }

    public Map<String, Integer> getDiscounts() {
        return discounts;
    }

}
