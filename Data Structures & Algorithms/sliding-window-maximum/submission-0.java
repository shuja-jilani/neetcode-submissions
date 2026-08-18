class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //monotonic queue, optimum On solution, the idea is simple
        Deque<Integer> queue = new ArrayDeque<>();
        int l = 0, r= 0;
        int[] res = new int[nums.length -k + 1];
        while (r< nums.length){
            while(!queue.isEmpty() && nums[queue.getLast()] < nums[r]){
                queue.removeLast();
            }
            queue.addLast(r);

            if(l > queue.getFirst()){
                queue.removeFirst();
            }

            if(r+1 >= k){
                res[l] = nums[queue.getFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}
