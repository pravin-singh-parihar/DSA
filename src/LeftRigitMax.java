public class LeftRigitMax {
    public static void main(String[] args) {
        // Element right side greater and left side smaller
        int[] arr = {4, 2, 5, 7};
        int result = findElement(arr);
        System.out.println(result);
    }

    public static int findElement(int arr[]) {
        int leftMax[] = new int[arr.length];
        int rightMin[] = new int[arr.length];

        // Initialize leftMax
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            // Fetch the maximum value on the left side
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        }

        // Initialize rightMin
        rightMin[arr.length - 1] = Integer.MAX_VALUE;
        for (int i = arr.length - 2; i >= 0; i--) {
            // Fetch the minimum value on the right side
            rightMin[i] = Math.min(arr[i + 1], rightMin[i + 1]);
        }

        // Find the element that is greater than leftMax and less than rightMin
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= leftMax[i] && arr[i] < rightMin[i]) {
                return arr[i]; // Return the element that satisfies the condition
            }
        }

        return -1; // Return -1 if no such element is found
    }
}
