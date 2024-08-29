package ARRAY;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3;
        int n=3;
        mergeSortedArray(nums1,nums2,n,m);
        System.out.println(Arrays.toString(nums1));
    }
    public static void mergeSortedArray(int[] nums1,int nums2[],int n,int m){
        int i=0;
        while (m<nums1.length){
            nums1[m]=nums2[i];
            i++;
            m++;
        }
        Arrays.sort(nums1);

    }

}
