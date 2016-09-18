//ArrayStack.java
import java.util.EmptyStackException;

public class ArrayStack implements DStack
{
	private double[] stack;
	private int top;
	
	public ArrayStack()
	{
		stack = new double[10];
		top = 0;
	}
	
	//Returns true if stack is empty, else false.
	public boolean isEmpty() 
	{
		if (top == 0)
		{
			return true;
		}
		return false;
	}
	
	//Adds double d to the stack
	public void push(double d) 
	{
		if (top == stack.length) //stack is full, double the size
		{
			double[] tempStack = new double[stack.length * 2];
			for (int i = 0; i < stack.length; i++) //copies current stack to tempStack
			{
				tempStack[i] = stack[i];
			}
			stack = tempStack;
		}
		
		stack[top] = d;
		top++;	
	}

	//Removes and returns the top element from the stack
	public double pop() throws EmptyStackException
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		
		top--; //points to the most recent element instead of next
		double element = stack[top];
		stack[top] = 0;
		
		return element;
	}

	//Returns the top element from the stack
	public double peek() 
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		
		return stack[top-1];
	}
	
}
