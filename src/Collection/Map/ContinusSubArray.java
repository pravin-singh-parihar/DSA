package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class ContinusSubArray
{
    public static void main(String[] args)
    {
        int arr[]={23,2,4,6,7};
        int k=6;

        System.out.print(subArray(arr,k));
    }
    public static boolean subArray(int[] arr,int k){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for (int i = 0; i <arr.length ; i++)
        {
            sum+=arr[i];
            int res=sum%k;
            if (map.containsKey(res))
            {
                if (i-map.get(res)>=2)
                {

                return true;
                }
            }
            else
            {
                map.put(res,i);
            }

        }
        return false;
    }
}
