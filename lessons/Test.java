package lessons;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!"+1);
		
		int[] ages = {1,2,3,4,5,6};
		
		for(int i=0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		String[] names = {"Krishna","Balaram","Jagannath","Chaitanya","Radha","Prahallad"};
//		
//		for(int i=0; i < names.length; i++) {
//			System.out.println(names[i]+" Transcedental Names");
//			
//		}
		
		for(String name : names) {
			//System.out.println(name+" Transcedental Names");
			if(name.equalsIgnoreCase("Krishna")) {
				System.out.println("Lord Krishna is Present");
			}
			

		}
		
		int[] nums = {2,4,6,7,8,9,10};
		
		for(int i=0; i < nums.length; i++) {
			if(nums[i]%2 == 0) {
				System.out.println(nums[i]);
			}
		}

	}

}
