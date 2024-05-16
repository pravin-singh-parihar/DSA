package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int t=9;
        int []sum=TwoSum.twoSum(arr,t);
        System.out.println(Arrays.toString(sum));


    }
    public static int []twoSum(int []arr, int t){
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int res=t-arr[i];
            if (map.containsKey(res)){
                return new int[]{map.get(res),i};

            }
            map.put(arr[i],i);

        }
        return null;
    }
}
