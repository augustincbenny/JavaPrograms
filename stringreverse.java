import java.util.Scanner;
public class stringreverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter the string:");
		String sen=sc.nextLine();
		StringBuffer sbf=new StringBuffer(sen);
		sbf.reverse();
		System.out.println("reverse string="+sbf);
	}
}

