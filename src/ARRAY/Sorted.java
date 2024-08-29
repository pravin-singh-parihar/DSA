package ARRAY;

public class Sorted {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        boolean isTrue=true;
        sorted(arr,isTrue);

    }
    public static void sorted(int []arr,boolean isTrue)
    {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<arr[i+1]){
                isTrue=true;
            }
            else {
                isTrue=false;
                break;
            }

        }
        if (isTrue==true){
            System.out.println("Array is sorted ");
        }
        else {
            System.out.println("Array is unsorted ");
        }
}
}
