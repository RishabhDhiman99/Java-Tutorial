package tutorial;

// import package for user input.
import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		// create Scanner object.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values: ");
		int a = sc.nextInt(); // take integer input.
		float b = sc.nextFloat(); // take float input.
		double c = sc.nextDouble(); // take double input.
		String d = sc.next(); // take string input.
		System.out.println(a+","+b+","+c+","+d);
		sc.close();
	}
}
