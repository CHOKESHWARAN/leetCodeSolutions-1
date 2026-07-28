class Solution:
    def combinationSum2(self, candidates: list[int], target: int) -> list[list[int]]:
        result = []
        
        candidates.sort()

        def backtrack(remaining: int, start: int, current: list[int]):
             
            if remaining == 0:
                result.append(list(current))
                return

            for i in range(start, len(candidates)):
             
                if candidates[i] > remaining:
                    break
 
                if i > start and candidates[i] == candidates[i - 1]:
                    continue
 
                current.append(candidates[i])
                backtrack(remaining - candidates[i], i + 1, current)
                current.pop()  
        backtrack(target, 0, [])
        return result