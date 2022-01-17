import java.util.Scanner;
public class LeapYear
{
    public static void main(String arr[])
    {
        int n;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the year: ");
        n= in.nextInt();
        if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0))
            System.out.println(n + " is a Leap year.");
        else
            System.out.format("%d is not a Leap year.", n);
    }
}
