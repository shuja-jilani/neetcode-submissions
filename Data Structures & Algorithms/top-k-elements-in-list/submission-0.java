class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // iterate over all and put them as keys with values as their count ++, after that
        //we will get all values and sort them descending and then get k values 
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            map.putIfAbsent(nums[i],0);
            map.put(nums[i],map.get(nums[i]) + 1);
        }
        List<Map.Entry<Integer,Integer>> arrayList = new ArrayList<>(map.entrySet());
        arrayList.sort((b,a) -> a.getValue().compareTo(b.getValue()));

        int res[] = new int[k];
        for(int i =0 ; i< k ; i++){
            Map.Entry<Integer,Integer> entry = arrayList.get(i);
            res[i]= entry.getKey();
        }
        return res;

    }
}
