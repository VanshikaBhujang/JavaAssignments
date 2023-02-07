import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String a[])
    {
        // **** Set Interface
        // HashSet

        // Declaring object of type String
        Set<Object> hash_Set = new HashSet<Object>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("Mobile");
        hash_Set.add(89);
        hash_Set.add(false);
        hash_Set.add("Example");
        hash_Set.add(67.9);
        hash_Set.add(67.9);

        // Printing elements of HashSet object
        System.out.println(hash_Set);

        // **** SortedSet Interface
        // TreeSet -> Stores data in Sorted Order
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //traversing elements
        Iterator it =set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
