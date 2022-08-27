package prepare.algorithm.implementation;

public class DrawingBook {

	public static void main(String[] args) {
		
		System.out.println("Hi");

	}
	
	public static int pageCount(int n, int p) {
	    // Write your code here
		int ans = 0, front = 1, back = 0;
		
		if (p == n)
			return 0;
		else if ((p % 2 != 0) && (n - p == 1))
			return 0;
		else if (p == 1)
			return 1;
		else {
			front += p / 2;
			back = 
		}
		
		return ans;
	}

}
