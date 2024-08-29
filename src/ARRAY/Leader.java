package ARRAY;

public class Leader {
    public static void main(String[] args) {
        int[] arr={1,2,13, 5,3,3};
        int max=Integer.MIN_VALUE;

        leader(arr,max);

    }
    public static void leader(int []arr,int max){
        for (int i = arr.length-1; i >0; i--) {
            if (arr[i]>max){
                max=arr[i];
                System.out.print(" "+max);


            }

        }
    }
}
