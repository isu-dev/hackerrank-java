package prepare.algorithm.implementation;

public class number_line_jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(kangaroo(0, 2, 5, 3));
		System.out.println(kangaroo(21, 6, 47, 3));
		
	}
	
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    // Write your code here
	        String ans = "NO";

	        float time = ((x1 - x2) / (float) (v2 - v1));
	        
	        System.out.println(time);
	        
	        if(time > 0 && (time == (int)time))
	        	ans = "YES";
	        
	    return ans;
	}

}
