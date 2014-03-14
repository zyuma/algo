import java.io.*;
import java.util.*;

public class Print{
	public static void main(String args[]){
		ArrayList<Integer> t1 = new ArrayList<Integer>();
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		ArrayListInteger(t1);
	}

	public static void ArrayListInteger(ArrayList<Integer> arr){
		for(Integer i:arr){
			System.out.println(i);
		}
	}

	public static void LLint(LLnode head){
		LLnode cursor = head;
		while(cursor != null){
			System.out.println(cursor.val);
			cursor = cursor.next;
		}
	}
}
