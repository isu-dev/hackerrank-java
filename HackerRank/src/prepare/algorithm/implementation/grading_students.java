package prepare.algorithm.implementation;

import java.util.*;

public class grading_students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ar = List.of(73, 67, 38, 33);
		
		System.out.println(gradingStudents(ar));
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
		List<Integer> ans = new ArrayList();
		
		//for(int i = 0; i < grades.size() ; ++i)
		for(int grade : grades)
			if(grade >= 38) {
				if((grade % 5) >= 3) {
					ans.add(grade + 5-(grade % 5));
				} else
					ans.add(grade);
			} else
				ans.add(grade);
		

		return ans;
	}
}
