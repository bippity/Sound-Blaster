//ListStack.java

import java.util.EmptyStackException;

public class ListStack implements DStack
{
	private Node front;
	
	private class Node 
	{
		private double value;
		private Node next;
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
		Node tempNode = front;
		front = new Node();
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
