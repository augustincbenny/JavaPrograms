import java.util.Scanner;
public class LinearSearch
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n, sea, i;
        System.out.println("Enter the size of the array:");
        n= sc. nextInt();
        int arr[]= new int[n];

        System.out.println("Enter the array elements:");
        for(i=0; i< n; i++)
            arr[i]= sc.nextInt();

        System.out.println("Enter the element to be searched:");
        sea= sc.nextInt();

        for(i= 0; i< n; i++)
        {
            if (arr[i] == sea)
            {
                System.out.println("The element is found at index: " + i);
                return;
            }
        }
        System.out.println("Opps! Your element is not found.");
    }
}
