import java.util.ArrayList;

class Solution {
    public int[] searchRange(int[] nums, int target) {

        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                n.add(i);
            }
        }

        if (n.size() > 0) {
            return new int[]{n.get(0), n.get(n.size() - 1)};
        }

        return new int[]{-1, -1};
    }
}