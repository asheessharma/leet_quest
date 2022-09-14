class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int pos=-1;
        int sum=0;
        int curr=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            curr+=diff;
            sum+=diff;
            if(curr<0){
                curr=0;
                pos=i;
            }
        }
        if(sum>=0)
            return pos+1;
        return -1;
    }
}