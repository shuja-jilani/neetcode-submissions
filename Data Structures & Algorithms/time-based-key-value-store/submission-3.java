class TimeMap {
    // To isme humne ek key value pair object store krne ke liye alag se custom generic class bna li, qki java me hoti nahi h, ab humara jo main map h, usme ek key ke against hum ek list store krenge of those pairs, pairs ki list, aur un pairs me jo key h wo timestamp h aur value jo value ayi h wo h, ab main baat ye h ki ques me bola h jo timestamps ayenge wo increasing honge mtlb sorted, aur sorted mtlb binary search lag jaegi unpe, bas, baki sab java syntax ka khel h, to kra ye ki get me us key ki list utha li aur us list jo array list h uspe binary search laga diya aur mid ke timestamp ko apne parameter wale timestamp se compare kra diya, agar chota h to badiya, result update krdo, aur right me check kro, chota nahi h to left me check kro bas.
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
