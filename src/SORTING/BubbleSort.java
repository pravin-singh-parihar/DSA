package SORTING;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={10,2,44,55,1};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j <arr.length-1 ; j++)
            {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
    }
}
