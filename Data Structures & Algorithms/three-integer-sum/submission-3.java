class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                // if(i!=0) if(nums[i]== nums[i-1]) i++;
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    if(!res.contains(List.of(nums[i],nums[j],nums[k]))){
                        res.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                    }
                    j++; k--;
                }
                else if(sum < 0){
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return res;
    }
}
