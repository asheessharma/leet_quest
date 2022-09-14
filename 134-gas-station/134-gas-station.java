class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int pos=-1;
        int sum=0;
        int curr=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];//to complete a round --> total of diff in gas&cost (all station)>0
            curr+=diff;
            sum+=diff;
            if(curr<0){//if current is negative then store position of that station
                curr=0;
                pos=i;
            }
        }
        if(sum>=0)
            return pos+1;//starting station= station whose diff(gas - cost)>0 
        return -1;
    }
}