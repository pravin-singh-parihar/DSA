package Array;

public class MaxMiumElement {
    public static void main(String[] args) {
        int arr[]={10,87,88,86,2,1};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
        {
        for (int j = 0; j < arr.length; j++) {
            if (smax<max && smax!=max)
                smax=arr[j];

        }
        System.out.println(smax);
    }
}
}