class Solution {
    public int largestRectangleArea(int[] heights) {
        //initial idea ye h ki current bar ko height maan ke width find out krni h, agr left aur right me humse unche log h to width extend hogi wrna nahi 
        // pseudo code brute force for( every height) { while left and right are taller or equal to my height , width will extend, and we will constantly update the max area}
        // optimisation by me, prefix and suffix arrays to keep track of prev and forward lesser height kahan pe h(mtlb indices) usi se area nikalenge formula for area = current height x( r from suffix - l from prefix)
        int area = 0;
        int n = heights.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i =0 ; i< n; i++){
            while(!stack.isEmpty() && heights[stack.peek()]>= heights[i]){
                stack.pop();
            }
            prefix[i] = (stack.isEmpty()) ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i = n-1; i >= 0 ; i--){
            while(!stack.isEmpty() && heights[stack.peek()]>= heights[i]){
                stack.pop();
            }
            suffix[i] = (stack.isEmpty()) ? n : stack.peek();
            stack.push(i);
        }
        // Area 
        int tempArea = 0;
        for(int i =0; i< heights.length; i++){
            tempArea = heights[i] * (suffix[i]-prefix[i] - 1);
            area = Math.max(area, tempArea);
        }
        return area;
    }
}
