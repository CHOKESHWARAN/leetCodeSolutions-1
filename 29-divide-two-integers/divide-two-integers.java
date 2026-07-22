class Solution {
    public int divide(int di, int d) {
         if(d==-1&&di==-2147483648)
            return (di+1)*-1;
      
        int s=di/d;
        return s;
    }
}