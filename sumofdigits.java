import java.util.Scanner;
public class SumDigits
{
    public static void main(String arr[])
    {
        int n, sum=0, rem= 0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number:");
        n= in.nextInt();
        while (n!=0)
        {
            rem= n % 10;
            sum= sum + rem;
            n= n/10;
        }
        System.out.println("The sum of digits is "+ sum);
    }
}
