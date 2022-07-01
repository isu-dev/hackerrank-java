package prepare.algorithm.warmup;

import java.lang.reflect.Array;
import java.util.List;
import java.util.*;

public class a_very_big_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ar = List.of(1000000001, 1000000002, 1000000003, 1000000004, 1000000005);
		
		System.out.println(aVeryBigSum(ar));
	}

	public static long aVeryBigSum(List<Integer> ar) {
	    // Write your code here
		long sum = 0;
		
		for(int i = 0 ; i < ar.size() ; ++i) 
			sum += ar.get(i);
		
		return sum;
	}
}
