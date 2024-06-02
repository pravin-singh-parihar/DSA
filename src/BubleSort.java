import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int []arr={10,30,2,55,60,20};
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  bubleSort(int []arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }
}
