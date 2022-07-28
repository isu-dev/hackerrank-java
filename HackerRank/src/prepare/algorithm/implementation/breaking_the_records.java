package prepare.algorithm.implementation;

import java.util.*;

public class breaking_the_records {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> br = List.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
		System.out.println(breakingRecords(br));
	}
	
	public static List<Integer> breakingRecords(List<Integer> scores) {
	    // Write your code here
		List<Integer> ans = new ArrayList<Integer>();
		int min = scores.get(0), max = scores.get(0);
		
		ans.add(0);
		ans.add(0);
		
		for(int s : scores) {
			if(min > s) {
				min = s;
				ans.set(1, ans.get(1)+1);
			} else if(max < s) {
				max = s;
				ans.set(0, ans.get(0)+1);
			}
		}
		
		return ans;
	}

}
