package prepare.algorithm.implementation;

import java.util.*;

public class between_two_sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Integer> ar = List.of(2, 4);
//		List<Integer> br = List.of(16, 32, 96);
		
//		List<Integer> ar = List.of(2, 6);
//		List<Integer> br = List.of(24, 36);
		
		List<Integer> ar = List.of(3, 4);
		List<Integer> br = List.of(24, 48);
		
		System.out.println(getTotalX(ar, br));

	}
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
		//int ans = 0;
		List<Integer> number = new ArrayList<Integer>();
		
		for(int x : b)
			if(x % (float) b.get(0) == 0)
				if(b.indexOf(x) == b.size()-1)
					number.add(b.get(0));
		
		for(int x : a)
			if(b.get(0) % (float) x == 0) {
				number.add(x);
				
				if(!number.contains((b.get(0) / x)))
					number.add(b.get(0) / x);
			}
		
		for(int y : number)
			System.out.println(y);
			System.out.println("-----");
		
		for(int x : b)
			for(int y : number)
				if(x % (float) y != 0)
					number.remove(number.indexOf(y));
		
		for(int z = 0 ; z < a.size() ; ++z) {
			for(int y : number)
				if(y % (float) a.get(z) != 0) {
					//System.out.println("y:" + y + " z: " + z);
					number.remove(number.indexOf(y));
					--z;
					break;
				}
		}
		
//		for(int z : a) {
//			for(int y : number) {
//				System.out.println("y:" + y + " z: " + z);
//				if(y % (float) z != 0) {
//					//System.out.println("y:" + y + " z: " + z);
//					number.remove(number.indexOf(y));
//					break;
//				}
//			}
//			System.out.println("next");
//		}
						
		
		for(int y : number)
			System.out.println(y);
		System.out.println("-----");
		
//		//assuming that the array list is in ascending order
//		for(int y : b)
//			if(y % b.get(0) == 0)
//				if(b.indexOf(y) == b.size()-1)
//					number.add(b.get(0));		
//					
//		for(int factor : a)
//			for(int x : number)
//				if(x % (float) factor == 0) {
//					if(number.indexOf(x) == number.size()-1) {
//						number.add(number.get(0) / factor);
//						break;
//					}
//				} else
//					number.remove(number.indexOf(x));
	
		
//		number.add(a.get(0));
//		
//		for(int factorA : a)
//			for(int x : number) {
//				//if x does not have a factor with value factorA, remove x from the identified list 
//				if((x % (float) factorA) != 0) {
//					number.remove(number.indexOf(x));
//					//number.add(factorA);
//					
//					if(factorA % (float) x == 0)
//						number.add(factorA);
//					else
//						number.add(factorA * x);
//				}
//				
//			}
//		
//		for(int x : number)
//			System.out.println(x);
//		
//		for(int y : b)
//			for(int x : number)
//				if(y % (float) x != 0)
//					number.remove(number.indexOf(x));
//				else if(number.indexOf(x) == number.size()-1)
//					number.add(y);

		return number.size();
	}

}
