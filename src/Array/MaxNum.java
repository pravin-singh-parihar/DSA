package Array;

public class MaxNum {
    public static void main(String[] args) {
        int arr[]={19,3,20,88,99,40};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
