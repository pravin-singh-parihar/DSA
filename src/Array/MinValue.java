package Array;

public class MinValue {
    public static void main(String[] args) {
        int arr[]={10,30,50,20,4,5};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
