import java.util.Scanner;
public class stringpalindrome
{
  public static void main(String args[])
  {
	  int size;
	  String str,rev="";
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a string:");
	  str=sc.nextLine();
	  size =str.length();
	  for(int i=size-1;i>=0;i--)
       rev=rev+str.charAt(i);
       if(str.equals(rev))
       System.out.println(str+" is palindrome!");
       else
        System.out.println(str+" is not palindrome!");
	}
}
     
