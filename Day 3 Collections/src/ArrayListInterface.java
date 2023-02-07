import java.util.*;
public class ArrayListInterface {
    public static void main(String[] args) {

        // **** List Interface
        // 1. ArrayList
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("Jiya");
        l1.add("Riya");
        l1.add("Siya");
        l1.add("Piya");
        l1.add("Diya");

        // different methods that can be used along with ArrayList
        System.out.println(l1);
        System.out.println(l1.indexOf("Piya"));
        System.out.println(l1.remove(2));
        System.out.println(l1.subList(1, 3));

        // Creating Array List of Heterogeneous type of elements
        ArrayList<Object> l2 = new ArrayList<Object>();
        l2.add("Sita");
        l2.add(20);
        l2.add(50.9087);
        l2.add(true);

        // Using iterator to iterate over list l2
        Iterator it = l2.listIterator();

        while (it.hasNext())
            System.out.println(it.next());


        // 2. Linked list
        LinkedList<Float> ll = new LinkedList<Float>();
        ll.add(28.9F);
        ll.add(2.9087F);
        ll.add(1234.01F);
        ll.add(245.908F);

        Iterator<Float> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        // 3. Vector
        Vector<Integer> v = new Vector<Integer>();
        v.add(67);
        v.add(897);
        v.add(45678);
        v.add(890);
        Iterator<Integer> ittr = v.iterator();
        while (ittr.hasNext()) {
            System.out.println(ittr.next());
        }

        // sorting a vector in ascending order
        Collections.sort(v, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                // Changing the order of the elements
                return o1 - o2;
            }
        });

        System.out.println(v);

        // 4. Stack
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        it =stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}