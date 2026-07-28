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
    int i = 0;

    while (i < str.length()) {

        int delim = str.indexOf('#', i);

        int length = Integer.parseInt(
            str.substring(i, delim)
        );

        int start = delim + 1;
        int end = start + length;

        strs.add(str.substring(start, end));

        i = end;
    }

    return strs;
    }
}
