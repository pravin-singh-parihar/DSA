package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContinusSubArray {
    public static void main(String[] args) {

        int arr[] = {23, 2, 7, 6, 7};
        int k=6;
        System.out.println(sumSubArray(arr,k));

    }
    public static boolean sumSubArray(int[] arr,int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum % k;
            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2) {
                    return true;
                }
            }
            else
            {
                map.put(rem,i);
            }


        }
    return false;
    }
}
