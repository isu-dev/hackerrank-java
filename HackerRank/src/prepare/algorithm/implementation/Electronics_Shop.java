package prepare.algorithm.implementation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Electronics_Shop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        
        int b = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);
        
        int m = Integer.parseInt(firstMultipleInput[2]);
        
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        
        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        
        int total = Electronics_Shop.getMoneySpent(arr, brr, b);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
		
		List<Integer> ar = List.of(3, 1);
		List<Integer> br = List.of(5, 2, 8);
		int bi = 10;
		System.out.println(getMoneySpent(ar, br, bi));

	}
	
	public static int getMoneySpent(List<Integer> ar, List<Integer> br, int b) {
		int tot = -1, sum, blen = br.size(), alen = ar.size() - 1;
			
		for(int i = alen; i >= 0 ; --i) {
			for (int j = 0; j < blen ; ++j) {
				if((sum = ar.get(i) + br.get(j)) <= b)
					if (sum > tot)
						tot = sum;
			}
		}
		
		return tot;
	}

}
