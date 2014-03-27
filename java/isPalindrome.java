/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class isPalindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "aA";
		System.out.println(s);
		String s_new = s.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
		System.out.println(s_new);
		for(int i=0; i<s_new.length()/2; i++){
			if (s_new.charAt(i) != s_new.charAt(s_new.length()-1-i)){
				//return false;
				System.out.println("False");
			}
		}
		//return true;
		System.out.println("True");
	}
}
