import java.util.Arrays;

public class MoveNegitiveElement {
    public static void main(String[] args) {
        int arr[]={ 1, -1, 3, 2, -7, -5, 11, 6};
        moveNegtive(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveNegtive(int arr[]){
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            if (arr[i]>0){
                i++;
            } else if (arr[j]<0) {
                j--;
            }
            else {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               i++;
               j--;
            }

        }
    }
}
