class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0 ; i< nums.length; i++){
            int ans = 1; 
            for(int j = 0 ; j < nums.length; j++){
                if(j==i){continue;}
                ans = ans * nums[j];
            }
            res[i] = ans; 
        }
        return res;
    }
}  
