package lessons;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{2,5,7},{3,6,8},{4,1,9}};
		
		
		
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
