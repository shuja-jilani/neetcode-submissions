class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<temperatures.length; i++){
            if(stack.isEmpty() || temperatures[stack.peek()]>temperatures[i]){
                stack.push(i);
            }
            else{
                //stack.peek < temp i
                while(!stack.isEmpty() && temperatures[i]> temperatures[stack.peek()]){
                    res[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                    stack.push(i);
            }
        }
        return res;
    }
}
