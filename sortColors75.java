import java.util.*;

public class Main {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
    }

    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

}

// class Solution {
//     public void sortColors(int[] nums) {

//         int zeroPointer = 0;
//         int twoPointer = nums.length-1;
//         for(int i = 0; i<nums.length && i<=twoPointer;){
//             if(nums[i] == 0){
//                 int t = nums[i];
//                 nums[i] = nums[zeroPointer];
//                 nums[zeroPointer] = t;
//                 zeroPointer++;
                
//             }else if(nums[i] == 2){
//                 int t = nums[i];
//                 nums[i] = nums[twoPointer];
//                 nums[twoPointer] = t;
//                 twoPointer--;
//                 continue;
//             }
//             else{

//             }
//                 i++;
//         }
//     }
// }

// Intuition
// Have low mid and high pointers, 0 to low

// [2 0 2 1 1 0 ]
// [0 0 1 1 2 2]