import java.util.*;

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        // int maxLength = 0;

        // Brute Force

        // for(int i =0; i< a.length; i++){
        //     long sum = 0;
        //     for(int j=i;j<a.length;j++){
        //         // subarray
        //         sum = sum + a[j];

        //         if(sum == k) {
        //         maxLength = Math.max( maxLength, j - i + 1  );
        //         }
        //     }
            
        // }


        // hashing(better approach)

        // int n = a.length;

        // Map<Long, Integer> prefixSum = new HashMap<>();
        // long sum = 0;
        // for(int i =0; i< n ;i++){
        //     sum = sum +a[i];

        //     if(sum == k) maxLength = Math.max(maxLength, i+1);

        //     long rem = sum - k;
            
        //     if(prefixSum.containsKey(rem)){
        //         maxLength = Math.max(maxLength, i - prefixSum.get(rem) );
        //     }

        //     if(!prefixSum.containsKey(sum)){
        //         prefixSum.put(sum,i);
        //     }
        // }

        // Optimal approach

        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
}