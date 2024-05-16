package Array;

public class Leaders {
    public static void main(String[] args) {
        int arr[]={10,30,66,44,3,0,1};
        int max=Integer.MIN_VALUE;
        for (int i = arr.length-1; i>0; i--) {
            if (max<arr[i]){
                max=arr[i];
                System.out.println(max);
            }

        }
    }
}
