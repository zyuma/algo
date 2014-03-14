import java.util.*;
import java.io.*;

public class LLnode{
	LLnode next;
	int val;

	public LLnode(int val) {
		this.val = val;
		this.next = null;
	}
	public void append(int val) {
		LLnode end = new LLnode(val);
		LLnode n = this;
		while (n.next != null){
			n = n.next;
		}
		n.next = end;
	}
}
