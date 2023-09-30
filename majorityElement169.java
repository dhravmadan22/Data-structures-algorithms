class Solution {
    
    // O(n) time complexity with, O(n) extra space

    // public int majorityElement(int[] nums) {
    //    HashMap<Integer,Integer> map = new HashMap<>();

    //    int n =nums.length;
    //    for(int i = 0; i<n ;i++){
    //        map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
    //    }
    //    for(int i = 0; i<n ;i++){
    //        if(map.get(nums[i]) >= Math.floor(n/2)) return nums[i]; 
    //    }
    //    return 0;
    // }

    // O(n) time complexity with, O(1) extra space

    public int majorityElement(int[] nums) {
        // int n = nums.length;
        int Element=nums[0];
        int count =0;

        for(int i = 0; i<nums.length;i++){

            if(count == 0) Element = nums[i];
            if(nums[i] == Element) count++;
            else if(nums[i] != Element)count--;
        }

        return Element;
    }
}

// Intution
// If the element is a majority element then for every occurence of the majority element there is a minority element present