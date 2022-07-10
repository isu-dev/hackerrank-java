package prepare.algorithm.implementation;

public class day_of_the_programmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dayOfProgrammer(1918));
	}

	public static String dayOfProgrammer(int year) {
	    // Write your code here
		String ans = "";
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, count = 256;
		
		if(year <= 1917) {
			if(year % 4 == 0)
				days[1] = 29;
		} else if(year == 1918)
			days[1] = 29-14;
		else {
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				days[1] = 29;
		}
		
		for(int i = 0 ; i < 10 ; ++i)
			if(count - days[i] > 0)
				count -= days[i];
			else {
				if(count < 10) 
					ans = "0";
				
				ans += String.valueOf(count);
				
				if(i < 9)
					ans += ".0";
				else
					ans += ".";
				
				ans += String.valueOf(i+1) + "." + String.valueOf(year);
				
				break;
			}
		
		return ans;
	}
}
