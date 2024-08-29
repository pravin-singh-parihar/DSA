package ARRAY;

import java.util.Arrays;

public class RevarseArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        revarseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void revarseArray(int []arr){
        int i=0;
        int j=arr.length-1;
        while (i<j)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
            i++;
        }
    }
}
