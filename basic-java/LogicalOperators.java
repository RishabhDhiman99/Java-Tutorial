package tutorial;

public class LogicalOperators {
	public static void main(String args[]) {
		int a=2,b=4;
		// and logical operator. test is true if both conditions are true.
		if(a==2 && b==4) {
			System.out.println("you got both right!");
		}
		// or operator. returns true if either one true. false only if both false
		else if(a==2 || b==4) {
			System.out.println("either one is right!");
		}
		else {
			System.out.println("This is else case!");
		}	
	}
}
