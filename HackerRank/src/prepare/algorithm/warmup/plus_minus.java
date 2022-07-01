package prepare.algorithm.warmup;

import java.util.*;

public class plus_minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = List.of(-4, 3, -9, 0, 4, 1);
		plusMinus(ar);
	}
	
	public static void plusMinus(List<Integer> arr) {
	    // Write your code here

		int pos = 0 , neg = 0, zero = 0, len = arr.size();
		
		for(int i = 0 ; i < len ; ++i) {
			if(arr.get(i) > 0)
				++pos;
			else if (arr.get(i) < 0)
				++neg;
			else
				++zero;
		}
		
		System.out.printf("%.4f\n", pos / (float)len);
		System.out.printf("%.4f\n", neg / (float)len);
		System.out.printf("%.4f", zero / (float)len);
		
	}

}
