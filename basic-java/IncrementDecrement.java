package tutorial;

public class IncrementDecrement {
	public static void main(String args[]) {
		int a=5,b=6,c=7,d=8;
		// pre-increment- first increase then use
		System.out.println(++a);
		// post-increment- first use then increase
		System.out.println(b++);
		System.out.println(b);
		// pre-decrement- first decrease then use
		System.out.println(--c);
		// post-decrement- first use then decrease
		System.out.println(d--);
		System.out.println(d);
	}
}
