import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int key=4;
        int index=binarySearch(arr,key);
        System.out.println(index);
    }
    public static int binarySearch(int []arr,int key){
        int high=arr.length-1;
        int low=0;
        for (int i = 0; i < arr.length; i++) {
            int mid=(low+high)/2;
            if (arr[i]==key){
                return i;

                
            } else if (arr[i]>key) {
                low=mid+1;

            }else {
                high=mid-1;
            }

        }
        return -1;
    }
}
