import java.util.*;
import java.io.*;

public class reverseInt{
	public static void main(String args[]){
		System.out.println(reverse(0));
	}
	public static int reverse(int n){
		boolean negative = false;
		int abs;
		int rev = 0;
		if(n<0){
			negative = true;
			abs = n * -1;
		}
		else abs = n;

		while(abs != 0){
			rev *= 10;
			rev += abs%10;
			abs /= 10;
		}
		if(negative) rev *= -1;
		return rev;
	}
}


			
