package lessons;

public class MinNumMatrixMaxCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{9,5,7},{3,6,8},{4,11,9}};
		
		int min = a[0][0];
		
		//System.out.println(a.length);
		for(int i=0; i <a.length; i++) {
			for(int j=0; j< a[i].length;j++) {
				if(a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		System.out.println(min);

	}

}
