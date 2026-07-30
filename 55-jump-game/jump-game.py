class Solution:
    def canJump(self, nums):
        k = 0
        i = 0

        while i < len(nums):

            if i > k:
                return False

            k = max(k, i + nums[i])

            if k >= len(nums) - 1:
                return True

            i += 1

        return True