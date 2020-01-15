package tutorial;

public class ConditionalOperator {
	public static void main(String args[]) {
		int age = 18;
		String vote;
		// if condition true execute first statement otherwise other
		vote = (age >= 18 ? "yes" : "no");
		System.out.println("can vote? "+vote);
	}
}
