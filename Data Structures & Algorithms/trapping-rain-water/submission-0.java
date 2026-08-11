class Solution {
    public int trap(int[] height) {
        // we need to know the local heights around the current index and pick the minimum of those two to know the qty of water trapped at this current index.
        int total = 0;
        int[] l = new int[height.length];
        int[] r = new int[height.length];
        int currentMaxLeft = height[0];
        int currentMaxRight = height[height.length-1]; 
        for(int i =1 ; i < height.length; i++){
           l[i] = Math.max(currentMaxLeft, height[i]);
           currentMaxLeft = Math.max(currentMaxLeft, height[i]);
        }
        for(int i = height.length-2; i>=0 ; i--){
            r[i] = Math.max(currentMaxRight, height[i]);
            currentMaxRight = Math.max(currentMaxRight, height[i]);
        }
        for(int i = 0 ; i<height.length; i++){
            int tempWater = Math.min(l[i], r[i]) - height[i];
            if(tempWater > 0 ){
                total += tempWater;
            }
        }
        return total;
    }
}
