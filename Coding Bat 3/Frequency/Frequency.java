import java.util.Arrays;
import java.util.Scanner;

public class Frequency
{
	public static void main(String[] args)
	{
		// 	Do not edit this method
		Scanner keyboard = new Scanner(System.in);

		String line = keyboard.nextLine();
		int[] first = convertStringToIntArray(line);

		System.out.println(Arrays.toString(frequency(first)));

		keyboard.close();
	}

	// By making this a utility method, I'm able to call it twice and keep my main program
	// tidy.
	// You do not need to use this method
	public static int[] convertStringToIntArray(String line)
	{
		// Do not edit or use this method
		String[] split = line.split(" ");		// Split the String up using whitespace
		int[] first = new int[split.length]; 	// Construct the resulting array
		for (int i=0; i < first.length; ++i)	// Convert each String to an int and store in int array
		{
			first[i] = Integer.valueOf(split[i]);
		}
		return first;							// Return the reference to the newly constructed array
	}
	
	public static int[] frequency(int[] array)
	{
		// Construct an array to store the frequency of each element.
		int[] freqArray = new int[array.length];

		// Loop over the elements in the array.
		for (int i = 0; i < array.length; ++i)
		{
			int elem = array[i];

			// Initialize an accumulator to count the frequency of the element.
			int freq = 0;

			// Compare the element at index i to all the other elements.
			for (int j = 0; j < array.length; ++j)
			{
				int otherElem = array[j];
				// Increment the frequency if the elements are equal.
				if (elem == otherElem) {
					freq += 1;
				}

				// Note: The if statement above executes when i == j. This does not
				// overcount the element, however, because freq was initialized to 0.
			}

			// Store the frequency in the output array.
			freqArray[i] = freq;
		}

		return freqArray;
	}
}
