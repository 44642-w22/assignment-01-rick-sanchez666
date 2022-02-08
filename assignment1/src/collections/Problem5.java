package collections;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Problem5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the string");
		int size = scan.nextInt();
		String inp ="";
		for(int i=0; i <size; i++) {
			System.out.print("Enter the character: ");
			String n = scan.next();
			inp +=n;
		}
		
		
		

		Stack<Character> stack = new Stack<>();

		for(int i=0; i< inp.length(); i++) {
			char c = inp.charAt(i);
			
			if(c == '{' || c == '[' || c =='(') {
				stack.add(c);
			} else if (c == '}' || c == ']' || c ==')') {
				
				char topChar;
			try {
				topChar = stack.peek();
			} catch (EmptyStackException e) {
				stack.add(c);
				break;
			}

			if(topChar == '{' && c == '}') {
				stack.pop();
			} else if(topChar == '[' && c == ']') {
				stack.pop();
			} else if(topChar == '(' && c == ')') {
				stack.pop();
			} else {
				stack.push(c);
			}
			} else {
				break;
			}
			}
		
		if(stack.size() == 0) {
			System.out.println("Balanced expression");
		} else {
			System.out.println("Un Balanced :/");
		}


	}


}
