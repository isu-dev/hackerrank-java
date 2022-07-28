package prepare.algorithm.search;

import java.util.*;

public class similar_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> edges = List.of(List.of(3, 2), List.of(3,1), List.of(1,4), List.of(1,5));

		System.out.println(similarPair(5, 2, edges));
		
	}

	public static int similarPair(int n, int k, List<List<Integer>> edges) {
	    // Write your code here
		int ans = 0, position = 0;//, parent = edges.get(0).get(0), child = 0;
		List<Integer> parent =  new ArrayList<>();
		List<Integer> sub_children =  new ArrayList<>(); //null; //new List<Integer>();
		List<List<Integer>> children = new ArrayList<>();
		
		parent.add(edges.get(0).get(0));
		
		//creating a list of children for a given parent
		for(List<Integer> node : edges) {
			if(node.get(0) != parent.get(position)) {
				children.add(sub_children);
				parent.add(node.get(0));
				sub_children.clear();
				++position;
			} else
				sub_children.add(node.get(1));
		}
		
		//for each parent
		for(int par : parent) {
			//for each of its children
			for(List<Integer> child : children.get(0)) {
				
			}
		}
		
		System.out.println(parent.indexOf(1));
		
		for (int par : parent) {
			System.out.println(par);
		}
		
//		for(List<Integer> node : edges) {
//			
//			tree.
//					
//			if(parent == node.get(0))
//				sub_children.add(node.get(1));
//			else {
//				children.add(sub_children);
//				
//				for(List<Integer> child_level : children) {
//					for(int child_unique : child_level) {
//						
//						//loop through the rest of the list to find other children
//						//for()
//						
//					}
//				}
//				
//				//calculate the abs
//				
//			}
//			
//		}
		
//		for(List<Integer> node : edges) {
//			
//			if(node.get(0) != parent)
//				parent = node.get(0);
//			
//			System.out.println(parent);
//			System.out.println(node.get(1));
//			System.out.println();
//			
//			if(Math.abs(parent - node.get(1)) <= k)
//					++ans;
//		}
		
		return ans;
	}
}
