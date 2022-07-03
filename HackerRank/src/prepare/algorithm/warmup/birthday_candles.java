package prepare.algorithm.warmup;

import java.util.*;

public class birthday_candles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> arr = List.of(1, 2, 3, 4);
		List<Integer> arr = List.of(3, 2, 1, 3);
		
		System.out.println(birthdayCakeCandles(arr));

	}
	
	public static int birthdayCakeCandles(List<Integer> candles) {
	    // Write your code here
		int ans = 0, max = candles.get(0);
		
		for(int x : candles) {
			if(x == max)
				++ans;
			else if(x > max) {
				max = x;
				ans = 1;
			}
		}
		
		return ans;

	}

}
