package COLLECTION.map;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,3};
        int k=2;
     boolean res  = containDuplicate(nums,k);
        System.out.println(res);
    }
    public static boolean containDuplicate(int []nums,int k)
    {
         k=k%nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <nums.length; i++) {

            if (map.containsKey(nums[i])&& (i-map.get(nums[i])<=k)){
                return true;
                }
            map.put(nums[i],i);

        }
        return false;
    }
}
