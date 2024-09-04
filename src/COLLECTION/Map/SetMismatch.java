package COLLECTION.MAP;

import java.util.HashMap;
import java.util.Map;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = set(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }

    public static int[] set(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int duplicate = -1;  // Declare outside the loop

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                duplicate = nums[i];  // Store the duplicate number
            } else {
                map.put(nums[i], i);
            }
        }

        int n = nums.length;
        int sum = 0;
        int sumOfAll = n * (n + 1) / 2;
        for (int num : nums) {
            sum += num;
        }

        int missingNum = sumOfAll - (sum - duplicate);  // Calculate missing number
        return new int[]{duplicate, missingNum};  // Return the result array
    }
}
