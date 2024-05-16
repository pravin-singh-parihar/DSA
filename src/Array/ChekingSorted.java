package Array;


public class ChekingSorted {
    public static void main(String[] args) {
   int arr[]={10,20,30,40,50,};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if (arr[i]<arr[j]){
                    System.out.println("Array is sorted ");
                }
                else
                {
                    System.out.println("Array is unsorted array");
                }

            }

        }

    }
}
