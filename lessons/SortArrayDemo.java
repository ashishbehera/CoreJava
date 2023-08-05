package lessons;

public class SortArrayDemo {
	
	public static void main(String[] args) {
		int num[] = {7,3,9,2,5,1,8};
		
		
		for(int i=0; i <num.length; i++) {
			for(int j= i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					num[i] = num[i] + num [j];
					num[j] = num[i] - num[j];
					num[i] = num[i] - num[j];
				}
			}
		}
		for(int i =0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
