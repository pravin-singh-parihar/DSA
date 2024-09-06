package RECURSION;



public class Sort {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        System.out.println(sorted(arr,0,arr.length-1));
    }
    public static boolean sorted(int[] nums,int i,int j){
        if (i<=j){
            if (nums[i]<=nums[j]){
                return false;
            }else {
                return true;
            }
        }
        return sorted(nums,i+1,j-1);
    }
}
