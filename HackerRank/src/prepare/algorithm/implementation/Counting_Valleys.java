package prepare.algorithm.implementation;

public class Counting_Valleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps = 8;
		//String path = "UUDDDUUD";
		String path = "UDDDUDUU";
		
		System.out.println(countingValleys(steps, path));
	}

	public static int countingValleys(int steps, String path) {
	    // Write your code here
		int count = 0, ans = 0, before = 0;
		
		for(int i = 0 ; i < path.length() ; ++i) {
			before = count;
			
			if(path.charAt(i) == 'U')
				count += 1;
			else
				count -= 1;
			
			//count as a valley only if the previous step from the bottom
			//if ((before < 0) && (count == 0)) //works too
			if ((count == 0) && (path.charAt(i) == 'U'))
				ans += 1;		
		}
		
		return ans;
	}
}
