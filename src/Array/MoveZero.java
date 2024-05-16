package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        MoveZero.moveZero(arr);
        System.out.println(Arrays.toString(arr));
         }
    public static void moveZero (int arr[]) {
        int j = 1;
        int i = 0;
        while (j < arr.length) {
            if (arr[i] == 0 && arr[j] != 0) {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;

            }else if (arr[i]==0 && arr[j]==0){

                j++;

            }else {
                i++;
            }
        }

    }
}

