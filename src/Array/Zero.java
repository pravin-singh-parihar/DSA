package Array;

import java.util.Arrays;

public class Zero {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,0,5,0};
        int arr2[]= new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr.length-1; i>=0; i--) {
            arr2[i]=arr[arr.length-1-i];


        }
        System.out.println(Arrays.toString(arr2));
        if (arr2!=arr){
           

        }
    }
}
