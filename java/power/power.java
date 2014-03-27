import java.util.*;
import java.io.*;

public class power{
	public static void main(String args[]){
		System.out.println(powRecursive(1.00001, 123456));
		System.out.println(powRecursive(2.0, -3));
	}

	public static double powRecursive(double x, int n){
		if(n == 0) return 1.0;
		else if(n<0){
			x = 1/x;
			n++;
			return x * powRecursive(1/x, n);
		}
		else{
			n--;
			return x * powRecursive(x, n);
		}
	}
	public static double powIterative(double x, int n){
		double result = 1;
		for(int i=0; i<n; i++){
			result *= x;
		}
		return result;
	}

}
