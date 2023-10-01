class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpoint = -1;
        for(int i = n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                breakpoint = i;
                break;
            }
        }
        
        if(breakpoint == -1){
            reverse(nums,0,n-1);
            return;
        }
        int smallerIndex = breakpoint+1;
        for(int i = breakpoint+1; i<n;i++){
            if(nums[i] > nums[breakpoint]){
                smallerIndex = i;
            }
        }
        int t = nums[smallerIndex];
        nums[smallerIndex] = nums[breakpoint];
        nums[breakpoint] = t;

        // for(int i =0;i<n;i++){
        //     System.out.print(nums[i] + " ");
        // }
        reverse(nums, breakpoint+1,n-1);

    }
    static void reverse(int []arr, int start, int end)
    {   
        int temp;
           
        while (start < end)
        {
            temp = arr[start]; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
    }
}