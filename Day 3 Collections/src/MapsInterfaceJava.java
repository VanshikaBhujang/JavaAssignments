import java.util.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapsInterfaceJava {
    //HashMap
    public static void main(String a[])
    {
        //HashMap
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(107,"Arun");
        map.put(101,"Varun");
        map.put(102,"Rajat");
        map.put(100,"Rashmi");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        /* HashTable
        for synchronized version -> HashTable (Safe for Thread Synchronization)
        HashTable doesn't allow null key or value
         */
        Map<Character,Integer> ht = new Hashtable<>();
        ht.put('a',12);
        ht.put('b',24);
        ht.put('c',36);
        ht.put('d',48);
        ht.put('e',60);
        System.out.println(ht.keySet());
        System.out.println(ht.values());


        // TreeMap -> Stores i sorted order
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
        tree_map.put(1, "Red");
        tree_map.put(2, "Green");
        tree_map.put(3, "Yellow");
        tree_map.put(4, "Blue");
        System.out.println(tree_map);

        // Concurrent HashMap
        ConcurrentHashMap<Integer,Integer> cMap = new ConcurrentHashMap<>();
        cMap.put(1,10);
        cMap.put(2,20);
        cMap.put(3,30);
        cMap.put(4,40);

        cMap.putIfAbsent(5,50);
        cMap.remove(3,30);
        cMap.replace(2,20,200);
        cMap.containsKey(6);

        // Dictionary
        Dictionary dict = new Hashtable();
        dict.put(1, "okay");
        dict.put(3, "good");
        dict.put(5, "best");

        for(Enumeration i=dict.elements(); i.hasMoreElements();)
            System.out.println("Values : " + i.nextElement());

        System.out.println(dict.size());
    }

}
