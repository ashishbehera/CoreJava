package lessons;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {
	
	public static void main(String[] args) {
		int num[] = {4,5,5,5,6,6,6,4,9,9,4,7};
		
		ArrayList<Integer> digit = new ArrayList<Integer>();
		int k=0;
		
		
		for(int i=0; i <num.length;i++) {
			if(!digit.contains(num[i])) {
				k=1;
				for(int j=i+1; j <num.length;j++) {
					if(num[i] == num[j]) {
						k++;
					}
				}
				if(k==1) {
					System.out.println(num[i]+ " is unique number");
				}
				//System.out.println(num[i] +"is "+k);
				digit.add(num[i]);
			}
	

		}
	}

}
