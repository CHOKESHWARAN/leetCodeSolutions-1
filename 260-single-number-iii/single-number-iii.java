class Solution {
    public int[] singleNumber(int[] nums) {
         long bitwiseSum = 0;
        for (int num : nums) {
            bitwiseSum ^= num;
        }
         long diffBit = bitwiseSum & (-bitwiseSum);
         int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & diffBit) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[]{a, b};
    }
}