//implimentation 2 by circular Queue by  array 

public class QueueX02
{
  static class Queue
  {
	static int arr[];
	static int size;
	static int rear = -1;
	static int front = -1;

	  Queue (int size)
	{
	  arr = new int[size];
	    this.size = size;

	}

	public static boolean isEmpty ()
	{
	  return rear == -1 && front == -1;
	}

	public static boolean isFull ()
	{
	  return (rear + 1) % size == front;
	}

	//enque or add 
	public static void add (int data)
	{
	  if (isFull ())
		{
		  System.out.println ("full queue");
		  return;
		}

	  //1st element add
	  if (front == -1)
		{
		  front = 0;
		}
	  rear = (rear + 1) % size;	//for increase in circular
	  arr[rear] = data;
	}



	//dequeue
	public static int remove ()
	{
	  if (isEmpty ())
		{
		  System.out.println ("Empty queue");
		  return -1;
		}

	  int result = arr[front];
	  //single element condition
	  if (rear == front)
		{
		  rear = front = -1;
		}
	  else
		{
		  front = (front + 1) % size;
		}

	  return result;
	}

	//peek
	public static int peek ()
	{
	  if (isEmpty ())
		{
		  System.out.println ("Empty queue");
		  return -1;
		}
	  return arr[front];
	}
  }






  public static void main (String[]args)
  {
	Queue q = new Queue (5);
	q.add (12);
	q.add (32);
	q.add (22);
	q.add (62);
	System.out.println (q.remove ());
	q.add (72);
	System.out.println (q.remove ());

	//fifo 1 2 3 but in stack 3 2 1
	while (!q.isEmpty ())
	  {
		System.out.println (q.peek ());
		q.remove ();
	  }
  }
}
