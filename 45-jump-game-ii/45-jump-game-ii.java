class Solution {
    public int jump(int[] nums) {
        int n=nums.length; //top down approach 
      /*  int []dp=new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<=Math.min(n-1,i+nums[i]);j++){
                min=Math.min(min,dp[j]);}
            if(min!=Integer.MAX_VALUE){
                dp[i]=min+1;
            }
        }
        return dp[0]; */
        if(nums==null || n==0)
            return 0;
        int reach=0;
        int lastReach=0;
        int step=0;
        for(int i=0;i<=reach && i<n;i++){
            if(i>lastReach){
                step++;
                lastReach=reach;
            }
            reach=Math.max(reach,i+nums[i]);
        }
        if(reach<n-1)
            return 0;
        return step;
    }
}