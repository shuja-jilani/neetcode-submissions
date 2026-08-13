class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //pseudo: okay so we will create a freq map for s1, and then we will slide the window in s2, and create freq map for chars in the window, and if the maps match voila.
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> checkMap = new HashMap<>();
        for(char c: s1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int l =0;
        for(int r =0; r< s2.length(); r++){
            if(r-l+1 > s1.length()){
                checkMap.put(s2.charAt(l), checkMap.get(s2.charAt(l))-1);
                if(checkMap.get(s2.charAt(l))==0) checkMap.remove(s2.charAt(l));
                l++;
            }
            checkMap.put(s2.charAt(r), checkMap.getOrDefault(s2.charAt(r),0)+1);
            if(map.equals(checkMap)) return true;
        }
        return false;
    }
}
