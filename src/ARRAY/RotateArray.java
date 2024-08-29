package ARRAY;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        //LEET CODE 189
        int[] arr={1,2,3,4,5,6,7};
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        k=k%arr.length;
        rotateArray(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateArray(int arr[],int k){
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
    }
    public static void reverseArray(int []arr ,int i,int j){
        while (i<=j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;

        }
    }
}
