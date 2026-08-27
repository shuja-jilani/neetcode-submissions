class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        for(int i = 0; i< nums.length; i++){
            ans = (nums[i]==target) ? i : ans; 
        }
        return ans;
    }
}
