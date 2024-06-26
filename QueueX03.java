//implimentation 3 using linked list

public class QueueX03
{
   static  class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data=data;
            next=null;
            
        }
    }
  static class Queue
  {
    static Node head=null;
    static Node tail=null;
    



	public static boolean isEmpty ()
	{
	  return head==null && tail==null;
	}


	//enque or add 
	public static void add (int data) {
	    Node newNode= new Node(data);
	    if(tail==null) {
	        tail=head=newNode;
	        return;
	    }
	    tail.next=newNode; // insert from rear
	    tail=newNode;
	}


	//dequeue
	public static int remove ()
	{
	  if (isEmpty ())
		{
		  System.out.println ("Empty queue");
		  return -1;
		}
      int front =head.data;
        if(head==tail) {
            tail=null;
        }
      head=head.next;
      return front;
	  
	}

	//peek
	public static int peek ()
	{
	  if (isEmpty ())
		{
		  System.out.println ("Empty queue");
		  return -1;
		}
	  return head.data;
	}
  }






  public static void main (String[]args)
  {
	Queue q = new Queue ();
	q.add (12);
	q.add (32);
	q.add (22);
	q.add (62);
	
	//fifo 1 2 3 but in stack 3 2 1
	while (!q.isEmpty ())
	  {
		System.out.println (q.peek ());
		q.remove ();
	  }
  }
}
