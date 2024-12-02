package tricks;

public class StringTrick {
	public static void main(String[] args) {
		String str="asijit";
		
		// Returns the character at the specified index
		str.charAt(0);

		// Returns the length of the string
		str.length();

		// Returns true if the string is empty
		str.isEmpty();

		// Compares the string to another object for equality
		str.equals("Hello");

		// Compares the string to another string, ignoring case
		str.equalsIgnoreCase("hello");

		// Compares two strings lexicographically
		str.compareTo("Hello");

		// Compares two strings lexicographically, ignoring case
		str.compareToIgnoreCase("hello");

		// Concatenates the given string to the original string
		str.concat(" World");

		// Returns true if the string contains the specified sequence of characters
		str.contains("abc");

		// Checks if the string starts with the specified prefix
		str.startsWith("Hello");

		// Checks if the string ends with the specified suffix
		str.endsWith("world");

		// Returns a substring starting from the specified index
		str.substring(5);

		// Returns a substring between the specified indexes
		str.substring(2, 5);

		// Converts the string to uppercase
		str.toUpperCase();

		// Converts the string to lowercase
		str.toLowerCase();

		// Removes leading and trailing whitespace
		str.trim();

		// Replaces all occurrences of the old character with the new character
		str.replace('a', 'b');

		// Replaces all substrings matching the regular expression with the specified replacement
		str.replaceAll("\\s", "_");

		// Replaces the first occurrence of the substring matching the regular expression
		str.replaceFirst("a", "b");

		// Splits the string into an array of substrings based on the regular expression
		str.split(",");

		// Splits the string into an array of substrings with a limit on the number of splits
		str.split(",", 3);

		// Returns the index of the first occurrence of the specified character
		str.indexOf('a');

		// Returns the index of the first occurrence of the specified substring
		str.indexOf("abc");

		// Returns the index of the last occurrence of the specified character
		str.lastIndexOf('a');

		// Returns the index of the last occurrence of the specified substring
		str.lastIndexOf("abc");

		// Returns true if the string contains the specified sequence of characters
		str.contains("abc");

	}
}
