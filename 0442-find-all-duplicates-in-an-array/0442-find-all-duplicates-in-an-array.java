class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=Math.abs(nums[i]);
            if(nums[n-1] < 0){
                res.add(n);
            }
            else{
                nums[n-1]= -nums[n-1];
            }
        }
        return res;
    }
}