class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int n : nums){
            ans = Math.min(ans, n);
        }
        return ans;
    }
}
