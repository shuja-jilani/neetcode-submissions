class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int l =0; 
        int tempCount = 0;
        HashSet<Character> seen = new HashSet<>();
        for(int r =0; r< s.length(); r++){
            if(!(seen.contains(s.charAt(r)))){
                tempCount++;
                seen.add(s.charAt(r));
            }
            else{
                while(seen.contains(s.charAt(r))){
                    seen.remove(s.charAt(l));
                    l++;
                    tempCount--;
                }
                seen.add(s.charAt(r));
                tempCount++;
            }
            count = Math.max(count,tempCount);

        }
        return count;
    }
}
