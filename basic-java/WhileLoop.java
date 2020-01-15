package tutorial;

public class WhileLoop {
	public static void main(String args[]) {
		// initialize counter
		int count = 0;
		// loop till condition is true
		while(count<10) {
			System.out.println("count: "+count);
			count=count+1; // increment counter
		}
	}
}
