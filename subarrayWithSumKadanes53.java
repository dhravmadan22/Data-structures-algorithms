lass Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer. MIN_VALUE;
        int sum = 0;
        for(int i =0; i<nums.length;i++){
            sum = sum + nums[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;

        }
        return max;
    }

    // Variation if length is required as well
    // public int maxSubArray(int[] nums) {
    //     int max = Integer. MIN_VALUE;
    //     int sum = 0;
    //     int start = 0;
    //     int end = 0;
    //     for(int i =0; i<nums.length;i++){
    //         if(sum == 0) start = i;
    //         sum = sum + nums[i];
    //         if(sum > max) {
    //             max = sum;
    //             end = i;
    //         }
    //         if(sum < 0) sum = 0;

    //     }
    //     System.out.println("Start: "+start+" End: "+ end);
    //     return max;
    // }
}

// Kadanes algorithm

// Subarray with maximum sum and length of the subarray