class Solution {
    public int search(int[] nums, int target) {
        // okay so this soln is done without finding out the pivot, so the approach is that, jo array hai wo 2 tukdo me h, there is a left sorted part jo ki rotate hokr pohucha h , and there is a right sorted part, jo us array ki shuruat h, so we will find a mid, and then we will check ke wo mid konse portion pr h, agar wo left wale par h to jo l h wo m se chota hoga, and agar wo right pe h to l m se bda hoga, and agar mid left part pr h to fir hum dekhenge ki kya target humara mid se bda h ya fir target humara l se bhi chota h , in dono case me l = mid +1, and nhi to r will shift, and similarly for right sorted case, agar target mid se chota h ya fir, r se bhi bada h to r = mid -1.
        int l = 0 , r = nums.length-1; 
        while(l <= r){
            int mid = (l+r)/2;
            if(nums[mid]== target){
                return mid;
            }
            if(nums[l] <= nums[mid]){
                if(nums[l] > target || target > nums[mid]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            else{ //right sorted array nums l > nums mid
                if(target < nums[mid] || target > nums[r]){
                    r = mid - 1;
                }
                else{
                    l = mid+1;
                }
            }
        }
        return -1;
    }
}
