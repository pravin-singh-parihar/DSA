package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        /*Map is collection of the object . in which order are not preserved.
        * in map object are store key and value and key is not duplicate */
        Map<String,Integer>map=new HashMap<>();
        map.put("ONE",1);
        map.put("TWO",2);
        map.put("THREE",3);
        map.put("FOUR",4);
        map.put("FIVE",5);
       // System.out.println(map);
        System.out.println(map.get(2));map.get("Two");
    }
}
