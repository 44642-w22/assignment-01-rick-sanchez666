package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

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





}
