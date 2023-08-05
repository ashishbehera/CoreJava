package lessons;

public class ChildInheritance extends ParentIneritance{
	int cityCount = 50;
	
	public void color () {
		System.out.println(color);
	}
	
	public void getData(String x) {
		
	}
	
	public void getData(int x) {
		
	}
	
	public void display() {
		System.out.println("I am Grey in Child");
	}

	
	public void getData(int x, int y) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInheritance ch = new ChildInheritance();
		ch.color();
		ch.display();
		ParentIneritance pi = new ChildInheritance();
		System.out.println(pi.cityCount);
		pi.display();

	}

}
