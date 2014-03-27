import java.util.*;
import java.io.*;

public class isAllUnique{
	public static void main(String args[]){
		String test = "aa";
		System.out.println(withDT(test));

	}
	public static boolean withDT(String s){
		if(s.length() < 2) return true;
		boolean[] count = new boolean[256];
		for(int i=0; i<s.length(); i++){
			if(count[s.charAt(i)]) return false;
			else count[s.charAt(i)] = true;
		}
		return true;
	}
}
