import java.util.*;
import java.io.*;

public class mergeSortedArrays{
	public static void main(String args[]){
		int[] preA = {-50,-49,-49,-48,-47,-45,-43,-41,-41,-41,-40,-40,-39,-39,-38,-37,-37,-36,-36,-35,-35,-33,-33,-32,-31,-31,-30,-30,-29,-28,-25,-24,-21,-19,-18,-18,-14,-13,-10,-10,-9,-9,-9,-6,-6,-5,-1,1,7,10,10,11,13,14,14,15,20,21,21,22,23,25,26,27,30,30,31,32,33,35,36,38,40,40,41,41,42,44,46,46,46,46,46,47,48};
		int[] B = {33};
		int[] A = new int[preA.length + B.length];
		for(int i=0; i<preA.length; i++)
			A[i] = preA[i];
		//System.out.println(Arrays.toString(preA));
		//System.out.println(Arrays.toString(B));
		//System.out.println(Arrays.toString(A));
		merge_easy(A, preA.length, B, B.length);
		//shiftRight(A,3);
		//System.out.println(Arrays.toString(A));
		//shiftRight(A,5);
		//System.out.println(Arrays.toString(A));
		//shiftRight(A,3);
		System.out.println(Arrays.toString(A));
	}
	public static void merge_easy(int[] A, int m, int[] B, int n){
		while(n>0){
			if((m>0)&&(A[m-1]>B[n-1])){
				A[m-1+n] = A[m-1];
				m--;
			}
			else {
				A[m-1+n] = B[n-1];
				n--;
			}
		}
	}
	public static void merge(int A[], int m, int B[], int n){
		if(n == 0) return;
		if(m == 0){
			A = B;
			return;
		}
		int i=0, shift=0;
		for(int j=0; j<n; j++){
			while(B[j] <= A[m-1+shift]){
				if(B[j] <= A[i]){
					shiftRight(A,i);
					shift++;
					A[i] = B[j];
					i++;
					break;
				}
				i++;
			}
			if(B[j] > A[i]){
				A[i+1] = B[j];
				i++;
			}
		}
	}
	public static void shiftRight(int[] A, int start){
		for(int i=A.length-2; i>=start; i--){
			A[i+1] = A[i];
		}
	}
}	
