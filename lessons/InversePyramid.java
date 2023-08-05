package lessons;

public class InversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Print Like this
		 * 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
		int count = 1;
		for(int i=1; i <=5; i++) {
		   for(int j=1; j <=5-i;j++) {
			   System.out.print(count);
			   System.out.print("\t");
			   count ++;
		   }
		   System.out.println();

		}

	}

}
