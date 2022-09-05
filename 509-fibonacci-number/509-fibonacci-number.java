class Solution {
    public int fib(int n) {
        /*top down approach (memoization)
        dp=recursion + caching     */
        if(n<=1)
            return n;
        if(n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}