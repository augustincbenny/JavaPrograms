import java.util.Scanner;
public class Calculator
{
    public static void main(String arr[])
    {
        float n1, n2, ans;
        char op;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the 1st number");
        n1= in.nextFloat();
        System.out.println("Enter the 2nd number");
        n2= in.nextFloat();
        System.out.println("Enter the operator: ( +, -, *, /)");
        op= in.next().charAt(0);
        switch (op)
        {
            case '+': ans= n1+ n2;
            break;
            case '-': ans= n1- n2;
            break;
            case '*': ans= n1* n2;
            break;
            case '/': ans= n1/ n2;
            break;
            default: System.out.println("Please enter a valid operator.");
            return;
        }
            System.out.format("The result is:\n %.2f %c %.2f = %.2f", n1, op, n2, ans);
    }
}
