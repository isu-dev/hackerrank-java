package prepare.algorithm.implementation;

import java.util.*;

public class apple_and_orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ar = List.of(-2);
		List<Integer> br = List.of(-1);
		countApplesAndOranges(2, 3, 1, 5, ar, br);
		
	}

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
	    // Write your code here
		int appcount = 0, oracount = 0;
		
		for(int app : apples)
			if(((a + app) >= s) && ((a + app) <= t))
				++appcount;
		
		for(int ora : oranges)
			if(((b + ora) <= t) && ((b + ora) >= s))
				++oracount;
		
		System.out.println(appcount);
		System.out.println(oracount);
	}

}
