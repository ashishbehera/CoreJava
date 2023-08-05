package lessons;

public class StaticVar {
	
	String name;
	String address;
	static String city = "London";
	static int i=0;
	
	public StaticVar(String name, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(name+" "+address + " "+city);
	}

	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Chitanya Das","Croydon");
		StaticVar obj1 = new StaticVar("Krishna Das","Sutton");
		obj.getAddress();
		obj1.getAddress();


	}

}
