package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

}
