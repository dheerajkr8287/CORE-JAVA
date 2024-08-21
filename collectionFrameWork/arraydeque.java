//queue: ordered list which enables insert operations to be performed at one end and deletion operation to be performed at another end.

//dequeue: Double Ended Queue is a generalized version of Queue data structure that allows insert and delete at both ends.

import java.util.ArrayDeque;
import java.util.Iterator;
import java.lang.Iterable;;

public class arraydeque {
public static void main(String[] args) {
    ArrayDeque<Integer> ad1=new ArrayDeque<>();

    ad1.add(4);//Inserts the specified element at the end of this deque
    ad1.add(74);
    ad1.add(46);
    ad1.add(24);
    ad1.addFirst(1);
    ad1.addLast(9);
    ad1.descendingIterator();
    // System.out.println(ad1.getFirst());
    // System.out.println(ad1.getLast());

    // System.out.println(ad1.element());    //Retrieves, but does not remove, the head of the queue represented by this deque.

    //    ad1.offer(5555);


    // System.out.println(ad1.peek());//Retrieves, but does not remove, the head of the queue represented by this deque, or returns null if this deque is empty.

    // System.out.println(ad1.poll());//Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty

    // ad1.push(4444);
    // ad1.pop();
    for(Integer i:ad1){
        System.out.print(i);
        System.out.print(",");
    }

    //after decendingQueue
    /* System.out.println("After decendingIterarator ");
    Iterator<Integer> ad2=ad1.descendingIterator();
    while(ad2.hasNext()){
        System.out.println(ad2.next());
        
        //ad2.hasNext() checks if there is a next element in the reverse iteration.
       
        //ad2.next()retrieves and prints that element, moving the iterator to the previous element in the deque.
    } */

}
    
}