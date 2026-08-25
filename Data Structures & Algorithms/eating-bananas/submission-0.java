class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // mera logic ye h ki smallest pile aur largest pile ki values nikal ke unke bich me binary search laga do, fir jo mid banega usse calculate kro kitne ghante lagre h agar h se kam h to yahi answer h nahi to wahi apna l = mid + 1 ya r = mid - 1
        int maxVal = 0; 
        for(int num : piles){
            maxVal = (num > maxVal) ? num : maxVal;
        }
        int l = 1; 
        int r = maxVal;
        int ans = maxVal;
        while(l<=r){
            int mid = l + (r-l)/2; 
            long totalHours = 0;
            for(int num : piles){
                totalHours += Math.ceil((double) num/mid);
            }
            if(totalHours <= h){
                ans = mid;
                r = mid - 1;
            } 
            else{
                l = mid+1; 
            }
        }
        return ans;
    }
}
