class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // thik h itna smjh a rha h ki jo gaadi sabse aage h usse zyda speed nahi ho skti aur end me sabko uske sath ya usse piche hi chalna hoga, to approach ye h ki positions ko descending way me order krdia aur speed unke sath laga di in a 2d array, fir humne ek ek krke unka time nikala, ab jo aage h agar wo dhire jara h uske piche wale se to wo dono ek hi fleet me ajaenge but agar piche wala dhire h aage wale se to wo ek alag fleet banegi to usko bhi stack me daldo, agar koi piche wala (qki hum array pe loop kr rhe h based on descending order of distance) to jo piche wala agar tez h age wale se to usko stack me nahi dalenge qki wo already age wale ke sath fleet me judega and hence wo fleet already stack me present h and the size of the stack will become the total no of fleets
        int[][] cars = new int[position.length][2];
        for(int i = 0; i< position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        // Arrays.sort(cars, (a,b) -> b[0] - a[0]);
        Arrays.sort(cars, (a,b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for(int i =0; i< position.length; i++){
            double time = (double)(target - cars[i][0]) / cars[i][1];
            if(stack.isEmpty() || time > stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();
    }
}
