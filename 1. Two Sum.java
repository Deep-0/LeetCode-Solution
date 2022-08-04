class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 2; i++) {
            int sum = 0;
            for (int j = i+1; j <= nums.length-1; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[] { i, j };
                }
             }
        }
        return new int[] { -1, -1 }; 
    }
}
