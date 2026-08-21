class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")){
                    char c = token.charAt(0);
                int top = stack.pop();
                int bottom = stack.pop();
                if(c == '+'){
                    stack.push(bottom + top);
                }
                if(c == '*'){
                    stack.push(bottom * top);
                }
                if(c == '-'){
                    stack.push(bottom - top);
                }
                if(c == '/'){
                    stack.push(bottom / top);
                }
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
