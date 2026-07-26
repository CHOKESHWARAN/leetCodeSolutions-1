class Solution:
    def countAndSay(self, n: int) -> str:
        if n <= 0:
            return ""
        
        result = "1"
        
        for _ in range(1, n):
            current = []
            count = 1
            
            for j in range(len(result)):
                 if j + 1 < len(result) and result[j] == result[j + 1]:
                    count += 1
                 else:
                     current.append(str(count))
                     current.append(result[j])
                     count = 1 
            result = "".join(current)
            
        return result