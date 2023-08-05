package lessons;

public class ConstructerDemo {
	
	public ConstructerDemo() {
		System.out.println("I am in Constructor");
	}
	
	public ConstructerDemo(int x, int y) {
		System.out.println(x+y);
	}
	
	public void getMessage() {
		System.out.println("Hello World!!!");
	}

	public static void main(String[] args) {
		ConstructerDemo cd = new ConstructerDemo();
		ConstructerDemo cd1 = new ConstructerDemo(5,6);
		cd.getMessage();
		
	}

}
