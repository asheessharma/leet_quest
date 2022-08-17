class Solution {
    public int reverse(int x) {
        boolean isneg=x<0;
        if(isneg){
            x=x*-1;
        }
        long rev=0;
        while(x>0){
            rev=rev*10+(x%10);
            x/=10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return isneg ? (int)rev*-1 : (int)rev;
    }
}