class Solution:
    def searchRange(self, nums, target):

        n = []

        for i in range(len(nums)):
            if nums[i] == target:
                n.append(i)

        if len(n) > 0:
            return [n[0], n[-1]]

        return [-1, -1]