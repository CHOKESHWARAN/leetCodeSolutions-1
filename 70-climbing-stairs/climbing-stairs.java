class Solution {
    public int climbStairs(int n) {
        if(n<=3)
          return n;
        int f=1;
        int s=2;
        int i=3;
        while(i<=n){
            int c=f+s;
            f=s;
            s=c;
            i++;
        }
        return s;
    }
}