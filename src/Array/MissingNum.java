package Array;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,8};
        int n= arr.length;
      MissingNum.missed(arr,n);


    }
    public static void missed (int[] arr, int n){
        int sumOfAll=(n*(n+1))/2;
        int res=0;
        for (int i = 0; i <n-1 ; i++) {
            res=res+arr[i];

        }
        int missNUmber=sumOfAll-res;
        System.out.println(missNUmber);

    }
}
