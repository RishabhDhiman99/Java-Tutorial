package tutorial;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String args[]) {
		String operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a operator: ");
		operator = sc.nextLine(); 
		// switch statement
		// matches given test against all cases to find match
		// break is used to exit switch case once match is found.
		switch(operator) {
		case "+" : System.out.println("this is +");
					break;
		case "-" : System.out.println("this is -");
					break;
		case "*" : System.out.println("this is *");
					break;
		case "/" : System.out.println("this is /");
					break;
		default : System.out.println("none cases match");
		}
		sc.close();
	}
}
