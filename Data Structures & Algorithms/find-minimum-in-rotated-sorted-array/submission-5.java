class Solution {
    public int findMin(int[] nums) {
        //thik h to logic ye h ki jo rotated part front me aya h usme to min element hoga nahi, to mid agar leftest element se bada h to min element aur right ki trf hoga, aur agar mid leftest element se chota h mtlb rotation mid tk nahi ayi h, to r= mid -1 krke left kki trf search kro 
        // the thing is same logic can be applied by comparing wiht the right most element
        int ans = nums[0];
        int l = 0; 
        int r = nums.length-1;
        while(l<=r){
            if(nums[l]<nums[r]){
                ans = Math.min(ans,nums[l]);
                break;
            }
            int mid = l + (r-l)/2;
            ans = Math.min(ans, nums[mid]);
            if(nums[mid] >= nums[r]){
                l = mid + 1;
            }
            else{
                r = mid -1 ;
            }
        }
        return ans;
    }
}
