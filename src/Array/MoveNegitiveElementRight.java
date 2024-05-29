package Array;

import java.util.Arrays;

public class MoveNegitiveElementRight {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        MoveNegitiveElementRight.moveNegative(arr);
    }

    public static void moveNegative(int[] arr) {
        int i = 0; // pointer to the next position for a positive number
        int j = 1; // pointer to iterate through the array

        while (j < arr.length) {
            if (arr[i] >= 0 ) { // if the current number is non-negative
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                ;// move the pointer to the next position for a positive number
            }
            else if (arr[j] >= 0) {
                j++; // always move the iterator pointer
            }else {
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
