package prepare.algorithm.warmup;

import java.util.List;

public class diagonal_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> arr = List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12));
		
		System.out.println(diagonalDifference(arr));
	}

	public static int diagonalDifference(List<List<Integer>> arr) {

		int diff = 0, left = 0, right = 0, k = 0;
		
		for(int i = 0 ; i < arr.size() ; ++i) {
			left += arr.get(i).get(i);
			//System.out.println(left);
		}
		
		System.out.println(arr.size());
		
		for(int j = (arr.size() - 1) ; j >= 0 ; --j) {
			right += arr.get(k++).get(j);
			//System.out.println(right);
		}
		
		//diff = Math.abs(left - right);
		
		//return diff;
		
		return Math.abs(left - right);
	}
}
