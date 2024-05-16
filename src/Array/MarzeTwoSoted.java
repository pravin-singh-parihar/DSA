package Array;

import java.util.Arrays;

public class MarzeTwoSoted {
    public static void main(String[] args) {
        int a[]={1,2,3,0,0,0};
        int a2[]={2,5,6};
        int n=3;
        int m=3;
        MarzeTwoSoted.marze(a,a2,m,n);

        System.out.println(Arrays.toString(a));
    }
    public static void marze(int[] a,int [] a2,int m,int n){
        int i=0;

        while (m<a.length){
                a[m]=a2[i];


           m++;
           i++;

        }
        Arrays.sort(a);
    }
}
