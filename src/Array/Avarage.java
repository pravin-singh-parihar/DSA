package Array;

public class Avarage {
    public static void main(String[] args) {
        int arr[]={10,30,40,5,6,3,6};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];


        }
        System.out.println(sum/2);
    }
}
