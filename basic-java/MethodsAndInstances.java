package tutorial;

class Square{
	private int length;
	private int breadth;
	public void setSquare(int l,int b) {
		length = l;
		breadth = b;
	}
	public void getArea() {
		System.out.println("area: "+(length*breadth));
	}
}

public class MethodsAndInstances {
	public static void main(String args[]) {
		Square sq = new Square();
		sq.setSquare(10,20);
		sq.getArea();
	}
}
