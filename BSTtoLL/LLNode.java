import java.util.*;
import java.io.*;

public class LLNode{
	int data;
	LLNode next = null;

	public LLNode(int data){
		this.data = data;
	}

	public void append(LLNode n) {
		LLNode current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = n;
	}
	public void print(){
		LLNode current = this;
		while(current.next != null){
			System.out.print(current.data + ", ");
			current = current.next;
		}
		System.out.print(current.data);
		System.out.println();
	}
}
