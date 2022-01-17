import java.util.Scanner;
public class Quadratic
{
    public static void main(String arr[])
    {
        double a, b, c, root1, root2, det, real, imag;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 2nd degree coefficient:");
        a= in.nextDouble();
        System.out.println("Enter the 1st degree coefficient:");
        b= in.nextDouble();
        System.out.println("Enter the 0th degree coefficient:");
        c= in.nextDouble();

        // finding determinant

        det= Math.pow(b, 2) - (4* a* c); 

        if(det > 0)
        {
            System.out.println("The two roots are real and distinct.");
            root1= (-b + Math.sqrt(det)) / (2 * a);
            root2= (-b - Math.sqrt(det)) / (2 * a);
            System.out.format("Root 1 = %.2f and Root 2 = %.2f", root1, root2);
        } 
        else if (det == 0)
        {
            System.out.println("The two roots are real and equal.");
            root2= root1= (-b) / (2 * a);
            System.out.format("Root 1 = Root2 = %.2f", root1);
        }
        else
        {
            System.out.println("The two roots are complex and imaginary");
            real= -b / (2 * a);
            imag= Math.sqrt(-det) / (2 * a);
            System.out.format("Root 1 = %.2f + %.2fi", real, imag);
            System.out.format("\nRoot 2 = %.2f - %.2fi", real, imag);
        }
    }
}
