import java.util.Scanner;

public class MoreOrLess {

	public static void main(String[] args)
	{
		// Do not edit the main program
		Scanner keyboard = new Scanner(System.in);

		int number = keyboard.nextInt();

		System.out.print(moreOrLess42(number));
		keyboard.close();

	}

	public static boolean moreOrLess42(int x)
	{
		// Your code goes here;
		int result;
		int moreThan42;
		int lessThan42;
		moreThan42 = (x - 1) % 42;
		lessThan42 = (x + 1) % 42;
		result = x % 42;
		if (result == 0) {
			return true;
		}
		if (lessThan42 == 0) {
			return true;
		}
		if (moreThan42 == 0) {
			return true;
		}
		else {
			return false;
	}
}
