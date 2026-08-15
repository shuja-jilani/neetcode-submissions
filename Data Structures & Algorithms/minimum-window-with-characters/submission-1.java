class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int have =0;
        int need = map.size();
        String ans = "";
        Map<Character, Integer> checkMap = new HashMap<>();
        int l = 0;
        for(int r = 0 ; r < s.length(); r++){
            char right = s.charAt(r);
            checkMap.put(right,checkMap.getOrDefault(right,0)+1);
            if(map.containsKey(right) && map.getOrDefault(right,0).equals(checkMap.get(right))) have++;
            
            while(have == need){
              String tempAns = s.substring(l,r+1);
                if(ans.isEmpty() || tempAns.length() < ans.length()){
                    ans = tempAns;
                }
                
                char left = s.charAt(l);
                checkMap.put(left, checkMap.get(left)-1);
                if(checkMap.get(left)==0){
                    checkMap.remove(left);
                }
                if(map.containsKey(left) && checkMap.getOrDefault(left,0) < map.get(left)) have--;
                l++;
            }
        }
        return ans;
    }
}
