package tricks;

public class NumToStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer to String
		int intValue = 123;
		String intStr = String.valueOf(intValue);    // Using String.valueOf()
		String intStr2 = Integer.toString(intValue); // Using toString()

		// Double to String
		double doubleValue = 45.67;
		String doubleStr = String.valueOf(doubleValue);  // Using String.valueOf()
		String doubleStr2 = Double.toString(doubleValue); // Using toString()

		// String.format() for formatted output
		String formattedStr = String.format("%.2f", doubleValue); // Format as 2 decimal places
		
		
		// String to Integer
		String intStr1 = "123";
		int intValue1 = Integer.parseInt(intStr1);   // Using parseInt()

		// String to Double
		String doubleStr1 = "45.67";
		double doubleValue1 = Double.parseDouble(doubleStr1); // Using parseDouble()

		// Using valueOf() returns an Integer/Double object
		Integer intValueObj = Integer.valueOf(intStr1);    // Using valueOf()
		Double doubleValueObj = Double.valueOf(doubleStr1); // Using valueOf()


	}

}
