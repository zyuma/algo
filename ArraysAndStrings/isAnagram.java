import java.util.*;
import java.io.*;

public class isAnagram{
	public static void main(String args[]){
		String test = "yuma";
		String test2= "yuma";
		System.out.println(isAnagram(test, test2));

	}
	public static boolean isAnagram(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		HashMap<String,Integer> c1 = new HashMap<String,Integer>();
		HashMap<String,Integer> c2 = new HashMap<String,Integer>();

		for(int i=0; i<s1.length(); i++){
			if(!c1.containsKey(s1.charAt(i))) 
				c1.put(""+s1.charAt(i), new Integer(1));
			else
				c1.put(""+s1.charAt(i), new Integer(c1.get(s1.charAt(i))+1));
		}
		for(int i=0; i<s2.length(); i++){
			if(!c2.containsKey(s2.charAt(i))) 
				c2.put(""+s2.charAt(i), new Integer(1));
			else
				c2.put(""+s2.charAt(i), new Integer(c2.get(s2.charAt(i))+1));
		}
		for(String key:c1.keySet()){
			System.out.println(key);
			System.out.println(c1.get(key));
			System.out.println(c2.get(key));

			if(!c1.get(key).equals(c2.get(key)))
				return false;
		}
		return true;
	}
}
