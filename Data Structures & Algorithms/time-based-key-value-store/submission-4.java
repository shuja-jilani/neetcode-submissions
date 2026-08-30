class TimeMap {
    // to isme kra ye h ki jo treemap hota h uski keys increasing sorted hoti h, isliye usko laga diya, aur jo uske retrieval methods hote h wo log n me searching krte h aise ye ek binary search soln bn gya 
    private Map<String, TreeMap<Integer, String>> m;

    public TimeMap() {
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        m.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!m.containsKey(key)) return "";
        TreeMap<Integer, String> timestamps = m.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }
}
