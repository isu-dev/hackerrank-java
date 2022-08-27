package prepare.algorithm.implementation;

import java.util.*;

public class sales_by_match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> ar = List.of(1, 2, 1, 2, 1, 3, 2);
		//List<Integer> ar = List.of(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
		List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
		System.out.println(".." + sockMerchant(7, ar));
	}
	
	 public static int sockMerchant(int n, List<Integer> ar) {
		    // Write your code here
		 int ans = 0;
		 ArrayList<Integer> pair = new ArrayList<Integer>(ar);

		 for (int i = 0 ; i < pair.size() ; ++i) {
			 System.out.println("i: " + i + " - " + pair.get(i));
			 System.out.println(pair.size());
			 for (int j = i+1 ; j < pair.size() ; ++j) {
				 System.out.println("j: " + j);
				 if (pair.get(i) == pair.get(j)) {
					 //only arraylists can be used to remove elements
					 pair.remove(j);
					 pair.remove(i);
					 ans++;
					 --i;
					 break;
					 //System.out.println(pair.size());
				 }
			 }
		 }
		 
		 return ans;
    }


}
