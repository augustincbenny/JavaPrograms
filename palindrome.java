import java.util.Scanner;
public class PalindromeNumber
{
    public static void main(String arr[])
    {
        int n, cpy_n, rem= 0, rev= 0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number:");
        n= in.nextInt();
        cpy_n= n;
        while (n != 0)
        {
            rem= n % 10;
            rev= (rev*10) + rem;
            n= n/10;
        }
        System.out.println("The reverse of "+ cpy_n + " is "+ rev);
        if (cpy_n == rev)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }
}
