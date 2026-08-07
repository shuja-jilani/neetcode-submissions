class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< strs.size(); i++){
            sb.append(strs.get(i).length() + strs.get(i));
        }
       return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        char[] arr = str.toCharArray();
        if(arr.length == 0){return strs;}
        int j = arr[0] - '0' + 1;
        int i =1;
        while(j<=str.length()+1){
            strs.add(str.substring(i,j));
            i = j+1;
            if(j>= str.length()){
                break;
            }
            j = j + (arr[j] - '0') + 1;
        }
        
//5hello6worldi4word 17 13+4+1
        // for(int i =0 ; i< arr.length; i++){
        //     if(arr[i]=='^'){
        //         strs.add(str.substring(j,i));
        //         j = i+1; 
        //     }
        // }
        return strs;
    }
}
