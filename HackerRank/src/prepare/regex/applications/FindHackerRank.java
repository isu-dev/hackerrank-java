package prepare.regex.applications;

import java.util.*;

public class FindHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findHackerRank("My name is Isuri");
        String ar1 = "controlled check enjoyment hackerrank potential at ahead family";
        String ar2 = "star hackerrank";
        String ar3 = "come presence badly surrounding hackerrank production";
        String ar4 = "hackerrank";
        String ar5 = "i think hackerrank is a great place to hangout";
        
        List<String> ar = List.of(ar1, ar2, ar3, ar4, ar5);
        
        findHackerRank(ar);
	}
	
	public static void findHackerRank(List<String> convo) {
        String parts[], check = "hackerrank";
        
        for(String x : convo) {
            parts = x.split(" ");
            
            if(check.contentEquals(parts[0])) {
                if (check.contentEquals(parts[parts.length - 1]))
                    System.out.println("0");
                else
                	System.out.println("1");
            } else if (check.contentEquals(parts[parts.length - 1]))
            	System.out.println("2");
            else
            	System.out.println("-1");
            
            parts = null;
        }
	}

}
