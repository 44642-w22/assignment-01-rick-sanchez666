package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem7 {
	public static void main(String [] arg) {
		Queue<String> Q =new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of binary elements to be taken to the Queue: ");
		int a = scan.nextInt();
		System.out.println("Enter the binary values:");
		for(int k=0;k<a;k++) {
			Q.add(scan.next());
			}
		System.out.println("Input (Q): "+Q);
		System.out.println("Output: "+Problem(Q));
		
	
	}
	public static int Problem(Queue<String> Q) 
    {	
    	String String = "";
    	for (String item: Q) {
    		String += item;
        }
    	
    	return Integer.parseInt(String,2);
    }
	

}
