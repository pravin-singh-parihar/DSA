package Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean a;
        if (chekSubArray(nums, k)) a = true;
        else a = false;
        System.out.println(a);

    }

    public static boolean chekSubArray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) >= k) {
                    return true;
                }else {
                    map.put(nums[i],i);
                }
            }else {
                map.put(nums[i],i);
            }
        }
       return false;
    }
}