import java.util.*;
import java.io.*;

public class Node{
	Node next = null;
	String name;

	public Node(String name) {
		this.name = name;
	}
	public void append(String name) {
		Node end = new Node(name);
		Node n = this;
		while (n.next != null){
			n = n.next;
		}
		n.next = end;
	}
}
