import java.util.*;
import java.io.*;

public class isSubarray{
	public static void main(String args[]){
		int[] a = {3,1,3,5,6,5,3,3};
		int[] b = {3,3,5};
		int[] indexes = isSubarray(a,b);


		System.out.println("Result:");
		for(int i:indexes) System.out.println(i);
		
	}

	public static int[] isSubarray(int[] a, int[] b){
		int start = 0, end = a.length-1, smallest = a.length, bsize = b.length;
		int[] subarr = {start, end};
		boolean start_found = false;
		HashMap<Integer, Integer> bcount = new HashMap<Integer, Integer>();
		for(int i:b){
			if(!bcount.containsKey(i))
				bcount.put(i, 1);
			else
				bcount.put(i, (Integer)bcount.get(i)+1);
		}

		for(Map.Entry entry : bcount.entrySet()) System.out.println(entry);

		while(start < a.length){
			//System.out.println("start:");
			//System.out.println(start);
			HashMap<Integer, Integer> count = new HashMap<Integer, Integer>(bcount);
			System.out.println("checking");
			for(Map.Entry entry : count.entrySet()) System.out.println(entry);
			bsize = b.length;
			for(int i=start; i<a.length; i++){
				if((count.containsKey(a[i])) && (((Integer)count.get(a[i])>0))){
					count.put(a[i], (Integer)count.get(a[i])-1);
					System.out.println("checking");
					for(Map.Entry entry : count.entrySet()) System.out.println(entry);

					bsize--;
					if(bsize == 0){
						end = i;
						System.out.println(end);
						if (end-start < subarr[1]-subarr[0]){
							subarr[0] = start;
							subarr[1] = end;
						}
					}
					
				}
			}
			start++;
			System.out.println("start:");
			System.out.println(start);
				
		}
		return subarr;
	}
}
