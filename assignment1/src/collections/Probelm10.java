package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Probelm10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		Deque<Character> deque=new LinkedList<>();
		System.out.println("Enter the no of Characters to insert: ");
		int n=scan.nextInt();
		System.out.println("Enter the Character values: ");
		for(int j=0;j<n;j++)
		{
			deque.addFirst(scan.next().charAt(0));
		}
		System.out.println("Enter the no of BinaryNumbers  :");
		int num=scan.nextInt();
		int a[]=new int[num];
		System.out.println("Enter the BinaryNumbers");
		for(int i=0;i<num;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		remCharacter(deque,a);
	}
	public static void remCharacter(Deque<Character> deque,int[] a) {
		
		char c = 0;
		String str="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				c=deque.removeLast();
			}
			if(a[i]==0)
			{
				if(c!=0)
				{
				deque.addLast(c);
				c=0;
				}
				
			}
		}
		int size=deque.size();
		for(int i=0;i<size;i++)
		{
			str+=deque.removeLast();
		}
		System.out.println(str);
	}



}
