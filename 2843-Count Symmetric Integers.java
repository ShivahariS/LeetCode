class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s = String.valueOf(i);
            int len = s.length();
            if(len%2!=0) continue;
            int n=len/2;
            int ls = 0;
            int rs = 0;
            for(int j=0;j<n;j++){
                ls += s.charAt(j)-'0';
                rs += s.charAt(j+n)-'0';
            }
            if(ls==rs) count++;
        }return count;
    }
}
