import java.util.Scanner;
public class MatrixTranspose
{
    public static void main(String arr[])
    {
        Scanner sc= new Scanner(System.in);
        int i, j, x, y;
        System.out.println("Enter the rows:");
        x= sc.nextInt();
        System.out.println("Enter the columns:");
        y= sc.nextInt();
        int num[][]= new int[x][y];
        
        System.out.format("Enter the elements of the matrix:\n");
        for (i= 0; i< x; i++)
        {
            for(j= 0; j< y; j++)
                num[i][j]= sc.nextInt();
        }

        System.out.format("The transpose of the matrix is:\n");
        for (i= 0; i< y; i++)
        {
            for(j= 0; j< x; j++)    
            {
                System.out.format("%d \t", num[j][i]);
            }
            System.out.println("\n");
        }
    }
}
