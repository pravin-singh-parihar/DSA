package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = new int[arr.length];
        Scanner scanner=new Scanner(System.in) ;
        int k=scanner.nextInt();
        for (int i = arr.length - 1; i >= 0; i--) {

            arr2[i] = arr[arr.length - 1 - i];
        }
        //Arrays.toString(arr2);
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(arr2[i]+" ");
        }
            for (int i = arr2.length - 1; i >= k; i--) {
                System.out.print(arr2[i]+" ");
            }

        }

    }


    
