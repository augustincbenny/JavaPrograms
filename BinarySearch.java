import java.util.Scanner;
public class BinarySearch
{
    public static void main(String arr[])
    {
        Scanner sc= new Scanner(System.in);
        int n, i, j, temp= 0, search, first, last, middle;
        System.out.println("Enter the size of array:");
        n= sc.nextInt();
        int num[]= new int[n];

        System.out.println("Enter the array elements:");
        for (i= 0; i< n; i++)
            num[i]= sc.nextInt();

// Bubble sort

        for(i= 0; i< n; i++)
        {
            for(j= 0; j< n-i-1; j++)
            {
                if ( num[j] >= num[j+ 1])
                {
                    temp= num[j];
                    num[j]= num[j+ 1];
                    num[j+ 1]= temp;
                }
            }
        }

        System.out.println("\nThe sorted array is:");
        for(i= 0; i< n; i++)
            System.out.print(num[i] + "\t");
        System.out.println("\nEnter value to find from the array: ");
        search= sc.nextInt();

        first= 0;
        last= n- 1;
        middle= (first+last)/2;

        for ( ; first <= last; middle = (first + last)/2) 
        {
            if (num[middle] == search) 
            {
                System.out.format("%d found at index %d.\n", search, middle);
                break;
            }
            else if (num[middle] < search)
                first = middle + 1;
            else if (num[middle] > search)
                last = middle - 1;
        }

        if (first> last)
      System.out.format("OOPS! Nunber not found. \n%d isn't present in the list.", search);
    }
}  
