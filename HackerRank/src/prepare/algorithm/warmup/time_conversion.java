package prepare.algorithm.warmup;

public class time_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "12:40:22AM";
		System.out.println(timeConversion(s));
		
	}
	
	public static String timeConversion(String s) {
	    // Write your code here
		String ans = "";
		int hour = 0;
		
		//System.out.println(s.substring(8,10));
		
		if(s.substring(8, 10).contentEquals("PM"))
			//System.out.println("yes");
			if((hour = Integer.valueOf(s.substring(0, 2))) != 12)
				ans = (hour + 12) + s.substring(2, 8);
			else
				ans = s.substring(0, 8);
		else
			if((hour = Integer.valueOf(s.substring(0, 2))) == 12)
				ans = "00" + s.substring(2, 8);
			else
				ans = s.substring(0, 8);
		
		return ans;

	}

}
