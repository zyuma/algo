import java.util.*;
import java.io.*;

public class Permutation{
	public static void main(String args[]){
		int[] t1 = {1,2,3};
		ArrayList<int[]> arr = new ArrayList<int[]>();
		permute(t1, 0, arr);

		System.out.println("Result:");
		for(int[] i:arr){
			System.out.println(Arrays.toString(i));
		}
	}
	public static void swap(int[] array, int i, int k){
		int temp;
		temp = array[i];
		array[i] = array[k];
		array[k] = temp;
	}
	public static void permute(int[] array, int k, ArrayList<int[]> arrL){
		for(int i=k; i<array.length; i++){
			System.out.println("Iteration "+Integer.toString(i));
			swap(array, i, k);
			System.out.println("swap1");
			System.out.println("entering permute");
			permute(array, k+1, arrL);
			swap(array, i, k);
			System.out.println("swap2");
		}
		if (k == array.length-1){
			System.out.println(Arrays.toString(array));
			arrL.add(new int[](array));
		}
	}
}
