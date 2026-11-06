class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int len = s.length();
        while(i<len && s.charAt(i)==' ')
        i++;
        int sign = 1;
        if(i<len && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        else if(i<len && s.charAt(i)=='+'){
            i++;
        }
        int num = 0;
        while(i<len && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int dig = s.charAt(i) - '0';
            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && dig>7)){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            num = (num*10) + dig;
            i++;
        }
        return num*sign;
    }
}
