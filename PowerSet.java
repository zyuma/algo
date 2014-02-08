import java.io.*;
import java.util.*;
import java.lang.*;

public class PowerSet{
	public static void main(String args[]){
		int[] t1 = {0};	
		int[] t2 = {1,2,3};
		ArrayList<ArrayList<Integer>> r1 = subsets(t2);
/*
		System.out.println("t1");
		for(ArrayList<Integer> i : r1){
			System.out.println("first");
			for(int j=0; j<i.size(); j++){
				System.out.println(i.get(j));
				System.out.println("yuma");
			}
		}
/*
/*
		ArrayList<ArrayList<Integer>> r2 = PowerSet(t2);
		System.out.println("t2");
		for(ArrayList<Integer> i : r2){
			System.out.println("sub");
			for(Integer j : i){
				System.out.println(j);
			}
		}
*/

	}

	public static ArrayList<ArrayList<Integer>> PowerSet(int[] s){
		int binaryCounter = 0;
		int iteration = (int) Math.pow(2, s.length);
		ArrayList<ArrayList<Integer>> powerset = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> subset = new ArrayList<Integer>();
		while(binaryCounter < iteration){
			String binaryStr = Integer.toBinaryString(binaryCounter);
			for(int size = binaryStr.length(); size < s.length;size++){
				binaryStr = "0" + binaryStr;
			}
			System.out.println("sub");
			for(int i=0; i<binaryStr.length(); i++){
				if(binaryStr.charAt(i) == '1'){
					System.out.println(s[i]);
					subset.add(s[i]);
					System.out.println(subset.get(subset.size()-1));
				}
			}
			powerset.add(subset);
			subset.clear();
			binaryCounter++;
		}
		return powerset;
	}
	public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
		ArrayList<ArrayList<Integer>> powerset = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> subset = new ArrayList<Integer>();
		subset.clear();
		int tot_iteration = (int) Math.pow(2, S.length);
		for(int i=0; i<tot_iteration; i++){
			String binaryStr = Integer.toBinaryString(i);
			for(int j=binaryStr.length(); j<S.length; j++){
				binaryStr = "0" + binaryStr;
			}
			for(int k=0; k<binaryStr.length(); k++){
				if(binaryStr.charAt(k) == '1'){
				    subset.add(new Integer(S[k]));
				}
			}
			powerset.add(new ArrayList<Integer>(subset));
			subset.clear();
		}
		
		System.out.println("t1");
		for(ArrayList<Integer> i : powerset){
			System.out.println("sub");
			Print.ArrayListInteger(i);
		}
		return powerset;
	}
}
