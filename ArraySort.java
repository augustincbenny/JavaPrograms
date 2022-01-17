import java.util.*;
public class ArraySort
{
    public static void main(String arrr[])
    {
        int n, i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n= sc.nextInt();
        int num[]= new int[n];

        System.out.println("Enter the array elements:");
        for (i= 0; i< n; i++)
            num[i]= sc.nextInt();

        System.out.println("Sorted array:");

        Arrays.sort(num);
        for(int j: num)
            System.out.print(j + " ");
    }
}
