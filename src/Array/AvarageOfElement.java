package Array;

public class AvarageOfElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int avr=0;
        for (int i = 0; i <arr.length ; i++) {
            avr+=arr[i];
        }
        System.out.println(avr/6);
    }
}
