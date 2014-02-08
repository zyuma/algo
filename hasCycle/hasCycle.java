import java.io.*;
import java.util.*;

public class hasCycle{
	public static void main(String args[]) throws InterruptedException {
		Node one = new Node("1");
		Node two = new Node("2");
		Node three = new Node("3");
		Node four = new Node("4");
		Node five = new Node("5");
		Node six = new Node("6");
		Node seven = new Node("7");
		Node eight = new Node("8");
		Node nine = new Node("9");
		Node ten = new Node("10");
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = three;
		Node current = one;
		/*
		while(current != null){
			System.out.println(current.name);
			current = current.next;
			Thread.sleep(500);
		}*/

		boolean check = hasCycle(one);
		System.out.println(check);


	}

	public static boolean hasCycle(Node head){
		if(head == null) return false;
		Node slow = head;
		Node fast = head;
		while((fast.next != null) && (fast.next.next != null)){
			System.out.println(slow.name);
			System.out.println(fast.name);
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow.name == fast.name){
				System.out.println("fast meets slow, cycle found!");
				return true;
			}
		}
		return false;
	}
}
