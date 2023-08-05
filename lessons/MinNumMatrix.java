package lessons;

public class MinNumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{9,5,7},{3,6,8},{4,11,1}};
		
		int min = a[0][0];
		int col = 0;
		
		//System.out.println(a.length);
		for(int i=0; i <a.length; i++) {
			for(int j=0; j< a[i].length;j++) {
				if(a[i][j] < min) {
					min = a[i][j];
					col = j;
				}
			}
		}
		System.out.println(min);
		int max = a[0][col];
		for(int i=0; i <a.length; i++) {
				if(a[i][col] > max) {
					max = a[i][col];
			}
			
		}
		System.out.println(max);


	}

}
