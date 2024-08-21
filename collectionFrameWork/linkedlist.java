import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(22);
        l2.add(66);
        l2.add(45);

        l1.addAll(l2);

        l1.add(5);
        l1.add(7);
        l1.add(6);
        l1.add(5);
        l1.add(0,51);
        l1.add(1,99);
        l1.addFirst(555);//Inserts the specified element at the beginning of this list.

        l1.addLast(666);//Appends the specified element to the end of this list.


    //  System.out.println(l1.contains(5555));//Returns true if this list contains the specified element
        

    // System.out.println(l1.remove(4));//Removes the first occurrence of the specified element from this list, if it is present. If this list does not contain the element, it is unchanged


    //    l1.set(2, 1000);//Replaces the element at the specified position in this list with the specified element.

    //    l1.remove(2);//Removes the element at the specified position in this list

    //    System.out.println(l1.indexOf(6));//Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    //   System.out.println(l1.lastIndexOf(5));// linked list ke andar ka elemnet jo last mai aya ho uska index
    //   System.out.println(l1.peek());//  This method returns the head of this list, or null if this list is empty.
        //  System.out.println(l1.poll()); //Retrieves and removes the head (first element) of this list.and print rest of list element

    // l1.offer(456);//Adds the specified element as the tail (last element) of this list.
    // l1.offerFirst(88888);//Inserts the specified element at the front of this list.


    // l1.push(5000);//Pushes an element onto the stack represented by this list. In other words, inserts the element at the front of this list.
    // l1.pop();//Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.


    // l1.removeFirstOccurrence(5);//Removes the first occurrence of the specified element in this list (when traversing the list from head to tail). If the list does not contain the element, it is unchanged.

    // l1.removeLastOccurrence(5);//Removes the last occurrence of the specified element in this list (when traversing the list from head to tail). If the list does not contain the element, it is unchanged.
    for(int i=0;i<l1.size();i++){
        System.out.print(l1.get(i));
        System.out.print(",");
    }

    Object[] l3=l1.toArray();//The toArray() method returns an array containing all of the items in the list.


        for(Object element :l3){
            System.out.println(element);
        }

        
        
    }
}