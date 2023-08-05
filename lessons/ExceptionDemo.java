package lessons;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int k =5;
			int l = 0;		
			int m = k/l;		
			System.out.println(m);
			
		}catch (Exception ex) {
			System.out.println("Exception Caught Here!!!!");
		}
		finally {
			System.out.println("I am done");
		}

	}

}
