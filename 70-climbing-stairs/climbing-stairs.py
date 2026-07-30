class Solution:
    def climbStairs(self, n):

        if n <= 2:
            return n

        first = 1
        second = 2
        i = 3

        while i <= n:

            current = first + second

            first = second
            second = current

            i += 1

        return second