class Solution:
    def majorityElement(self, nums: List[int]) -> int:
      m=0
      c=0
      for n in nums:
        if(c==0):
            m=n
        if(m==n):
            c+=1
        else:
            c-=1
      return m        
