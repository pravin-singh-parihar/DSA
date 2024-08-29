package ARRAY;

public class SecandMax {
    public static void main(String[] args) {
        int[] arr = {1, 10, 4, 50, 43, 56, 78};
        int smax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>smax && arr[i]!=max)
                smax=arr[i];

        }
        System.out.println(smax);
    }

}
