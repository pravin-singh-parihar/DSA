package Array;

public class PivotIndex {
    public static void main(String[] args) {
        int []arr = {1, 7, 3, 6, 5, 6};
        int index=pivotIndex(arr);
        System.out.print(index);
    }
    public static int pivotIndex(int []arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }
        int ls=0;
        for (int i = 0; i <arr.length ; i++) {
            int res=sum-ls-arr[i];
            if (ls==res){
                return i;
            }
            else
            {
                ls += arr[i];

            }
        }
        return -1;
                    }
                }
