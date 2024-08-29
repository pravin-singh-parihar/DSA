package ARRAY;

public class AvarageElement {
    public static void main(String[] args) {
        int arr[]={1,2,40,30,50};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum/arr.length);
    }
}

