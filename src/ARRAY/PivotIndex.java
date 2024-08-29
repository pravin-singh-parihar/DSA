package ARRAY;

public class PivotIndex {
    public static void main(String[] args) {
        int[] arr={1,3,7,6,5,6};

        int index=pivotIndex(arr);
        System.out.print(index);
    }
    public static int pivotIndex(int [] arr){
        int Tsum=0;
        for (int i = 0; i <arr.length; i++) {
             Tsum+=arr[i];


        }
        int Tls=0;
        for (int i = 0; i < arr.length; i++) {
            int res=Tsum-Tls-arr[i];
            if (Tls==res){
                return i;
            }
            Tls+=arr[i];
        }
        return -1;
    }
}
