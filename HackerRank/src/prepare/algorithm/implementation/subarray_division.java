package prepare.algorithm.implementation;

import java.util.*;

public class subarray_division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ar = List.of(1, 2, 1, 3, 2);
		System.out.println(birthday(ar, 3, 2));
	}
	
	public static int birthday(List<Integer> s, int d, int m) {
	    // Write your code here
		int ans = 0;

		for(int i = 0 ; i <= s.size() - m ; ++i) {
			int count = 0;
			
			for(int j = 0 ; j < m ; ++j) 
				count += s.get(i + j);
			
			if(count == d)
				++ans;
		}
		
		return ans;
	}

}
