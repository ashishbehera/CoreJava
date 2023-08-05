package lessons;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> city = new ArrayList<String>();
		city.add("London");
		city.add("Manchester");
		city.add("Edenburgh");
		city.add("Glassgow");
		city.add("Liverpool");
		
		//System.out.println(city.get(4));
		for(int i=0; i<city.size();i++) {
			//System.out.println(city.get(i));
		}
		
		for(String item :city) {
			System.out.println(item);
		}
		
		//Items present in Array List
		System.out.println(city.contains("London"));
		String[] names = {"Krishna","Balaram","Jagannath","Chaitanya","Radha","Prahallad"};
		List<String> namesArrayList = Arrays.asList(names);
		ArrayListDemo ald = new ArrayListDemo();
		ald.display();

	}
}
