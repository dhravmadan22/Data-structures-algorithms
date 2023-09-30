lass Solution {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length-1;
        int maxHeight = 0;

        while( leftPointer < rightPointer ){
            int currHeight = Math.min(height[leftPointer], height[rightPointer]) *(rightPointer - leftPointer);
            maxHeight = Math.max(maxHeight,currHeight);

            if(height[rightPointer] < height[leftPointer]) rightPointer--;
            else leftPointer++;
        }

        return maxHeight;
    }
}