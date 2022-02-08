package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the list");
		int size = scan.nextInt();
		ArrayList<String> list =  new ArrayList<>(size);
		ArrayList<String> list2 =  new ArrayList<>(size);
		for(int i=0; i <size; i++) {
			System.out.print("Enter the string: ");
			String n = scan.next();
			list.add(n);
		}
		for(String s: list) {
			list2.add(s);
		}
		list2.sort((s1,s2) -> s1.length()-s2.length() );
		System.out.println(list2);

	}


}
