import java.util.*;
import java.util.ArrayList;


public class arraylist{
    public static void main(String[] args) {
        // ArrayList():Constructs an empty list with an initial capacity of ten.
        ArrayList<Integer> l1=new ArrayList<>();
        //ArrayList(int initialCapacity):Constructs an empty list with the specified initial capacity.
        ArrayList<Integer> l2=new ArrayList<>(5);
        l2.add(111);
        l2.add(222);
        l2.add(333);

        l1.add(4);
        l1.add(47);
        l1.add(14);
        l1.add(84);
        l1.add(24);
        l1.add(4);
        l1.add(0,3);
        l1.add(1,76);

        l1.addAll(0,l2);//add list2 in list 1
        //contains(Object o):Returns true if this list contains the specified element.
        // System.out.println(l1.contains(45454));   
        
        l1.trimToSize();
        System.out.println(l1);


        //indexOf(Object o):Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        // System.out.println(l1.indexOf(4));
        // System.out.println(l1.indexOf(444477));
        // System.out.println(l1.lastIndexOf(4));

        //remove(int index):Removes the element at the specified position in this list.
        // System.out.println(l1.remove(0));
        
        // l1.clear();


        //set(int index, E element):Replaces the element at the specified position in this list with the specified element.
        // l1.set(0, 555555);

        
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
        System.out.println(" ");
        // System.out.println(l1.clone());        //copy banana arraylist ka
        
        
        // System.out.println(l1.hashCode());//Returns the hash code value for this list.
        
        
        // System.out.println(l1.isEmpty());//isEmpty():Returns true if this list contains no elements.
        
        // System.out.println(l1.subList(3, 6));// subList(int fromIndex, int toIndex) Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive

        Object[] l3=l1.toArray();//The toArray() method returns an array containing all of the items in the list.


        for(Object element :l3){
            System.out.println(element);
        }
        
    }
}