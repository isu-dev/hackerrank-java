package prepare.algorithm.implementation;

import java.util.*;

public class migratory_birds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = List.of(1, 4, 4, 4, 5, 3);
		System.out.println(migratoryBirds(ar));
	}
	
	public static int migratoryBirds(List<Integer> arr) {
	    // Write your code here
		List<Integer> birdIds = new ArrayList<Integer>();
		List<Integer> birdCounts = new ArrayList<Integer>();
		
		for(int bird : arr) {
			if(!birdIds.contains(bird)) {
				birdIds.add(bird);
				birdCounts.add(1);
			}else {
				int index = birdIds.indexOf(bird);
				birdCounts.set(index, birdCounts.get(index)+1);
			}
		}
		
		int ans = birdIds.get(0), max = birdCounts.get(0);
		
		for(int i = 0 ; i < birdCounts.size() ; ++i) {
			if(birdCounts.get(i) > max) {
				max = birdCounts.get(i);
				ans = birdIds.get(i);
			} else if (birdCounts.get(i) == max) {
				if(ans > birdIds.get(i))
					ans = birdIds.get(i);
			}
		}
		
		return ans;
	}

}
