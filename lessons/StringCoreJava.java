package lessons;

public class StringCoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Krishna";
		String name1 = "Krishna";
		name = "Radha";
		
		System.out.println(name);
		System.out.println(name1);
		
		String s1 = new String("Hare Krisha Hare  Rama");
		String s2 = new String("Krishna");

		
		String[] splitStr = s1.split(" ");
		System.out.println(splitStr[0]);
		
		for(int i=s2.length()-1; i >= 0;i--) {
			System.out.print(s2.charAt(i));
		}
		

	}

}
