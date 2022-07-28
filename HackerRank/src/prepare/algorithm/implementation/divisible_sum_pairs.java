package prepare.algorithm.implementation;

import java.util.*;

public class divisible_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ar = List.of(1, 3, 2, 6, 1, 2);
		System.out.println(divisibleSumPairs(6, 3, ar));

	}

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
	    // Write your code here
		int ans = 0;
		
		for(int x = 0; x < ar.size() ; ++x) 
			for(int j = x+1 ; j < ar.size() ; ++j) 
				//if(ar.get(x) < ar.get(j)) {
					//System.out.println("x: " + x + ".. j: " + j);
					if((ar.get(x) + ar.get(j)) % k == 0) {
						System.out.println("x: " + x + ".. j: " + j);
						++ans;
					}
				//}
		
		return ans;
	}
}
