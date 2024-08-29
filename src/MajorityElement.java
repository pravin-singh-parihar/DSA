import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={3,2,3};
        Arrays.sort(arr);
        int i=0;
        i=arr[arr.length/2];
        System.out.print(i);
    }
}
