package pdf;

public class Grocery {
	 private String name;
	    private double price;
	    private double totalPrice;

	    public Grocery(String name, double price, double totalPrice) {
	        this.name = name;
	        this.price = price;
	        this.totalPrice = totalPrice;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public double getTotalPrice() {
	        return totalPrice;
	    }

	    @Override
	    public String toString() {
	        return name + " -> Price: " + price + ", Total: " + totalPrice;
	    }

}
