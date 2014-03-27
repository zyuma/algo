import java.util.Scanner;
public class userInput
{
	public static void main(String[] arg)
	{
		System.out.print("Enter: ");
		Scanner in = new Scanner(System.in);
		float temp_lee = in.nextFloat();
		System.out.println(temp_lee);
		float temp_tan = (temp_lee - 50)*5/8;
		System.out.println(temp_tan);
		System.out.printf("%.3f\n", temp_tan); 
	}
}
