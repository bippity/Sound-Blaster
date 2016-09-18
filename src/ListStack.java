//ListStack.java

import java.util.EmptyStackException;

public class ListStack implements DStack
{
	private ListStackNode front;
	
	//Node class for making the linked list
	private class ListStackNode 
	{
		private double value;
		private ListStackNode next;
	}
	
	//ListStack constructor; front node begins as null
	public ListStack()
	{
		front = null;
	}
	
	//Returns true if list is empty, false if not.
	public boolean isEmpty()
	{
		if (front == null)
		{
			return true;
		}
		return false;
	}
	
	//Adds double d to the linked list stack
	public void push(double d)
	{
		ListStackNode tempNode = front; //Sets front to a defined node, its next node will be the previous front node
		front = new ListStackNode();
		front.value = d;
		front.next = tempNode;
	}
	
	//Removes and returns the front element of the stack. Throws exception if empty
	public double pop() throws EmptyStackException
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		
		double value = front.value; //Saves value to be returned, front node becomes its next node; previous front is removed by gc
		front = front.next;
		
		return value;
	}
	
	//Returns the front element of the stack. Throws exception if empty.
	public double peek()
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		
		return front.value;
	}
}
