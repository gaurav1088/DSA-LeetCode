class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        int a_sum = 0;
        int j = 0;
       
        while (j < nums.length) {
            a_sum = a_sum + nums[j];  // Add the actual number from array
            j++;
        }

        int result = sum - a_sum;
        return result;
    }
}
