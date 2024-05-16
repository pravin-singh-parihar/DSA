package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // In a map we are storing the object in the key and value key not duplicate
        Map<String,Integer>map=new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        System.out.println(map);

    }
}
