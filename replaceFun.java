public class replaceFun 
{
	public static void main(String[] args)
	{
		String s = "Hello my name is Yuma";
		char[] s_char = s.toCharArray();
		System.out.println(s_char);
		int count=0, i, newLength;
		for(i=0; i<s_char.length; i++){
			if (s_char[i]==' '){
				count++;
			}
		}
		
		newLength = count*2 + s_char.length;
		System.out.println(s_char);
		System.out.println(s_char.length);
		
		s_char[newLength] = '\0';
		System.out.println(s_char);
		System.out.println(s_char.length);
	}
}
