class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //monotonic queue, optimum On solution, the idea is simple 2 alag alag chizen h , ek to nums array, aur ek h deque, to double ended queue me hum rakhenge indices, aur wo honge ascending order me hi, mtlb jo element nums me baad me aya uska index bhi queue me bad me hi ayga, ab logic ye h ki pehle humne ek element dala queue me(mtlb uska index dala), fir jab dusra aya to wo usse chota hona chahiye tabhi hum queue me dalenge, wrna agar wo naya wla bda h usse jo usse pehele dala gya tha, to jo usse pehle dala gya tha usko nikalna padega yani remove last, fir kul milake mtlb ye h ki agar koi naya element aya jo pehle wale kuch elements ya sare elements se bda h to fir jab tak wo window me rahega wohi max element hoga aur jese hi l++ krte hue hum age bad jaenge usse to usko bhi window se removeFirst krdenge, and over all jo max number h wo humesha humare queue me front par rhega yani getFirst. 
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
