package lessons;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Krishna Das";
		String name1 ="Krishna Das";
		String name2 = new String("Krishna Das");
		String name3 = new String("Krishna Das");
		System.out.println(name.equals(name1));
		System.out.println(name == name1 );
		
		System.out.println(name.equals(name2));
		System.out.println(name == name2 );

		
		System.out.println(name2.equals(name3));
		System.out.println(name2 == name3 );

		name.concat("Kishori Devi Dasi");
		System.out.println(name);
		
		String place = new String("jagannath Puri");
		place.concat("Vrindavana");
		System.out.println(place);
		
		//String Buffer is Thread safe, slow & Synchronized , good in Parallel Execution
		StringBuffer sb = new StringBuffer("Mayapur");
		StringBuffer sb1 = new StringBuffer("Mayapur");

		sb.append(" Dham");
		System.out.println(sb);
		System.out.println(sb1);
		sb.insert(0,"Shree ");
		System.out.println(sb);
		sb.replace(6, 8, "OM");
		System.out.println(sb);
		sb.deleteCharAt(6);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//String Builder is  not Thread safe, faster & Non Synchronized , good in Serial  Execution




	}

}
