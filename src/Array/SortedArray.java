package Array;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < arr.length;i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    System.out.println("Array is Unsorted array");
                    break;
                }
            }

        }

        System.out.println("Array is sorted array");
    }

    public static class Leaders {
    }
}