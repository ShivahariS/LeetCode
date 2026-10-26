class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            list.add(num); 
        }
        for (int num : nums2) {
            list.add(num); 
        }
        Collections.sort(list);
        int size = list.size();
        if(size%2 != 0){
            return list.get(size/2);
        }
        else{
            return ((double) list.get(size / 2)+ list.get((size / 2) - 1)) / 2;
        }
    }
}
