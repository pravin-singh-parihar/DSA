package Array;

import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        int arr[]={3,2,4};
        int target=6;
        New.twoSum(arr,target);



    }
    public static int[]twoSum(int arr[],int target){


        for (int i = 0; i < arr.length; i++) {


            for (int j = i+1; j <arr.length ; j++) {

                if (arr[i]+arr[j]==target){
                    int num[]={i,j};

                    System.out.println(Arrays.toString(num));



                }

            }

        }
        return null;
    }
}
