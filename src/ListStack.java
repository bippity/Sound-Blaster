//ListStack.java

import java.util.EmptyStackException;

public class ListStack implements DStack
{
	private ListStackNode front;
	
	private class ListStackNode 
	{
		private double value;
		private ListStackNode next;
	}
	
	public ListStack()
	{
		front = null;
	}
	
	public boolean isEmpty()
	{
		if (front == null)
		{
			return true;
		}
		return false;
	}
	
	public void push(double d)
	{
		ListStackNode tempNode = front;
		front = new ListStackNode();
		front.value = d;
		front.next = tempNode;
	}
	
	public double pop() throws EmptyStackException
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		
		double value = front.value;
		front = front.next;
		
		return value;
	}
	
	public double peek()
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		
		return front.value;
	}
}
