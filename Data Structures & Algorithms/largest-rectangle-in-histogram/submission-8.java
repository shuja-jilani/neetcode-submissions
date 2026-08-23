class Solution {
    public int largestRectangleArea(int[] heights) {
        //initial idea ye h ki current bar ko height maan ke width find out krni h, agr left aur right me humse unche log h to width extend hogi wrna nahi 
        // pseudo code brute force for( every height) { while left and right are taller or equal to my height , width will extend, and we will constantly update the max area}
        // optimisation by me, prefix and suffix arrays to keep track of prev and forward lesser height kahan pe h(mtlb indices) usi se area nikalenge formula for area = current height x( r from suffix - l from prefix -1)
        // final optimisation, one stack pass to logic ye h ki monotonic stack yani ke ascending order ka stack bna rhe h, to jo agla element h agar wo bda h to stack me daldo, fir agar usse chota agya to jo ye chota aya h ye us bade wale ki right boundary h aur qki ascending order me h to jese hi bade wale ko pop krenge to stack peek wala usi bade wale ki left boundary ban jaega hence area nikal lenge height x (right - left - 1) aur agar end tk pohuch gaye yani i == n to fir jo bhi stack me bache h un sabka hisab hoga.  
        int area = 0;
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        for(int i =0 ; i<= n; i++){
            while(!stack.isEmpty() && (i == n || heights[i] <= heights[stack.peek()])){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                area = Math.max(area, height * width);
            }
            stack.push(i);
        }
        return area;
    }
}
