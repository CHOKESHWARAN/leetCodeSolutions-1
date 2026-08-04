class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int t=nums[0];
        for(int i=0;i<nums.length;i++){

            while(nums[i]!=t){
             ans.add(t);
             t+=1;}
             t+=1;
        }
        return ans;
    }
}