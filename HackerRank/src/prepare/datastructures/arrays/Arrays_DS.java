package prepare.datastructures.arrays;

import java.util.*;

public class Arrays_DS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = List.of(1, 3, 4, 2);
		System.out.println(reverseArray(ar));
	}

	public static List<Integer> reverseArray(List<Integer> a) {
	// Write your code here
		List<Integer> ans = new ArrayList();
		//int l = a.size() - 1;

		for (int x = a.size() - 1 ; x >= 0 ; --x) {
			ans.add(a.get(x));
		}
		
		return ans;
	}
}
