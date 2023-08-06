class Solution {
    public int pivotIndex(int[] nums) {
        // get sum of the array
        int sum = 0;
        for (int num : nums)
            sum += num;

        for (int i = 0; i < nums.length; i++) {
            // Sum of left and right side
            int leftSum = 0;
            int rightSum = 0;

            // Calculate left sum using loop
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Remove current index and left sum from sum to get right sum
            rightSum = sum - nums[i] - leftSum;

            // If this is the pivot index, return the index
            if (leftSum == rightSum) {
                return i;
            }
        }

        // No pivot index found, return -1
        return -1;
    }
}