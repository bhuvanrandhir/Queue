// by java collection framework
import java.util.*;
public class Main{
    
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>(); // queue is interface done by linkedlist and Arraylist
        Queue<Integer> q = new ArrayDeque<>(); // queue is interface done by linkedlist and Arraylist
        q.add(45);
        q.add(55);
        q.add(65);
        q.add(75);
        q.add(85);
        
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}