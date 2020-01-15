package tutorial;

class Square1{
	private int l,b;
	// constructor - initialize instances at time of creating objects
	public Square1(int l,int b) {
		this.l = l;
		this.b = b;
	}
	public void getArea() {
		System.out.println("Area: "+(l*b));
	}
}

public class Constructors {
	public static void main(String args[]) {
		Square1 sq1 = new Square1(10,20);
		Square1 sq2 = new Square1(14,22);
		sq1.getArea();
		sq2.getArea();
	}
}
