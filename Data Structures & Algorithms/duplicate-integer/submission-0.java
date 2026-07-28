class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;
        for(int i=0; i < nums.length; i++){
            for(int j=0; j< nums.length; j++){
                if(j == i){continue;}
                if(nums[i]==nums[j]){
                    result = true;
                }
            }
        }
        return result;
    }
}