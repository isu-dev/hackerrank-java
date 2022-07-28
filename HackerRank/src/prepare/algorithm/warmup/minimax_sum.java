package prepare.algorithm.warmup;

import java.util.*;

public class minimax_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = List.of(256741038, 623958417, 467905213, 714532089, 938071625);
		
		miniMaxSum(ar);
	}
	
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here

		//final List<Integer> mutableList = new ArrayList<>(someDTO.getImmutableList());
		
		//someDTO.getImmutableList().stream().collect(toCollection(ArrayList::new));
		
		//Collections.sort(arr);
		
		long arrans[] =  new long[2]; //arr.toArray(); 
		
		for (int i = 0 ; i < 5 ; ++i) {
			if(i != 4)
				arrans[0] += arr.get(i);
			if(i != 0)
				arrans[1] += arr.get(i);
		}
		
		System.out.println(arrans[0] + " " + arrans[1]);
		
		//long first = (arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3));
		//long second = (arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4));
		
		//System.out.println(first + " " + second);
		
	}

}
