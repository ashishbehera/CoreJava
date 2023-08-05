package lessons;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Krishna");
		hm.put(1, "Balaram");
		hm.put(1, "Arjun");
		hm.put(2, "Chaitanya");
		hm.put(3, "Nityananda");
		hm.remove(1);
		System.out.println(hm);
		
		Set es = hm.entrySet();
		
		Iterator itr = es.iterator();
		
		while(itr.hasNext()) {
			Map.Entry  mp=(Map.Entry)itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}



	}

}
