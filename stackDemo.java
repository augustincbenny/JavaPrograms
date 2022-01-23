import java.util.*;

class Stack
{
    Scanner sc= new Scanner(System.in);
    int Maxsize;
    int top;
    int arr[];
    Stack(int size)
    {
        top= -1;
        arr= new int[size];
    }

	boolean isFull(){
		return (top == Maxsize- 1);
	}

	boolean isEmpty(){
		return (top ==- 1);
	}

    void push(int y)
    {
	    if (isFull())
		    System.out.println("Overflow !!\n");
	    else
	    {
		    top++;
		    arr[top]= y;
			System.out.format("Inserted element: %d\n", y);
	    }
    }

    void pop()
    {
	    if (isEmpty())
            System.out.println("Underflow !!\n");
	    else
	    {
		    System.out.format("Popped element: %d\n", arr[top]);
		    top--;
	    }
    }

	void peek()
	{
		if ( ! isEmpty())
			System.out.format("Peeked element: %d\n", arr[top]);
	}

    void display()
    {
	    if (isEmpty())
            System.out.println("The stack is empty.\n");
	    else
	    {
		    System.out.println("Stack:");
		    for(int i= top; i>= 0; i--)
                System.out.format("%d\n", arr[i]);
	    }
    }
}


public class stackDemo
{
    public static void main(String arr[])
    {
        int option, size, x;
        Scanner sc= new Scanner (System.in);
        System.out.println("\nEnter the maximum size of stack:");
        size= sc.nextInt();
        Stack object= new Stack(size);
        object.Maxsize= size;
	    while(true)
	    {
		    System.out.println("\nOption 1: Push\nOption 2: Pop\nOption 3: peek\nOption 4: display\nOption 5: Exit");
		    System.out.print("Enter the option number: ");
		    option= sc.nextInt();
		    switch(option)
		    {
			    case 1: System.out.print("Enter the number: ");
						x= sc.nextInt();
						object.push(x);
						break;
			    case 2: object.pop();
						break;
				case 3: object.peek();
						break;
			    case 4: object.display();
						break;
			    case 5: System.exit(0);
			    default:
                    	System.out.println("Invalid option. Try again\n");
		    }
	    }
    }    
}
