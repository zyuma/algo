/*
 * Given n nodes of 1...n, how many unique BSTs can you construct?
 */

import java.util.*;
import java.io.*;

public class uniqueBST{
	public static void main(String args[]){
		System.out.println(numTrees(4));
	}
	public static int numTrees(int n){
		if((n==0)||(n==1)) return 1;
		if(n==2) return 2;
		int[] arr = new int[n+1];

		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;

		for(int i=3; i<=n; i++){
			int j;
			for(j=1; j<=i/2; j++){
				arr[i] += arr[i-j]*arr[j-1]*2;
			}
			if(i%2 == 1){
				arr[i] += arr[i-j]*arr[i-j];
			}
		}
		return arr[n];
	}
}
