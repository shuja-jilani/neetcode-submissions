class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] prefix = new int[nums.length];
        // int[] suffix = new int[nums.length];
        int[] res = new int[nums.length];
        Arrays.fill(res,1);
        // Arrays.fill(suffix,1);
        int product = 1;
        for(int i = 1 ; i< nums.length; i++){
            res[i] = product * nums[i-1];
            product = product * nums[i-1];
        }
        product = 1; 
        for(int i = nums.length-2; i >= 0 ; i--){
            product = product * nums[i+1];
            res[i] = res[i] * product;
        }
        // for(int i = 0; i < nums.length; i++){
        //     res[i] = prefix[i]*suffix[i];
        // }
        return res;
    }
}  
