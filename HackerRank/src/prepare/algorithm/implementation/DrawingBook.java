package prepare.algorithm.implementation;

public class DrawingBook {

	public static void main(String[] args) {
		
		System.out.println(pageCount(6, 5));
	}
	
	public static int pageCount(int n, int p) {
	    // Write your code here
		int ans = 0, front = 0, back = 0;
		
		//if the last last page is requested nothing to turn, so return 0
		//if the first page is requested also nothing to turn, so return 0
		if ((p == n) || (p == 1))
			return 0;
		else {
			//finding the no. of pages to turn from the front
			front = (p - 1) / 2 + (p - 1) % 2;
			
			if ((n % 2 == 0) && (n - p == 1))
				return 1;
			else
				back = (n - p) / 2; // + (n - p) % 2;
			
			System.out.println(front);
			System.out.println(back);
			
			if (front > back)
				return back;
			else
				return front;
		}

	}

}
