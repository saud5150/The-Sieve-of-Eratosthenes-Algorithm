/*
 * This program identifies and prints out the 
 * first 1000 prime numbers using the ancient
 *  Sieve of Eratosthenes algorithm.
 */
package primeNumbers;

//Main Class where program is executed
public class Main {
	// CONSTANTS//
	// Determines size of array
	private static final int Number_of_Elements = 1000;

	public static void main(String arguments[]) {
		// Initializing array of numbers
		boolean[] numbers = new boolean[Number_of_Elements];
		// Initializing all array elements to true
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = true;
		}
		System.out.println("\nThe first Prime Numbers " + "(below " 
		+ Number_of_Elements + ") are:\n");
		int counter = 0;
		// Skipping 0th and 1st elements
		for (int i = 2; i != Number_of_Elements; i++) {
			// Checking which numbers are prime numbers

			if (numbers[i] == true) {
				// System.out.println(i);
				counter++;
				System.out.println(i);
				/*
				 * This loop makes 'false' all the further
				 * (number) 'elements' which are multiples
				 * of the 'above identified prime number (in the outer loop)'
				 */

				for (int k = 2 * i; k < numbers.length; k = k + i) {
					numbers[k] = false;
				}
			}
		}

		System.out.println("\nNumber of Prime Numbers" 
		+ " below " + Number_of_Elements + ": " + counter + "\n");
	}
}
