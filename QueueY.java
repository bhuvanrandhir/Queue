//imp by array 
public class QueueY{
  static class Queue {
    static int arr[];
    static int size;
    static int rear = -1;


    Queue(int size) {
      arr= new int[size];
      this.size =size;

    }

    public static boolean isEmpty() {
      return rear == -1;
    }
    //enque or add 
    public static void add(int data) {
      if(rear == size-1) {
        System.out.println("full queue");
        return;
      }
      rear++;
      arr[rear]=data;
    }

    //dequeue
    public static int remove() {
      if(isEmpty()) {
        System.out.println("Empty queue");
        return -1;
      }

      int front =arr[0];
      for(int i=0;i<rear;i++) {
        arr[i]=arr[i+1];//agla ko bharte hain
      }
      rear--;
      return front;
    }

    //peek
    public static int peek() {
      if(isEmpty()) {
        System.out.println("Empty queue");
        return -1;
      }
      return arr[0];
    }
  }






      public static void main(String[] args) {
      Queue q = new Queue(5);
      q.add(12);
       q.add(32);
        q.add(22);

        //fifo 1 2 3 but in stack 3 2 1
        while(!q.isEmpty()) {
          System.out.println(q.peek());
          q.remove();
        }
  }
}
