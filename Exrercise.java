package ArrayList;

import java.util.ArrayList;

public class Exrercise {
	public static void main(String[] args) {
		
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		nums.add(2,700);   // memory shifting
		
		nums.set(3, 12);         // overwrite number
		
		nums.get(1);            //get specific value using index num
		
		nums.remove(2);           // remove value in specific index
		
		
		nums.size();          // Find total size
		
		
		System.out.println(nums);
	}
	

}
