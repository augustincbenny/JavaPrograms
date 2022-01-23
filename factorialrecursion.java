class recursion
{
	  
	  int factorial(int value) {
		  if (value == 1)
		    return 1;
		    return value *factorial(value - 1);
		}
	}
	 
	 
	 public class factorialrecursion
	 {
		 public static void main(String args[])
		 {
			 int num;
			 Scanner sc = new Scanner (System.in);
			 
			 System.out.print("enter a number: ");
			 num =sc.nextInt();
			 
			 recursion rec =new recursion();
			 int fact =rec.factorial(num);
			 System.out.println("factorial of number:"+fact);
		 }
	 }
			 
