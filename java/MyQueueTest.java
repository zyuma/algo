import java.io.*;
import java.util.*;

public class MyQueueTest {
	public static void main(String args[]) {
		MyQueue q = new MyQueue();
		System.out.println(q.dequeue());
		q.enqueue(new Integer(1));
		q.enqueue(new Integer(2));
		q.enqueue(new Integer(3));
		q.enqueue(new Integer(4));
		q.enqueue(new Integer(5));
		q.enqueue(new Integer(6));
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(new Integer(7));
		q.enqueue(new Integer(8));
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	
	}
}
