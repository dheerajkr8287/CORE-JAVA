// The load factor: is a measure of how full the hash table is allowed to get before its capacity is automatically increased. When the number of entries in the hash table exceeds the product of the load factor and the current capacity, the hash table is rehashed (that is, internal data structures are rebuilt) so that the hash table has approximately twice the number of buckets.

import java.util.HashSet;
import java.util.Iterator;


public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet=new HashSet<>(6,0.5f);
        HashSet<Integer> myHashSet3=new HashSet<>(8,0.5f);
        
        myHashSet.add(6);//add(E e):Adds the specified element to this set if it is not already present.
        
        myHashSet.add(64);
        myHashSet.add(16);
        myHashSet.add(96);
        myHashSet.add(64);
        // myHashSet.remove(64);Removes the specified element from this set if it is present.

        // System.out.println(myHashSet.size());//Returns the number of elements in this set (its cardinality).

        System.out.println(myHashSet);

        // System.out.println(myHashSet.hashCode());//Returns the hash code value for this set
        // System.out.println(myHashSet.clone());//Returns a shallow copy of this HashSet instance
        // System.out.println(myHashSet.contains(45));//Returns true if this set contains the specified element.


        // Iterator<Integer> myHashSet2=myHashSet.iterator();
        // while (myHashSet2.hasNext()) {
        //     Integer element=myHashSet2.next();
        //     System.out.println(element);
            
        // }

     }
}
