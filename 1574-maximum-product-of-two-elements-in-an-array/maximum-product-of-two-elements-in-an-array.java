class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length<=1)
            return nums[0];
        
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
                
            }
        }
        
                int t=nums[nums.length-1]-1;
                int t2=nums[nums.length-2]-1;
                return t*t2;
    }
}