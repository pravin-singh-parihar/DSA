package Array;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,6,7,4};

        for (int i = 0; i<arr.length ; i++) {
            for (int j=i+1 ; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);

                }
                }
            }

        }
}
