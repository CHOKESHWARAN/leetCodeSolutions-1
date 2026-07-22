class Solution:
    def divide(self, di: int, d: int) -> int:
        s=di/d
        if(d==-1):
            if(di==-2147483648):
                return (di+1)*-1

        return int(s)    