import java.util.*;
import java.io.*;

public class fibonucci{
	public static void main(String args[]){
		System.out.println("Recursive:");	
		System.out.println(fibonucci(0));	
		System.out.println(fibonucci(1));	
		System.out.println(fibonucci(2));	
		System.out.println(fibonucci(3));	
		System.out.println(fibonucci(4));	
		System.out.println(fibonucci(5));	
		System.out.println(fibonucci(6));	
		System.out.println(fibonucci(7));	
		System.out.println("Iterative:");	
		System.out.println(iterative(0));	
		System.out.println(iterative(1));	
		System.out.println(iterative(2));	
		System.out.println(iterative(3));	
		System.out.println(iterative(4));	
		System.out.println(iterative(5));	
		System.out.println(iterative(6));	
		System.out.println(iterative(7));	
	}
	public static int fibonucci(int n){
		if(n==0) return 0;
		else if(n==1) return 1;
		else return fibonucci(n-1)+fibonucci(n-2);
	}
	public static int iterative(int n){
		if(n<2) return n;
		int[] seq = new int[n+1];
		seq[0] = 0;
		seq[1] = 1;
		for(int i=2; i<=n; i++){
			seq[i] = seq[i-1] + seq[i-2];
		}
		return seq[n];
	}
}
