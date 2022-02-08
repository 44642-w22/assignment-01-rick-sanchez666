package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
		
		// problem 1
		
		List<Integer> linkedList1 = new LinkedList<>();
		
		System.out.println("Please enter lenght of list: ");
		int l1Length = scan.nextInt();
		
		while(l1Length > 0) {
			System.out.println("PLease enter the number: ");
			int inp = scan.nextInt();
			linkedList1.add(inp);
			l1Length -=1;
		}
		System.out.println("Enter the number to check the sum");
		int k = scan.nextInt();
		List<ArrayList<Integer>> linkedList2 = new LinkedList<>();

		for (int i = 0; i < linkedList1.size() - 1; i++) {
            int current = linkedList1.get(i);
            int nextNum = linkedList1.get(i+1);
           if(current + nextNum == k) {
        	   ArrayList<Integer> l =  new ArrayList<>();
        	   l.add(current);
        	   l.add(nextNum);
        	   linkedList2.add(l);
           }
        }
		
		System.out.println(linkedList2);

	}

}
