class Solution {
    public String addBinary(String a, String b) {

        int i=a.length()-1;
    int j=b.length()-1;
    int c=0;

        StringBuilder ans=new StringBuilder();

        while (i>=0||j>=0||c==1){

            int s=c;
            if(i>=0){
                s=s+(a.charAt(i)-'0');
                i--;
            }
            if (j >= 0) {
                s=s+(b.charAt(j)-'0');
                j--;
            }
             ans.append(s%2);
                    c=s/2;
        
        }
         return ans.reverse().toString();
    }}
