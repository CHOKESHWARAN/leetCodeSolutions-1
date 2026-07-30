class Solution {
    public int lengthOfLastWord(String s) {
        int k = 0;
        int l = s.length() - 1;
         while (l >= 0 && s.charAt(l) == ' ') {
            l--;
        }
        while (l >= 0 && s.charAt(l) != ' ') {
            k++;
            l--;
        }

        return k;
    }
}