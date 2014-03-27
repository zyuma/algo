import java.util.*;
import java.lang.*;
import java.io.*;

class testing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "radar";
		System.out.println(s);
		String s_new = s.replaceAll("[^a-zA-Z]+","");
		System.out.println(s_new);

	}
}
