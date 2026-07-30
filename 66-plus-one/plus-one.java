class Solution {
    public int[] plusOne(int[] d) {
        int c = 0;

        for (int i = d.length - 1; i >= 0; i--) {

            if (i == d.length - 1) {
                c = c + d[i] + 1;
                d[i] = c % 10;
                c = c / 10;
            } 
            else {
                c = c + d[i];
                d[i] = c % 10;
                c = c / 10;
            }
        }
        if (c == 1) {
            int[] ans = new int[d.length + 1];

            ans[0] = c;

            for (int i = 0; i < d.length; i++) {
                ans[i + 1] = d[i];
            }

            return ans;
        }

        return d;
    }
}