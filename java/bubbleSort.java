import java.util.*;
import java.io.*;

public class bubbleSort{
	public static void main(String args[]){
		int[] unsorted = {6,1,2,5,3,8,4,7};
		int[] sorted = bubbleSort(unsorted);
		System.out.println(Arrays.toString(sorted));
	}

	public static int[] bubbleSort(int[] arr){
		boolean sorted = false;
		int temp;
		while(sorted == false){
			sorted = true;
			for(int i=0; i<arr.length-1; i++){
				if(arr[i] > arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
			}
		}
		return arr;
	}
}

