package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
     /* Set is the collection of the object. In which we can not be store a duplicate value
     * Insertion oder are not preserved.
     * We used iterator to access value we can't use loop because in which not having an order preserved
     *  */
        Set<Integer>set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        //FEATING VALUE
       // System.out.println(set);
       Iterator<Integer>iterator = set.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
        }
    }
}
