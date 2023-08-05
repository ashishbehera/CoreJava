package lessons;

public class ThisKeyWordDemo {
	
	int num=1;
	
	public  void getData() {
		int num =6;
		System.out.println(num);
		System.out.println(this.num);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyWordDemo tkwd = new ThisKeyWordDemo();
		tkwd.getData();
	}

}
