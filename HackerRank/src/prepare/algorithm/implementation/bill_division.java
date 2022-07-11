package prepare.algorithm.implementation;

import java.util.*;

public class bill_division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void bonAppetit(List<Integer> bill, int k, int b) {
	    // Write your code here
		int val = 0;

		bill.remove(k);
		
		for(int x : bill) {
			val += x;
		}
		
		if(val / 2 == b)
			System.out.println("Bon Appetit");
		else
			System.out.println(b - (val /2));
	}
}
