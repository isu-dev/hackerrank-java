package prepare.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoD_Arrays_DS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<Integer> ar1 = List.of(-9, -9, -9, 1, 1, 1);
				List<Integer> ar2 = List.of(0, -9,  0,  4, 3, 2);
				List<Integer> ar3 = List.of(-9, -9, -9,  1, 2, 3);
				List<Integer> ar4 = List.of(0,  0,  8,  6, 6, 0);
				List<Integer> ar5 = List.of(0,  0,  0, -2, 0, 0);
				List<Integer> ar6 = List.of(0,  0,  1,  2, 4, 0);
				
				List<List<Integer>> ar = List.of(ar1, ar2, ar3, ar4, ar5, ar6);
				System.out.println("ans: " + hourglassSum(ar));
			}

			public static int hourglassSum(List<List<Integer>> arr) {
			    // Write your code here
				int val = 0;
				List<Integer> sums = new ArrayList<Integer>();
				
				for (int i = 0 ; i < 4 ; ++i) {
					for (int j = 0 ; j < 4 ; ++j) {
						for(int k = j ; k < j+3 ; ++k) {
							val += arr.get(i).get(k);
							val += arr.get(i+2).get(k);
						}
						val += arr.get(i+1).get(j+1);
						sums.add(val);
						val = 0;
					}
					
				}
				
				int ans = sums.get(0);
				
				for (int x : sums) {
					System.out.println(x);
					if (x > ans)
						ans = x;
				}
				
				return ans;
			}

}
