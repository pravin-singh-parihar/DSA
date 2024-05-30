package Array;

import java.util.Arrays;

public class MoveNegitiveElementRight {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        int n=arr.length;
        MoveNegitiveElementRight.moveNegative(arr,n);
    }

    public static void moveNegative(int[] arr,int n) {
        int[] n1 = new int[n];
        int index=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=0){
                n1[index++]=arr[i];
            }

        }
        for (int i = 0; i <n ; i++) {
            if (arr[i]<0){
                n1[index++]=arr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            arr[i]=n1[i];

        }
        System.out.println(Arrays.toString(arr));
    }
}


