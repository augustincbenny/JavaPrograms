import java.util.Scanner;
public class MatrixMultiplication
{
    public static void main(String arr[])
    {
        int x, y, p, q, i, j, k;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows of 1st matrix:");
        x= sc.nextInt();
        System.out.println("Enter the no. of columns of 1st matrix");
        y= sc.nextInt();
        System.out.println("Enter the no. of rows of 2nd matrix:");
        p= sc.nextInt();
        System.out.println("Enter the no. of columns of 2nd matrix");
        q= sc.nextInt();
        int mat1[][]= new int[x][y];
        int mat2[][]= new int[p][q];
        int mul[][]= new int[x][q];

        if (y != p)
        {
            System.out.println("Matrix multlication is not possible.");
            return;
        }

        System.out.println("Enter the elements of 1st matrix:\n");
        for(i= 0; i< x; i++)
        {
            for(j= 0; j< y; j++)
                mat1[i][j]= sc.nextInt();
        }

        System.out.println("Enter the elements of 2nd matrix:\n");
        for(i= 0; i< p; i++)
        {
            for(j= 0; j< q; j++)
                mat2[i][j]= sc.nextInt();
        }

        // product calculation

        for(i= 0; i< x; i++)
        {
            for(j= 0; j< q; j++)
            {
                mul[i][j] = 0;
                for(k= 0; k< p; k++)
                    mul[i][j] += (mat1[i][k] * mat2[k][j]);
            }
        }

        System.out.println("The product is:\n");
        for(i= 0; i< x; i++)
        {
            for(j= 0; j< q; j++)
                System.out.print( mul[i][j] + "\t");
            System.out.print("\n");    
        }
    }
}
