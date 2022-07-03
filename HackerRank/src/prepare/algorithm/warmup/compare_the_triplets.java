package prepare.algorithm.warmup;

import java.util.*;

public class compare_the_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> alice = List.of(17, 28, 30);
		List<Integer> bob = List.of(99, 16, 8);
		
		System.out.println(compareTriplets(alice, bob));
		
	}
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	    // Write your code here
		//List<Integer> ans = Arrays.asList(0, 0);
		int ans[] = new int[2];
		
		for(int i = 0; i < 3 ; ++i) {
			if(a.get(i) > b.get(i))
				//ans.add(0, 1+ans.get(0)); 
				ans[0] = 1 + ans[0];
			else if (a.get(i) < b.get(i))
				//ans.add(1, 1+ans.get(1)); 
				ans[1] = 1 + ans[1];
		}
		
		List<Integer> answer = Arrays.asList(ans[0], ans[1]);
		
		return answer;
	}

}
