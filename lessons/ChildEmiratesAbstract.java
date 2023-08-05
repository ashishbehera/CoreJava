package lessons;

public class ChildEmiratesAbstract extends ParentAirCraftAbstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmiratesAbstract ch = new ChildEmiratesAbstract();
		ch.bodyColor();
		ch.engine();
		ch.safetuGuidelines();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color in the body");
		
	}

}
