import java.util.*;

public class sortStack {
	public static void main(String args[]){
		Stack<Integer> unsorted = new Stack<Integer>();
		unsorted.push(new Integer(9));
		unsorted.push(new Integer(0));
		unsorted.push(new Integer(32));
		unsorted.push(new Integer(123));
		unsorted.push(new Integer(7));
		unsorted.push(new Integer(16));
		unsorted.push(new Integer(39));
		unsorted.push(new Integer(9));
		unsorted.push(new Integer(3));
		unsorted.push(new Integer(4));
		System.out.println("stack made");
		Stack<Integer> sorted = sortThatStack(unsorted);
		System.out.println(sorted.pop());
		System.out.println(sorted.pop());
		System.out.println(sorted.pop());
		System.out.println(sorted.pop());
		System.out.println(sorted.pop());
		System.out.println(sorted.pop());
		System.out.println(sorted.pop());
		System.out.println(sorted.pop());
		System.out.println(sorted.pop());
		System.out.println(sorted.pop());
	}

	public static Stack<Integer> sortThatStack(Stack<Integer> s1){
		Stack<Integer> s2  = new Stack<Integer>();
		while(!s1.empty()){
			if((s2.empty()) || (s1.peek() < s2.peek())){
				s2.push(s1.pop());
			}
			else {
				Integer temp = s1.pop();
				while((!s2.empty())&&(s2.peek() < temp)){
					s1.push(s2.pop());
				}
				s2.push(temp);
			}
		}
		return s2;
	}
}
