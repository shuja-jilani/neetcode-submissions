class TimeMap {
    private Map<String, List<Pair<Integer, String>>> m;

    public TimeMap() {
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        m.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!m.containsKey(key)) return "";

        List<Pair<Integer, String>> timestamps = m.get(key);
        int l =0 , r = timestamps.size() - 1; 
        String result = "";

        while(l<=r){
            int mid = (l+r)/2;
            if(timestamps.get(mid).getKey() <= timestamp){
                result = timestamps.get(mid).getValue();
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return result;
    }

    private static class Pair<K,V> {
        private final K key;
        private final V value;

        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
        public K getKey(){
            return key;
        }
        
        public V getValue(){
            return value;
        }
    }

}
