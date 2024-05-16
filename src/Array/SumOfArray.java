package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={19,30,40,50,10,22};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }

}