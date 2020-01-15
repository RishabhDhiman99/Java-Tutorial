package tutorial;

class HelloMsg{
	public void helloname(String name) {
		System.out.println("hello "+name);
	}
}

public class ClassAndMethods {
	public static void main(String args[]) {
		// creating object of class
		HelloMsg hello = new HelloMsg();
		// using method of other class using . operator
		hello.helloname("rishabh");
	}
}
