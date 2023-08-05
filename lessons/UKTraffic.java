package lessons;

public class UKTraffic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UKTraffic traffic = new UKTraffic();
		traffic.greenGo();
		traffic.yelloSlow();
		traffic.redStop();

	}

	@Override
	public  void greenGo() {
		System.out.println("Ready to Go");
		
	}

	@Override
	public void yelloSlow() {
		System.out.println("Please Slow");
		
	}

	@Override
	public void redStop() {
		System.out.println("Please Stop");
		
	}

}
