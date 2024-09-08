package COLLECTION.TREEMAP;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class LongestSubSequnceOfSum {
    public static void main(String[] args) {
        int[] nums={4,5,2,1};
         int[] queries={3,10,21};
      int []res= subSequnceSum(nums,queries);
        System.out.println(Arrays.toString(res));
    }
    public static int [] subSequnceSum(int [] nums, int queries[]){
        int[] prefixSum = new int[nums.length];

        Arrays.sort(nums);

        TreeMap<Integer, Integer> map = new TreeMap<>();
        prefixSum[0] = nums[0];
        map.put(prefixSum[0], 1);

        for(int i = 1; i<nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
            map.put(prefixSum[i], i+1);
        }

        int[] ans = new int[queries.length];
        int k = 0;
        for(int query : queries) {
            Map.Entry<Integer, Integer> entry = map.floorEntry(query);
            if(entry != null) {
                ans[k] = entry.getValue();
            }
            k++;
        }
        return ans;


    }
}