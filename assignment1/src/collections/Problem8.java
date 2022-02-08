package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Deque<Integer> q = new ArrayDeque<>();
		System.out.println("Enter number of elements:");
		int s1 = sc.nextInt();
		for (int i = 0; i < s1; i++) {
			int ele = sc.nextInt();
			q.add(ele);
		}

		System.out.println("Input (Q): " + q);
		List<Integer> l = getAlternativeSeq(q);
		System.out.println("Output (A): " + l);

	}

	public static List<Integer> getAlternativeSeq(Deque<Integer> q) {
		List<Integer> list = new ArrayList<>();
		while (!q.isEmpty()) {
			list.add(q.pollLast());
			if (!q.isEmpty())
				list.add(q.pollFirst());

		}
		return list;
	}

}
