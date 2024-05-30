package Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsSubArray {
    public static void main(String[] args) {
        int[] arr={21,2,1,1,7};
        int k=6;
        System.out.print(sumArray(arr,k));

    }
    public static boolean sumArray(int[] arr, int k){
        Map<Integer,Integer>map=new HashMap<>();
//        WHY WE IN THEIS CODE WE ARE USING THE -1 BECUSE THE CODE WILL BE CODE WILL BE START FROM THE
        map.put(0,-1);
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=sum%k;
            if (map.containsKey(rem)){
                if (i-map.get(rem)>=2){
                    return true;
                }
            }
            else {
                map.put(rem,i);
            }

        }
        return false;
    }
}
