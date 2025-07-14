class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp = x;
        if(x<0) return false;
        else{
            while(temp!=0){
                rev *= 10;
                rev += temp%10;
                temp /= 10;
            }return (x==rev);
        }
    }
}
