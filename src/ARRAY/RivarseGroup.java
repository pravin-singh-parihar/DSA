package ARRAY;


import java.util.ArrayList;

public class RivarseGroup {
    public static void main(String[] args) {
        ArrayList<Long> arr=new ArrayList<>();
        arr.add(1l);
        arr.add(2l);
        arr.add(3l);
        arr.add(4l);
        arr.add(5l);
        int k=3;
        reverseInGroups(arr,k);
        System.out.println(arr);

    }

        // Function to reverse every sub-array group of size k.
      static   void reverseInGroups(ArrayList<Long> arr, int k) {
            int n = arr.size();
            for (int i = 0; i < n; i += k) {
                // Calculate the end index for the current group
                int end = Math.min(i + k - 1, n - 1);
                reverseArray(arr, i, end);
            }
        }

        // Helper function to reverse elements of the ArrayList between indices i and j
       static void reverseArray(ArrayList<Long> arr, int i, int j) {
            while (i < j) {
                Long temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                i++;
                j--;
            }
        }
    }


