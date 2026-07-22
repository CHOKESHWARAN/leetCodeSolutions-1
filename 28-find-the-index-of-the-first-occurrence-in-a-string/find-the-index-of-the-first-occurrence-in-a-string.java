class Solution {
    public int strStr(String h, String n) {
        int hLen = h.length();
        int nLen = n.length();
         if (nLen > hLen) return -1;
        for (int i = 0; i <= hLen - nLen; i++) {
            int match = 1; 
            for (int j = 0; j < nLen; j++) {
                if (h.charAt(i + j) != n.charAt(j)) {
                    match = 0; 
                     break;     
                }
            }
            if (match == 1) {
                return i;
            }
        }

        return -1;  
    }
}