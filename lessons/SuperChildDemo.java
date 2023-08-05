package lessons;

public class SuperChildDemo extends SuperParentDemo {

	//String name = "Radha";
//	public SuperChildDemo() {
//		super();
//	}
	
	public SuperChildDemo() {
		System.out.println("I am in Child Class Constructor");
	}
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am in Child Class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperChildDemo scd = new SuperChildDemo();
		scd.getName();
		scd.getData();
	}

} 
