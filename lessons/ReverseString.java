package lessons;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lordName = "KrishnaChaiatanya";
		
		for(int i =lordName.length()-1; i >= 0 ; i--) {
			System.out.print(lordName.charAt(i));
		}
	}

}
