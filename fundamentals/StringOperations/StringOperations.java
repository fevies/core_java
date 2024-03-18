public class StringOperations {
	public static void main(String[] args) {
		/**
		 * The following methods changes a string to upper case and lower case.
		 */

		String word = "Changes the FOLLOWING to UPPER CASE and lower case";
		System.out.println("sentence uppercase = " + word.toUpperCase());
		System.out.println(" sentence to lowercase =" + word.toLowerCase());
		/**
		 * concatenating two strings
		 */
		String hello = "Programming is becoming difficult ";
		String world = " But we peservere";
		System.out.println(hello + world);
		/**
		 * method to find the position of the first character occurence of a string
		 */
		System.out.println( hello.indexOf('g'));



	}
}
