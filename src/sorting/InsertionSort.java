package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={1,5,3,6,10,50,13};
        insertionSort(arr);
    }
    public static void insertionSort(int []arr){
        for (int i = 0; i <arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp ){
                arr[j+1]=arr[j];
            }
              arr[j+1]=temp;
        }
    }
}
