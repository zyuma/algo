import java.util.*;
import java.io.*;

public class Factorial{
	public static void main(String args[]){
		System.out.println(Factorial(0));
	}
	public static int Factorial(int n){
		if(n == 0) return 1;
		return n*Factorial(n-1);
	}
}
