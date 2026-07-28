class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< strs.size(); i++){
            sb.append(strs.get(i).length() + "#" + strs.get(i));
        }
       return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        char[] arr = str.toCharArray();
        if(arr.length == 0){return strs;}
        int i =0 ;
        int j = 0;
        int delim = 0;
        while(delim <=str.length()+1){
            delim = str.indexOf('#', i);
            j = Integer.parseInt(str.substring(i,delim));
            strs.add(str.substring(delim+1,delim+1+j));
            i = delim + j+1;
            if(i >= str.length()){
                break;
            } 
        }
        
//5#hello6#worldi4#word 17 13+4+1
        // for(int i =0 ; i< arr.length; i++){
        //     if(arr[i]=='^'){
        //         strs.add(str.substring(j,i));
        //         j = i+1; 
        //     }
        // }
        return strs;
    }
}
