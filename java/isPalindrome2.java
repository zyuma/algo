import java.util.*;
import java.io.*;

public class isPalindrome2{
	public static void main(String args[]){
		String t1= "yuma";
		String t2 = "AAuuaa";
		System.out.println(isPalindrome(t1));
		System.out.println(isPalindrome(t2));

	}

	public static boolean isPalindrome(String s){
		if(s == null) return false;
		String s2 = "";
		for(int i=0; i<s.length(); i++){
			if(((65<=s.charAt(i))&&(s.charAt(i)<=90)) || ((97<= s.charAt(i))&&(s.charAt(i)<=122))) s2 += s.charAt(i);
		}
		s2 = s2.toLowerCase();
		for(int j=0; j<s2.length()/2; j++){
			if(s2.charAt(j) != s2.charAt(s2.length()-1-j)) return false;
		}
		return true;
	}
}
