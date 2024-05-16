package array;

public class RevarseArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        RevarseArray.revarse(arr);
    }
   static void revarse(int arr[]){
       for (int i = arr.length-1; i >=0 ; i--) {
           System.out.println(arr[i]);
       }
   }

    public static class PivotIndex {
    }
}
