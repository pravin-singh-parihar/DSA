package SORTING;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={1,3,2,7,5,9,8,4};
        insetionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void insetionSort(int []sort){
        for (int i = 1; i <sort.length ; i++) {
                 int value=sort[i];
                 int j=i-1;
                 while (j>=0 && sort[j]>value){
                     sort[j+1]=sort[j];
                     j--;
                 }
                 sort[j+1]=value;
        }
    }
}
