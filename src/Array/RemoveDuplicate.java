package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate{
public static void main(String[] args) {
    Set<Integer> set=new HashSet<Integer>();
    set.add(10);
    set.add(10);
    set.add(30);
    set.add(40);
    set.add(50);
    set.add(60);
    Iterator<Integer> iterator =set.iterator();
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }


}
}
