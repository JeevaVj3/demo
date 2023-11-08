package ArrayList;

import java.util.ArrayList;

public class ForInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		
		for(int i=0; i<nums.size(); i++) {          //Normal foor Loop
			if(nums.get(i)%2==0) {
				System.out.println(i);
			}
		}
		
		for(Integer a:nums) {                  //Enhanced for loop
			System.out.println(a);
		}
		
		nums.forEach(x-> System.out.println(x));        //forEach Method
		
		
		nums.forEach(x-> {                              // usinf If condition in forEach
		if(x%2==0) {
			System.out.println(x);
		}	
	});
		
		
	}
	
}