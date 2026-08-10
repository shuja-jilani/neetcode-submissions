class Solution {
    public int maxArea(int[] heights) {
        int area = 0; 
        int left = 0;
        int right = heights.length - 1;
        while(left < right){
            int tempArea = Math.min(heights[left],heights[right]) * (right-left);
            area = Math.max(area, tempArea);
            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
        }
        // for(int i = 0; i< heights.length - 1; i++){
        //     for(int k = i + 1; k < heights.length; k++){
        //         int tempArea = Math.min(heights[i],heights[k]) * (k-i);
        //         area = Math.max(area, tempArea);
        //     }
        // }
        return area;
    }
}
