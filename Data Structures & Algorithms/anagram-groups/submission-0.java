class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            res.putIfAbsent(str, new ArrayList<>());
            res.get(str).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
