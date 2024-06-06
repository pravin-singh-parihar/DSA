package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={1,5,3,6,10,50,13};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int val=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>val)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
}
