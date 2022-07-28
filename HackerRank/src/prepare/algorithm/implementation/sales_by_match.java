package prepare.algorithm.implementation;

import java.util.*;

public class sales_by_match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = List.of(1, 2, 1, 2, 1, 3, 2);
		System.out.println(".." + sockMerchant(7, ar));
	}
	
	 public static int sockMerchant(int n, List<Integer> ar) {
		    // Write your code here
		 int ans = 0;
		 List<Integer> list = new ArrayList<Integer>();
		 
		 list.add(ar.get(0));
		 
		 for(int x : ar)
			 for(int y : list)
				 if(y == x) {
					 ++ans;
					 list.remove(list.indexOf(y));
					 break;
				 } else 
					 if (list.indexOf(y) == list.size()-1) 
						 list.add(x);
		 
		 for(int y : list)
			 System.out.println(y);
		 
		 return ans;
    }


}
