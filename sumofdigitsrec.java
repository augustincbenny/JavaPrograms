import java.util.Scanner;
class recursion
{
	  
	  int DigitSum(int value) {
		  if (value %10== 0)
		    return 0;
		    return (value % 10) + DigitSum(value / 10);
		}
	}
	 
	 
	 public class sumofdigitsrec
	 {
		 public static void main(String args[])
		 {
			 int num;
			 Scanner sc = new Scanner (System.in);
			 
			 System.out.print("enter a number: ");
			 num =sc.nextInt();
			 
			 recursion rec =new recursion();
			 int DigitSum =rec.DigitSum(num);
			 
			 System.out.println("the sum of digits:"+DigitSum);
		 }
	 }
	 
