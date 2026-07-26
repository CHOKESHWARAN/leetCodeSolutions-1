class Solution:
    def combinationSum(self, candidates: list[int], target: int) -> list[list[int]]:
        result = []

        def backtrack(remain, start, current):
            if remain == 0:
                result.append(list(current))
                return

            for i in range(start, len(candidates)):
                if candidates[i] <= remain:
                    current.append(candidates[i])
                    backtrack(remain - candidates[i], i, current)
                    current.pop()

        backtrack(target, 0, [])
        return result