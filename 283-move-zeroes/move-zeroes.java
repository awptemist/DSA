class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // slow pointer for non-zero position

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap only if i and j are different
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}
