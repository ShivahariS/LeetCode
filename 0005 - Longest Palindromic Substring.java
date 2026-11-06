class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 0)
            return "";
        int subLen = len;
        int i,j;
        do{
            i = 0;
            j = subLen-1;
            while(j<=len-1){
                if(checkPalindrome(s.substring(i,j+1)))
                return s.substring(i,j+1);
                i++; j++;
            }
            subLen--;
        }while(subLen>0);
        return s.substring(0,1);
    }

    public boolean checkPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++; j--;
        }
        return true;
    }
}
