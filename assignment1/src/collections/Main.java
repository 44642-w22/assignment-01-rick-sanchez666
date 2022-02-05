package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// problem1();
		
		
		// problem2();
		
		
		// problem3();
		
		problem4();

	}

	

	private static void problem1() {

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
		List<Integer> linkedList2 = new LinkedList<>();
		
		Iterator<Integer> it = linkedList1.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			int sum = 0;
			for( int i=1; i< num; i++) {
				if(num%i == 0) {
					sum = sum + i;
				}
			}
			if( sum == num) {
				linkedList2.add(num);
			}
		}
		
		System.out.println(linkedList2);
	}


	private static void problem2() {
		
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

	private static void problem3() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the list");
		int size = scan.nextInt();
		List<Integer> list =  new ArrayList<>(size);

		for(int i=0; i <size; i++) {
			System.out.print("Enter the number: ");
			int n = scan.nextInt();
			list.add(n);
		}
		
		
		Collections.sort(list);
		
		if(list.size() == 0) {
			System.out.println(Integer.MIN_VALUE);
		} else {
			
			System.out.println(list.get(0));
		}
		
	}

	private static void problem4() {
		
	}
	
	private static void problem5() {
		
	}
	private static void problem6() {
	
	}
	private static void problem7() {
	
	}
	
	private static void problem8() {
		
	}
}
