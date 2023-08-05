package lessons;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List implements classes ArrayList, LinkedList & Vector
		
		ArrayList<String> al = new  ArrayList<>();
		al.add("Krishna");
		al.add("Radha");
		al.add("Radha");
		al.add(1, "Das");
		System.out.println(al);
//		al.remove(0);
//		al.remove("Das");
		System.out.println(al.get(0));
		System.out.println(al.contains("Das"));
		System.out.println(al.indexOf("Radha"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}
	
	 protected void display() {
		
	}

}
