class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< strs.size(); i++){
            sb.append(strs.get(i)+ "^");
        }
       return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        char[] arr = str.toCharArray();
        int j = 0;
        for(int i =0 ; i< arr.length; i++){
            if(arr[i]=='^'){
                strs.add(str.substring(j,i));
                j = i+1; 
            }
        }
        return strs;
    }
}
