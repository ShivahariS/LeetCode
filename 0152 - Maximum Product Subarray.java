class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int max = 1, min = 1;
        for(int i=0;i<nums.length;i++){
            int tempMax = max;
            int num = nums[i];
            max = Math.max(num, Math.max((num*tempMax),(num*min)));
            min = Math.min(num, Math.min((num*tempMax),(num*min)));
            maxProd = Math.max(maxProd,max);
        }
        return maxProd;
    }
}
