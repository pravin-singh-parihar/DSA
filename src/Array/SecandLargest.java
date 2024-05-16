package Array;

public class SecandLargest {
    public static void main(String[] args) {
        int arr[]={2,7,1,8,6,0,5};
        int largest=Integer.MIN_VALUE;
        int slarest=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>slarest && arr[i]!=largest){
                slarest=arr[i];
            }
        }
        System.out.println(slarest);

    }
}
