package prepare.algorithm.warmup;

public class staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staircase(6);
		
	}

	public static void staircase(int n) {
	    // Write your code here

		for(int i = 1 ; i <= n ; ++i) {
			for(int j = 0 ; j < n-i ; ++j)
				System.out.print(" ");
			
			for(int k = 0 ; k < i ; ++k)
				System.out.print("#");
			
			System.out.println();
		}
		
	}
}
