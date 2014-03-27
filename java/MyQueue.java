import java.io.*;
import java.util.*;

public class MyQueue{
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public MyQueue(){
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
		System.out.println("Costructed");
	}
	public void enqueue(Integer num){
		s1.push(num);
	}
	public Integer dequeue(){
		if(!s2.empty()) return s2.pop();
		else{
			while(!s1.empty()){
				s2.push(s1.pop());
			}
			return s2.pop();
		}
	}
/*	public Integer peek(){
		Integer temp = s2.pop();
		s2.push(temp);
		return temp;
	}*/
}
