import java.util.*;
import java.io.*;

public class sortLL{
	public static void main(String args[]){
		LLnode a = new LLnode(4);
		LLnode b = new LLnode(19);
		LLnode c = new LLnode(14);
		LLnode d = new LLnode(5);
		LLnode e = new LLnode(-3);
		LLnode f = new LLnode(1);
		LLnode g = new LLnode(8);
		LLnode h = new LLnode(5);
		LLnode i = new LLnode(11);
		LLnode j = new LLnode(15);
		a.next = b;
		b.next = c;
		//c.next = d;
		//d.next = e;
		//e.next = f;
		//f.next = g;
		//g.next = h;
		//h.next = i;
		//i.next = j;

		LLnode x = new LLnode(1);
		LLnode y = new LLnode(1);
		x.next = y;

		Print.LLint(a);
		System.out.println("sorting...");
		LLnode head  = selectionSortLL(a);
		System.out.println("DONE");
		Print.LLint(head);

	}

	public static LLnode selectionSortLL(LLnode head){
		if(head == null || head.next == null) return head;
		LLnode cursor = head, prev = head, checker = cursor.next, checker2 = head, smallest = cursor, smallest2 = cursor;
		while(cursor != null){
			System.out.println(cursor.val);
			checker = cursor.next;
			checker2 = cursor;
			smallest = cursor;
			smallest2 = cursor;
			while(checker != null){
				if(smallest.val > checker.val){
					smallest = checker;
					smallest2 = checker2;
				}
				checker2 = checker;
				checker = checker.next;
			}
			if(smallest == cursor){
				prev = cursor;
				cursor = cursor.next;
				System.out.println("4 skipped");
			}
			else if(head == cursor){
				head = smallest;
				smallest2 = cursor;
				LLnode temp = cursor.next;
				cursor.next = smallest.next;
				smallest.next = temp;
				cursor = smallest.next;
				System.out.println("mid");
			}
			else {
				System.out.println(smallest.val);
				System.out.println(smallest2.val);
				System.out.println(prev.val);
				if(smallest2 != cursor)
					smallest2.next = cursor;
				prev.next = smallest;
				LLnode temp = cursor.next;
				cursor.next = smallest.next;
				smallest.next = temp;
				cursor = smallest.next;
				System.out.println("front");
			}
		}
		return head;
	}

	public static LLnode insertionSortLL(LLnode head){
		if(head == null || head.next == null) return head;
		LLnode p1 = head.next, p2 = head, p3 = head, temp;
		LLnode newHead = new LLnode(head.val);
		while(p1 != null){
			while(p1 != p3){
				if(p3 == head && p1.val <= p3.val){
					head = p1;
					temp = p1.next;
					p1.next = p3;
					p1 = temp;
					p2.next = p1;
					break;
				}
				else if(p3.next == p1 && p3.val < p1.val){
					p2 = p1;
					p1 = p1.next;
					break;
				}
				else if(p3.next.val >= p1.val){
					temp = p3.next;
					p3.next = p1;
					p1 = p1.next;
					p3.next.next = temp;
					p2.next = p1;
					break;
				}
				else p3 = p3.next;
			}
			p3 = head;
			System.out.println("so far:");
			Print.LLint(head);
		}
		newHead = head;
		return newHead;
	}
}


		
