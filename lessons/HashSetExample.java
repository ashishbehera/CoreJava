package lessons;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet, TreeSet & LinkedHashSet implements Set Interface
		//Does not accept duplicates
		//There is no guarantee that elements stored in sequential order.. Random Order
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Puri");
		hs.add("Mayapur");
		hs.add("Vrindavan");
		hs.add("Vrindavan");
		hs.add("Remove");
		hs.remove("Remove");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
