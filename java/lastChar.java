public class lastChar
{
	public static void main(String[] arg)
	{
		String str = new String("cara");
		System.out.println(str);

		String last = str.substring(str.length()-1, str.length());
		System.out.println(last);
		if(last.equals("a")){
			System.out.println("la "+str);
		}

	}

}
