class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seq = new HashSet<>();
        int res = 0;
        for(int n : nums){
            seq.add(n);
        }
        for(int n : seq){
            if(seq.contains(n-1))
            { 
                continue;
            }
            else{
            int consecutive = n+1;
            int tempAns = 1;
            while(seq.contains(consecutive)){
               tempAns++;
               consecutive++; 
            }
            if(tempAns > res) res = tempAns;
        }
        }
        return res;
    }
}
