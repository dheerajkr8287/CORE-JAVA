import java.util.*;
//Hashmap are unorderedpair
public class hashmap {
    public static void main(String[] args) {
        //country(Key),population(value)
        HashMap<String,Integer> h1=new HashMap<>();


        // insertion 
        //put(K key, V value): Inserts the specified key-value pair into the HashMap.

        h1.put("india",150);
        h1.put("us", 111);
        h1.put("china", 109);
        System.out.println(h1);
        h1.put("china", 160);
        System.out.println(h1);



        // search

        // containsKey(Object key):Returns true if this map contains a mapping for the specified key.

        /* if(h1.containsKey("Indonesia")){
            System.out.println("Present key");
        }
        else{
            System.out.println("not present");
        } */


        // get(Object key):Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.

        // System.out.println(h1.get("china"));
        // System.out.println(h1.get("Indonesia"));

        //for(int val:arr)--demo

        // iteration way --first

        /* for(Map.Entry<String,Integer> e:h1.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        } */


        // iteration way --second
/* 
        Set<String> keys=h1.keySet();
        for(String i:keys){
            System.out.println(i+""+h1.get(i));
        } */

        System.out.println(h1.isEmpty());//Returns true if this map contains no key-value mappings.

        //keySet():Returns a Set view of the keys contained in this map.
        //put(K key, V value):Associates the specified value with the specified key in this map.


        System.out.println(h1.size());//Returns the number of key-value mappings in this map.

        System.out.println(h1.values());//Returns a Collection view of the values contained in this map.

        System.out.println(h1.remove("us"));//Removes the mapping for the specified key from this map if present.


    }
}
 