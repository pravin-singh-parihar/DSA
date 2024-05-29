package Array;

public class EualibrimIndex {
    public static void main(String[] args) {
        int[] nums={1,3,5,2,2};
        eualibrim(nums);



    }
    public static int eualibrim(int []nums){
        int sum=0;
        for (int i = 0; i < nums.length ; i++) {
            sum+=nums[i];


        }
        int ls=0;
        for (int i=0;i<nums.length;i++)
        {
            int res=sum-ls-nums[i];
            if (res==ls)
            {

                return i+1;//+1 Becuse index is 1 base
            }
            else
            {
                ls+=nums[i];

            }
        }
        return -1;
    }
}
