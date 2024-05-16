package Array;

public class MinimumElement {
    public static void main(String[] args) {
        int arr[]={10,50,30,40,1,2};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println(min);
    }

}
