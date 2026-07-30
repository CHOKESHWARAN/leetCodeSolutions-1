class Solution {
    public boolean canJump(int[] nums) {

        int k = 0;
        int i = 0;

        while (i < nums.length) {

            if (i > k) {
                return false;
            }

            k = Math.max(k, i + nums[i]);

            if (k >= nums.length - 1) {
                return true;
            }

            i++;
        }

        return true;
    }
}