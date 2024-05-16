package Array;
import java.util.Arrays;

public class RotateAtRight {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7};
        int k=11;
        k = k%array.length;
        reverseArray(array,0,array.length-1);
        reverseArray(array,0,k-1);
        reverseArray(array,k,array.length-1);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverseArray(int array[],int i,int j) {
        while(i<=j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
