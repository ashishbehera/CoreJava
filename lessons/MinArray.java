package lessons;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 5;
		a[0][2] = 7;
		a[1][0] = 3;
		a[1][1] = 6;
		a[1][2] = 8;
		
		
		//System.out.println(a.length);
		
		for(int i=0; i <a.length; i++) {
			for(int j=0; j< a[i].length;j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
