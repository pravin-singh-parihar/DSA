package ARRAY;

import java.util.Arrays;

public class SortColurs {
    public static void main(String[] args) {
        int nums[]={2,1,0,1,1,2,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
        public static void sortColors(int[] nums) {
            int low=0;
            int mid=0;
            int high=nums.length-1;

            while(mid<=high){
                if(nums[mid]==0){
                    int temp=nums[mid];
                    nums[mid]=nums[low];
                    nums[low]=temp;
                    low++;
                    mid++;

                }
                else if(nums[mid]==1){
                    mid++;
                }
                else{
                    int temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                }
            }
        }
    }

