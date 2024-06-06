import java.util.Arrays;

public class SortColurs {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }     public static void sortColors(int[] nums) {
                for(int i=0;i<nums.length;i++){
                    int val =nums[i];
                    int j=i-1;
                    while(j>=0 && nums[j]> val){
                        nums[j+1]=nums[j];
                        j--;

                    }
                    nums[j+1]= val;
                }
            }
        }


